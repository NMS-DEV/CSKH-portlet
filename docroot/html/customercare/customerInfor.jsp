<%@page import="com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.docs.customercare.model.CustomerInforEntry"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>
<portlet:defineObjects />

<portlet:renderURL var="customerInforURL">
	<portlet:param name="mvcPath" value="/html/customercare/customerInfor.jsp"></portlet:param>
</portlet:renderURL>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/customercare/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addCustomer" var="addCustomerURL" />
<%
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	if (themeDisplay.isSignedIn())
	{
		User user = UserLocalServiceUtil.getUserById(Long.valueOf(request.getRemoteUser()));
		String phoneNumber = (String) renderRequest.getPortletSession().getAttribute("phoneNumber_" + user.getScreenName());
		long companyId = PortalUtil.getCompanyId(request);
		String description = "";
		Sort sort = null;
		Hits hits= null;
		CustomerInforEntry customerInforEntry = null;
		try
		{
			hits = CustomerInforEntryLocalServiceUtil.search(companyId, phoneNumber, description, true, 0, 1000, sort);
			long customerInforEntryId = 0;
			for(int i=0;i < hits.getDocs().length; i++)
			{
				Document doc = hits.doc(i);
				customerInforEntryId = GetterUtil.getLong(doc.get("customerInforEntryId"));
				if (customerInforEntryId > 0)
				{
					break;
				}
			}
			customerInforEntry = CustomerInforEntryLocalServiceUtil.getCustomerInforEntry(customerInforEntryId);
		}
		catch(PortalException ex)
		{
			
		}
		catch(SystemException ex)
		{
			
		}
		if (customerInforEntry == null) 
		{
%>
<div>
	<h3><liferay-ui:message key="customerInfor_lable"></liferay-ui:message></h3>
	<aui:form name="fm" method="post" id="fmCustInfor" action="${ addCustomerURL }">
			<aui:row>
				<aui:input inlineField="true" name="custName" label="customer-name" key="customer-name">
					<aui:validator name="required" errorMessage="Hay nhap ten khach hang."/>
					<aui:validator name="rangeLength" errorMessage="Do dai toi thieu 2, toi da 75 ky tu.">[2,70]</aui:validator>
					
				</aui:input>
				
				<aui:input inlineField="true" name="custIdentiication" label="customer-Identiication" key="customer-Identiication">
					<aui:validator name="digits" errorMessage="Ky tu khong hop le, nhap ky tu 0-9."/>				
				</aui:input>
				<aui:input inlineField="true" name="phoneNumber" label="phone-number" value="<%=phoneNumber%>">
					<aui:validator name="required" errorMessage="Hay nhap so dien thoai."/>
					<aui:validator name="rangeLength" errorMessage="Do dai toi thieu 2, toi da 11 so.">[2,11]</aui:validator>
					<aui:validator name="digits" errorMessage="Ky tu khong hop le, nhap ky tu 0-9."/>				
				</aui:input>
			</aui:row>
			<aui:row>			
				<aui:input inlineField="true" name="address" label="customer-address"/>					
				<aui:input inlineField="true" name="service" label="service-using"/>
			</aui:row>
			<aui:row>
				<aui:input inlineField="true" type="textarea" name="reason" label="customer-complain"/>						
				<aui:input inlineField="true" type="textarea" name="comment" label="customer-comment"/>			
			</aui:row>
			<aui:input type="hidden" name="customerInforEntryId" value=""/>
		<aui:button-row>
			<aui:button type="submit" value="Submit"/>
			<aui:button type="cancel" value="Cancel" onClick="<%= viewURL.toString() %>"/>
		</aui:button-row>
	</aui:form>	
</div>
<%		}%>
<%
		if (customerInforEntry != null)
		{
%>
<div>
	<h3><liferay-ui:message key="customerInfor_lable"></liferay-ui:message></h3>
	<aui:form name="fm" method="post" id="fmCustInfor" action="${ addCustomerURL }">
		<aui:fieldset>	
			<aui:row>
				<aui:input inlineField="true" name="custName" label="customer-name" key="customer-name" 
						   value="<%=customerInforEntry.getCustName()%>">
					<aui:validator name="required" errorMessage="Hay nhap ten khach hang."/>
					<aui:validator name="rangeLength" errorMessage="Do dai toi thieu 2, toi da 75 ky tu.">[2,70]</aui:validator>						   
				</aui:input>
				<aui:input inlineField="true" name="custIdentiication" label="customer-Identiication" 
						   key="customer-Identiication" value="<%= customerInforEntry.getCustIdentiication()%>">					   
				</aui:input>
				<aui:input inlineField="true" name="phoneNumber" label="phone-number" value="<%= phoneNumber%>">
					<aui:validator name="required" errorMessage="Hay nhap so dien thoai."/>
					<aui:validator name="rangeLength" errorMessage="Do dai toi thieu 9, toi da 11 so.">[2,11]</aui:validator>
					<aui:validator name="digits" errorMessage="Ky tu khong hop le, nhap ky tu 0-9."/>					
				</aui:input>	
			</aui:row>
			<aui:row>
				<aui:input inlineField="true" name="address" label="customer-address" value="<%= customerInforEntry.getAddress()%>"/>						   					
				<aui:input inlineField="true" name="service" label="service-using"/>
			</aui:row>
			<aui:row>
				<aui:input inlineField="true" type="textarea" name="reason" label="customer-complain"/>				
				<aui:input inlineField="true" type="textarea" name="comment" label="customer-comment"/>
			</aui:row>
			<aui:input type="hidden" name="customerInforEntryId" value="<%= customerInforEntry.getCustomerInforEntryId()%>"/>
		</aui:fieldset>
		<aui:button-row>
			<aui:button type="submit" value="Submit"/>
			<aui:button type="cancel" value="Cancel" onClick="<%= viewURL.toString() %>"/>
		</aui:button-row>
	</aui:form>	
</div>		
<% 		}
	}
%>
