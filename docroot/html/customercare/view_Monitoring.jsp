<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@include file="/html/init.jsp"%>
<portlet:defineObjects />

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/html/customercare/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="customerInforURL">
	<portlet:param name="mvcPath" value="/html/customercare/customerInfor.jsp"></portlet:param>
</portlet:renderURL>
<%
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
%>
<%if (!themeDisplay.isSignedIn()) {
 	
	HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(renderRequest);
	HttpServletRequest httpOrigReq = PortalUtil.getOriginalServletRequest(httpReq);
	
	String logoutUserId = httpOrigReq.getParameter("UserId");
	String logoutExtension = httpOrigReq.getParameter(logoutUserId + "_extension");
	String logoutQueueList = httpOrigReq.getParameter(logoutUserId + "_queueList");

%>
	<aui:script>
		var socket2;
	
		var urlSocket2 = 'ws://192.168.88.174:8484/websocket';
		//var urlSocket2 = 'ws://192.168.88.44:8484/websocket';
		if (!window.WebSocket)
		{
		    window.WebSocket = window.MozWebSocket;
		}
		if (window.WebSocket)
		{
		    socket2 = new WebSocket(urlSocket2);
		    socket2.onmessage = function(event)
		    {
				
		    };
		    socket2.onclose = function(event)
		    {
				
		    };
		    socket2.onopen = function(event)
		    {
				send2("hello");
		    };
		} else
		{
		    alert("Your browser does not support Web Socket.");
		}
		function send2(message)
		{
		    if (!window.WebSocket)
		    {
			return;
		    }
		    if (socket2.readyState == WebSocket.OPEN)
		    {
				socket2.send(message);
		    }
		}
		var queueList = "<%=logoutQueueList%>";
		var extensionToRemove = "<%=logoutExtension%>";		
		var arrQueue = queueList.split(",");
		alert(queueList);
		for(i=0; i< arrQueue.length; i++)
		{
		    send2('removeQueue:' + arrQueue[i] + ":" + 'SIP/'+ extensionToRemove);
		}
		//socket2.close(3006, "normal logout");
	</aui:script>
<%} else { %>
<% 
 	User user = UserLocalServiceUtil.getUserById(Long.valueOf(request.getRemoteUser()));
 	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 	long companyId = PortalUtil.getCompanyId(request);
 	// Get queue and extendsion.
 	AgentDataEntry agentDataEntry = AgentDataEntryLocalServiceUtil.getAgentDataEntryByAgentId(user.getCompanyId(), user.getUserId());
 	
	String queueList = agentDataEntry.getQueueList();
	String extension = agentDataEntry.getExtension();
	// Process one time show Customer Infor
 	String currentAnswerCallId = (String) renderRequest.getPortletSession().getAttribute("currentAnswerCallId_" + user.getScreenName());
	// Process show calls history
 	String userId = String.valueOf(user.getUserId());
 	String description = "";
 	Sort sort = null;
    Hits hits = CallDataEntryLocalServiceUtil.search(companyId, userId, description, true, 0, 1000, sort);
    List<CallDataEntry> callDataEntries = new ArrayList<CallDataEntry>(); 
     
  	for (int i =0; i < hits.getDocs().length; i ++)
  	{
  		Document doc = hits.doc(i);
  		long callDataEntryId = GetterUtil.getLong(doc.get("callDataEntryId"));
  		if (callDataEntryId > 0)
  		{
 	 		CallDataEntry callDataEntry = null;
 	 		try
 	 		{
 	 			callDataEntry = CallDataEntryLocalServiceUtil.getCallDataEntry(callDataEntryId);
 	 		}
 	 		catch(PortalException  e)  
 	 		{
 	 			logMonitoring.error(e.getLocalizedMessage()); 			
 	 		}
 	 		catch(SystemException e)
 	 		{
 	 			logMonitoring.error(e.getLocalizedMessage());	
 	 		}
 	 		callDataEntries.add(callDataEntry);
  		}
  	}
  	// Sort by 
	String orderByType= ParamUtil.getString(request, "orderByType");	
	String orderByCol= ParamUtil.getString(request, "orderByCol");
	String sortingOrder = orderByType;
	if( orderByType.equals("desc"))
	{
		orderByType = "asc";
	}
	else
	{
		orderByType = "desc";
	}
	if (Validator.isNull(orderByType))
	{
		orderByType = "desc";
	}			     
%> 
	<script src="<%=request.getContextPath()%>/js/ClientHandleScript.js"></script>

	<portlet:actionURL name="changePage" var="redirectPage" />
	
	<aui:form name="test" id ="form1" method="post" action="${ redirectPage }">
		<aui:input name="phoneNumber" id="phone" type="hidden"/>
		<aui:input name="currentAnswerCallId" value="<%=currentAnswerCallId%>" id="currentAnswerCallId" type="hidden"/>
	</aui:form>	
	
	<input id="agentId" value="<%=user.getUserId()%>" type="hidden">
	<input id="agentName" value="<%=user.getScreenName()%>" type="hidden">
	<input id="agentQueueLists" value="<%=queueList%>" type="hidden">
	<input id="agentExtension" value="<%=extension%>" type="hidden">
	
    <div>
	         <select name="QueueLists" id = "selectQueueNames">
	         	<option value =""> add member to queue...</option>
	         </select>         
	         <input class="form-control" id="txtExtension" type="text" placeholder="extension">
	         <button type="button" class="btn btn-success" id="btnAddQueue">
	                  <i class="icon-plus-sign"></i>
	         </button>
	         <button type="button" class="btn btn-failure" id="btnRemoveQueue">
	                  <i class="icon-minus-sign"></i>
	         </button>
    </div>	
	<div id="myCallData">
			<input type='hidden' id ='extenhid' value=''>
	</div>
	<div id="myQueueData"></div>
	<div id="myCallDataHistory">
		<h3><liferay-ui:message key="callhistory_lable"></liferay-ui:message></h3>
		<liferay-ui:search-container orderByType="<%=orderByType %>">
			<liferay-ui:search-container-results>  
				<%
					List<CallDataEntry> aaa= ListUtil.subList(callDataEntries,searchContainer.getStart(),searchContainer.getEnd());
					int sizeOf = callDataEntries.size();
					List<CallDataEntry> sortedCallDataEntry = new ArrayList<CallDataEntry>(aaa);
					if(Validator.isNotNull(orderByCol))
					{
						BeanComparator comparator = new BeanComparator(orderByCol);
						Collections.sort(sortedCallDataEntry,comparator);				
						if (sortingOrder.equalsIgnoreCase("asc"))
						{
						}
						else
						{
							Collections.reverse(sortedCallDataEntry);
						}
					}
				    pageContext.setAttribute("results", sortedCallDataEntry);
				    pageContext.setAttribute("total", sizeOf);					
				%>
			</liferay-ui:search-container-results>
			
			<liferay-ui:search-container-row 
				className="com.liferay.docs.customercare.model.CallDataEntry" keyProperty="callDataEntryId" modelVar="callDataEntry">
				
				<liferay-ui:search-container-column-text property="callId" name ="ID" orderable="true" orderableProperty="callId" value="<%= callDataEntry.getCallId()%>"/>
				<liferay-ui:search-container-column-text property="queueName" name ="short_code" value="<%= callDataEntry.getQueueName()%>"/>
				<liferay-ui:search-container-column-text property="callNumber" name ="incoming_number" value="<%= callDataEntry.getCallNumber()%>"/>
				<liferay-ui:search-container-column-text property="createDate" name ="create_date" orderable="true" orderableProperty="createDate" value="<%= df.format(callDataEntry.getCreateDate())%>"/>
				<liferay-ui:search-container-column-text property="channel" name ="channel" value="<%= callDataEntry.getChannel()%>"/>
				<liferay-ui:search-container-column-text property="waitTime" name ="time_call" value="<%= callDataEntry.getWaitTime()%>"/>
				<liferay-ui:search-container-column-text property="durationTime" name ="time_answer" value="<%= callDataEntry.getDurationTime()%>"/>
				<liferay-ui:search-container-column-text property="status" name ="status" value="<%= callDataEntry.getStatus()%>"/>
				
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</div>
	<div id="panelContent">
	    <div class="yui3-widget-bd">
	        <form>
	            <fieldset>
	                <p>
	                    <label for="extend">Extension</label><br/>
	                    <input type="text" name="extend" id="extendOfAgent" placeholder="extension">
	                </p>
	                <p>
	                    <label for="name">Name</label><br/>
	                    <input type="text" name="name" id="name" value="" placeholder="">
	                </p>
	            </fieldset>
	        </form>
	    </div>
	</div>
	<div id="panelOverListen"></div>	
	<div id="confirmPanel"></div>
<%}%>	
<aui:script>
	function submitTest(phoneNumber,callId)
	{
	    if (document.<portlet:namespace />test.<portlet:namespace />currentAnswerCallId.value != callId)
		{
		    document.<portlet:namespace />test.<portlet:namespace />phone.value = phoneNumber;
		    document.<portlet:namespace />test.<portlet:namespace />currentAnswerCallId.value = callId;
		    document.<portlet:namespace />test.submit();
		}
	}
	function submitTest1()
	{
	    document.<portlet:namespace />test.submit();
	}	
</aui:script>
<%!
	private static Log logMonitoring = LogFactoryUtil.getLog("docroot.html.customercare.view_Monitoring_jsp");
%>