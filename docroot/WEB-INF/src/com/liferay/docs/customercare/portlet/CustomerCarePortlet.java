package com.liferay.docs.customercare.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.docs.customercare.model.AgentDataEntry;
import com.liferay.docs.customercare.model.CustomerInforEntry;
import com.liferay.docs.customercare.service.AgentDataEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

/**
 * Portlet implementation class CustomerCarePortlet
 */
public class CustomerCarePortlet extends MVCPortlet {
 
	public void addCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws SearchException, SystemException
	{
		String custName = ParamUtil.getString(actionRequest, "custName");
		String custIdentiication = ParamUtil.getString(actionRequest, "custIdentiication");
		String phoneNumber = ParamUtil.getString(actionRequest,"phoneNumber");
		String address = ParamUtil.getString(actionRequest,"address");
		String service = ParamUtil.getString(actionRequest,"service");
		String reason = ParamUtil.getString(actionRequest,"reason");
		String comment = ParamUtil.getString(actionRequest,"comment");
		String customerInforEntryId = ParamUtil.getString(actionRequest,"customerInforEntryId");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		if(!Validator.isName(custName))
		{
			// 
		}
		if(!Validator.isAddress(address))
		{
			//
		}
		if(!Validator.isPhoneNumber(phoneNumber))
		{
			
		}
		try
		{
			CustomerInforEntry customerInfor = null;
//			if(Validator.isNull(customerInforEntryId))
//			{		
				long id = CounterLocalServiceUtil.increment();
				customerInfor = CustomerInforEntryLocalServiceUtil.createCustomerInforEntry(id);
				customerInfor.setGroupId(user.getGroupId());
				customerInfor.setCompanyId(user.getCompanyId());
				customerInfor.setCreateDate(new Date());
				customerInfor.setUserId(user.getUserId());
				customerInfor.setUserName(user.getScreenName());
				customerInfor.setCustName(custName);
				customerInfor.setCustIdentiication(custIdentiication);
				customerInfor.setPhoneNumber(phoneNumber);
				customerInfor.setAddress(address);
				customerInfor.setService(service);
				customerInfor.setReason(reason);
				customerInfor.setComment(comment);
				CustomerInforEntryLocalServiceUtil.addCustomerInfor(customerInfor);
//			}
//			else 
//			{
//				customerInfor = CustomerInforEntryLocalServiceUtil.getCustomerInforEntry(Long.valueOf(customerInforEntryId));
//				customerInfor.setCustName(custName);
//				customerInfor
//				customerInfor.setCustIdentiication(custIdentiication);
//				customerInfor.setPhoneNumber(phoneNumber);
//				customerInfor.setAddress(address);
//				customerInfor.setService(service);
//				customerInfor.setReason(reason);
//				customerInfor.setComment(comment);
//				CustomerInforEntryLocalServiceUtil.updateCustomerInfor(customerInfor);
//			}
		}
		catch (Exception ex)
		{
	        SessionErrors.add(actionRequest, ex.getClass().getName());
	        actionResponse.setRenderParameter("mvcPath",
	                "/html/customercare/view.jsp");
		}
		finally
		{
	        actionResponse.setRenderParameter("mvcPath","/html/customercare/view.jsp");
		}
	}
	public void changePage(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, NumberFormatException, PortalException, SystemException
	{
		User user = UserLocalServiceUtil.getUserById(Long.valueOf(actionRequest.getRemoteUser()));
		String phoneNumber = ParamUtil.getString(actionRequest,"phoneNumber");
		String currentCallId = ParamUtil.getString(actionRequest,"currentAnswerCallId");
		actionRequest.getPortletSession().setAttribute("phoneNumber_" + user.getScreenName(),phoneNumber);
		actionRequest.getPortletSession().setAttribute("currentAnswerCallId_" + user.getScreenName(),currentCallId);
		String portletName = (String) actionRequest.getAttribute(WebKeys.PORTLET_ID);

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		PortletURL redirectURL = PortletURLFactoryUtil
				.create(PortalUtil.getHttpServletRequest(actionRequest),
						portletName, themeDisplay.getLayout().getPlid(),
						PortletRequest.RENDER_PHASE);	
		
		redirectURL.setParameter("jspPage", "/html/customercare/customerInfor.jsp");
		actionResponse.sendRedirect(redirectURL.toString());		
	}
	public void deleteAgents(ActionRequest actionRequest, ActionResponse actionResponse) throws NumberFormatException, SystemException
	{
		String[] listOfAgentIds = ParamUtil.getParameterValues(actionRequest, "agentIds");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();		

		for (int i = 0; i < listOfAgentIds.length; i++)
		{
			AgentDataEntry agentDataEntry = AgentDataEntryLocalServiceUtil.getAgentDataEntryByAgentId(user.getCompanyId(),Long.valueOf(listOfAgentIds[i]));
			
			AgentDataEntryLocalServiceUtil.deleteAgentDataEntry(agentDataEntry);
		}
	}
	public void updateAgents(ActionRequest actionRequest, ActionResponse actionResponse) throws NumberFormatException, SystemException, PortalException
	{
		String[] listOfAgentIds = ParamUtil.getParameterValues(actionRequest, "agentIds");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		for (int i = 0; i < listOfAgentIds.length; i++)
		{
			AgentDataEntry agentDataEntry = AgentDataEntryLocalServiceUtil.getAgentDataEntryByAgentId(user.getCompanyId(),Long.valueOf(listOfAgentIds[i]));
			if (agentDataEntry.getAgentDataEntryId() == 0)
			{
				// Tao moi
				long agentDataEntryId = CounterLocalServiceUtil.increment();
				agentDataEntry.setAgentDataEntryId(agentDataEntryId);
				agentDataEntry.setCompanyId(user.getCompanyId());
				agentDataEntry.setGroupId(user.getGroupId());
				agentDataEntry.setUserId(user.getUserId());
				agentDataEntry.setAgentId(Long.valueOf(listOfAgentIds[i]));
				agentDataEntry.setQueueList(ParamUtil.getString(actionRequest, listOfAgentIds[i]+ "queueList"));
				agentDataEntry.setExtension(ParamUtil.getString(actionRequest, listOfAgentIds[i]+ "extension"));
				agentDataEntry.setCreateDate(new Date());
				AgentDataEntryLocalServiceUtil.addAgentDataEntry(agentDataEntry);

			}
			else
			{
				agentDataEntry.setQueueList(ParamUtil.getString(actionRequest, listOfAgentIds[i]+ "queueList"));
				agentDataEntry.setExtension(ParamUtil.getString(actionRequest, listOfAgentIds[i]+ "extension"));
				agentDataEntry.setModifiedDate(new Date());
				AgentDataEntryLocalServiceUtil.updateAgentDataEntry(agentDataEntry);
			}
		}		
	}

}
