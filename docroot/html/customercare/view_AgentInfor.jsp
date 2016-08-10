<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>
<portlet:defineObjects />

<%
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	long companyId = PortalUtil.getCompanyId(request);
	String orderByType = "desc";
	if (themeDisplay.isSignedIn())
	{	
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		RowChecker rowChecker = new RowChecker(renderResponse); 
		String queueListPrefix="queueList";
		String extensionPrefix="extension";
		String fullName = ParamUtil.getString(request,"fullName");
		String userName = ParamUtil.getString(request,"userName");
		String emailAddr = ParamUtil.getString(request,"email");
		String extension = ParamUtil.getString(request,"extension");
		String queueName = ParamUtil.getString(request,"queueName");
%>
<liferay-portlet:renderURL varImpl="userSearchURL">
	<portlet:param name="mvcPath" value="/html/customercare/view_AgentInfor.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%=userSearchURL%>" method="post" name="fm">
	<liferay-portlet:renderURLParams varImpl="userSearchURL" />
	<liferay-portlet:renderURL varImpl="iteratorURL">
		<portlet:param name="fullName" value="<%= fullName %>" />
		<portlet:param name="userName" value="<%= userName %>" />
		<portlet:param name="emailAddr" value="<%= emailAddr%>" />
		<portlet:param name="extension" value="<%= extension %>" />
		<portlet:param name="queueName"	value="<%= queueName %>" />
		<portlet:param name="mvcPath" value="/html/customercare/view_AgentInfor.jsp" />
	</liferay-portlet:renderURL>
	
	<liferay-ui:search-container delta="10" orderByType="<%=orderByType%>" displayTerms="<%= new DisplayTerms(renderRequest)%>" rowChecker="<%=rowChecker%>" iteratorURL="<%= iteratorURL %>">
		<liferay-ui:search-form page="/html/customercare/userSearch.jsp" servletContext="<%= application %>"/>
		<liferay-ui:search-container-results>
			<%
				DisplayTerms displayTerms = searchContainer.getDisplayTerms(); 
				if (displayTerms.isAdvancedSearch())
				{
					List<User> userList = AgentDataEntryLocalServiceUtil.agentAdvanceSearch(companyId,fullName, userName, emailAddr,
																							queueName, extension, displayTerms.isAndOperator());
					List<User> subLists = ListUtil.subList(userList,searchContainer.getStart(),searchContainer.getEnd());
					int sizeOf = userList.size();
					
					pageContext.setAttribute("results", subLists);
					pageContext.setAttribute("total", sizeOf);					
				}
				else
				{
					String searchkeywords = displayTerms.getKeywords();
					List<User> userList = AgentDataEntryLocalServiceUtil.agentAdvanceSearch(companyId,searchkeywords, searchkeywords, searchkeywords,
							searchkeywords, searchkeywords, displayTerms.isAndOperator());
					List<User> subLists = ListUtil.subList(userList,searchContainer.getStart(),searchContainer.getEnd());
					int sizeOf = userList.size();
					
					pageContext.setAttribute("results", subLists);
					pageContext.setAttribute("total", sizeOf);					
					
				}

			%>
		</liferay-ui:search-container-results>
	
		<liferay-ui:search-container-row
			className="com.liferay.portal.model.User"
			keyProperty="userId" modelVar="user">
			
			<liferay-ui:search-container-column-text name="Company" orderableProperty="companyId" value="<%=String.valueOf(user.getCompanyId())%>" />
			<liferay-ui:search-container-column-text name="Group" value="<%=String.valueOf(user.getGroupId())%>" />
			<liferay-ui:search-container-column-text name="UserId" value="<%=String.valueOf(user.getUserId())%>" />			
			<liferay-ui:search-container-column-text name="UserName" value="<%=user.getScreenName()%>" />
			<liferay-ui:search-container-column-text name="Full Name" orderableProperty="fullName" value="<%=user.getFullName()%>" />
			<liferay-ui:search-container-column-text name="CreateDate" value="<%=df.format(user.getCreateDate())%>" />
			<liferay-ui:search-container-column-text name="Email" value="<%=user.getEmailAddress()%>" />
			<liferay-ui:search-container-column-text name="Queue">
				<aui:input type="text" name="<%=String.valueOf(user.getUserId()) + queueListPrefix%>" label="" value="<%=AgentDataEntryLocalServiceUtil.getAgentDataEntryByAgentId(companyId,user.getUserId()).getQueueList()%>"/>
			</liferay-ui:search-container-column-text>			
			<liferay-ui:search-container-column-text name="Extension" value="<%=AgentDataEntryLocalServiceUtil.getAgentDataEntryByAgentId(companyId,user.getUserId()).getExtension()%>">
			</liferay-ui:search-container-column-text>			
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
	<aui:button-row>
		<aui:button align="right" name="delete" type="button" icon="icon-delete" value="Delete" onClick='<%= renderResponse.getNamespace() +  "deleteAgents();"%>'/>
		<aui:button align="right" name="update" type="button" icon="icon-update" value="Update" onClick='<%= renderResponse.getNamespace() +  "updateAgents();"%>'/>	
	</aui:button-row>
	<aui:input name="agentIds" type="hidden" />
		
</aui:form>
<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />deleteAgents',
		function() {
			var agentIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, '<portlet:namespace />allRowIds');	
			
			if (agentIds && confirm('are-you-sure-you-want-to-delete-the-selected-agents?')) {
				document.<portlet:namespace />fm.<portlet:namespace />agentIds.value = agentIds;

				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="deleteAgents"></portlet:actionURL>');
			} else {
				
			}
		},
		['liferay-util-list-fields']
	);
	Liferay.provide(
		window,
		'<portlet:namespace />updateAgents',
		function() {
			var agentIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, '<portlet:namespace />allRowIds');	
			
			if (agentIds && confirm('are-you-sure-you-want-to-update-the-selected-agents?')) {
				document.<portlet:namespace />fm.<portlet:namespace />agentIds.value = agentIds;

				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateAgents"></portlet:actionURL>');
			} else {
				
			}
		},
		['liferay-util-list-fields']
	);	
</aui:script>
<% } %>
<%!private static Log logAgent = LogFactoryUtil
			.getLog("docroot.html.customercare.view_AgentInfor_jsp");%>