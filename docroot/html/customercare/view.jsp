<%@ include file="/html/init.jsp"%>
<portlet:defineObjects />

<liferay-ui:tabs names ="Monitoring,Agent Infor,Role & Permission" refresh ="false" tabsValues="Monitoring,AgentInfor,Role&Permission">
	<liferay-ui:section>
		<%@ include file="view_Monitoring.jsp" %>
	</liferay-ui:section>
	<liferay-ui:section> 
		<%@ include file="view_AgentInfor.jsp" %>
	</liferay-ui:section>
	<liferay-ui:section>
		<%@ include file="view_RoleAndPermission.jsp" %>
	</liferay-ui:section>	
</liferay-ui:tabs>
<%!
	private static Log logview = LogFactoryUtil.getLog("docroot.html.customercare.view_jsp");
%>