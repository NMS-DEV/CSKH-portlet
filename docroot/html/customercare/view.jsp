<%@page
	import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.theme.PortletDisplay"%>
<%@ include file="/html/init.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<portlet:defineObjects />
<%
	ThemeDisplay theme = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	PortletDisplay porletDisplay = theme.getPortletDisplay();
	PermissionChecker permissionChecker = theme.getPermissionChecker();
	long groupId = theme.getScopeGroupId();
	String name = porletDisplay.getRootPortletId();
	String pk = porletDisplay.getResourcePK();
	String viewAgentActionId = "VIEW_AGENT";
%>

<liferay-ui:tabs names ="Monitoring,Agent Infor,Role & Permission" refresh ="false" tabsValues="Monitoring,AgentInfor,Role&Permission">
	<liferay-ui:section>
		<%@ include file="view_Monitoring.jsp" %>
	</liferay-ui:section>
	<c:choose>
	<c:when test="<%=permissionChecker.hasPermission(groupId, name, pk, viewAgentActionId)%>">
		<liferay-ui:section>
			<%@ include file="view_AgentInfor.jsp"%>
		</liferay-ui:section>
	</c:when>
	<c:otherwise>
		You have not permission
	</c:otherwise>
	</c:choose>
</liferay-ui:tabs>
<%!
	private static Log logview = LogFactoryUtil.getLog("docroot.html.customercare.view_jsp");
%>