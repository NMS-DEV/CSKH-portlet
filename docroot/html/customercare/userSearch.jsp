<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@include file="/html/init.jsp"%>

<portlet:defineObjects /> 
<%
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
	String fullName = ParamUtil.getString(request,"fullName");
	String userName = ParamUtil.getString(request,"userName");
	String emailAddr = ParamUtil.getString(request,"email");
	String extension = ParamUtil.getString(request,"extension");
	String queueName = ParamUtil.getString(request,"queueName"); 
%>
<liferay-ui:search-toggle
buttonLabel='Find User'
displayTerms="<%= displayTerms %>"
id="toggle_id_user_search">
<aui:input label="Full Name" name="fullName" value="<%=fullName %>" />
<aui:input label="User Name" name="userName" value="<%=userName %>" />
<aui:input label="Email" name="emailAddr" value="<%= emailAddr %>" />
<aui:input label="Extension" name="extension" value="<%= extension %>" />
<aui:input label="QueueName" name="queueName" value="<%= queueName %>" />
</liferay-ui:search-toggle>

<%!
	private static Log logUserSearch = LogFactoryUtil.getLog("docroot.html.customercare.userSearch_jsp");
%>