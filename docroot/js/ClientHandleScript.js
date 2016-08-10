/**
 * Listen new data from server Author: DuyMB
 */
var socket;

var urlSocket = 'ws://192.168.88.174:8484/websocket';
//var urlSocket = 'ws://192.168.88.44:8484/websocket';
if (!window.WebSocket)
{
    window.WebSocket = window.MozWebSocket;
}
if (window.WebSocket)
{
    socket = new WebSocket(urlSocket);
    socket.onmessage = function(event)
    {
	start(event.data);
    };
    socket.onclose = function(event)
    {
	alert("Socket close");
    };
    socket.onopen = function(event)
    {
	send("hello");
    };
} else
{
    alert("Your browser does not support Web Socket.");
}
var dataCall;
var currentAnswerCall;
var lastAnswerCall;
var dataCallHistory;
var myCallHistoryTable;
var myTableCall; // Store data, update, add, delete
var myCallModal;
var dataQueue;
var myTableQueue; // Store data, update, add, delete
var dataAgent;
var myTableAgent; // Store data, update, add, delete
var queueLists;
var rowData;
var headerQueue =['queueName', 'lstMember', 'strategy', 'count', 'countAvaible',
                   'countBusy', 'countPause', 'countUnvaible','countCallWait' ];
var headerAgent;
function start(value)
{
    if (value !== null)
    {
	var data = JSON.parse(value);
	if (data !== null)
	{
	    if (data.type === "QUEUE")
	    {
		dataQueue = data.value;
		queueLists = JSON.stringify(data.value);
		//alert("QUEUE" + queueLists);
		//fillSelectPicker("selectBox",queueLists,"queueName");	
		//loadtable("#myQueueData", headerQueue, dataQueue);
		refeshTableData(myTableQueue,dataQueue);
	    } else if (data.type === "AGENT")
	    {
		dataAgent = data.value;
		//alert("AGENT" + JSON.stringify(data.value));
		refeshTableData(myTableAgent,dataAgent);
	    } else if (data.type === "CALL")
	    {
		dataCall = data.value;
		//alert("CALL" + JSON.stringify(data.value));
		//load(dataCall);
		refeshTableData(myTableCall,dataCall);
		
	    }
	}
    } else
    {
	alert("value is null");
    }
}
function send(message)
{
    if (!window.WebSocket)
    {
	return;
    }
    if (socket.readyState == WebSocket.OPEN)
    {
	socket.send(message);
    }
}
/**
 * Push data to DOM
 */
function convertTim2Date(time) 
{
    var now = new Date().getTime() - time;
    return millisToMinutesAndSeconds(now);
}

function millisToMinutesAndSeconds(millis) 
{
    var minutes = Math.floor(millis / 60000);
    var seconds = ((millis % 60000) / 1000).toFixed(0);
    return minutes + ":" + (seconds < 10 ? '0' : '') + seconds;
}
function refeshTableData(idTableName,dataTable)
{
    idTableName.set('data',eval(dataTable));
    
}
function allowDisplay(userName,rowData)
{
    if (rowData.status != 'answer')
    {
	return true;
    }
    else if (userName == rowData.staffName)
    {
	return true;    
    }
	
    return false;
}
AUI().use(
    	'aui-datatable','panel','dd-plugin',
    	function(Y)
        {
    	    var userName = document.getElementById('agentName').value;
    	    var columns = [	{label:'ID',key:'callId',width: '160px', formatter: function(o){
    						if (!allowDisplay(userName, o))
    						{
    						    return '';
    						}
    	    				}
    				},
    				{label:'Tổng đài',key:'queueName',width:'130px', formatter: function(o){
    				    		if (!allowDisplay(userName, o))
						{
						    return '';
						}
    					}
    				},
    				{label:'Số gọi đến',key:'callNumber',width:'150px', formatter: function(o){
    				    		if (!allowDisplay(userName, o))
						{
						    return '';
						}
    					}
    				},
    				{label:'Kênh',key:'channel',width:'120px', formatter: function(o){
    				    		if (!allowDisplay(userName, o))
						{
						    return '';
						}

    					}
    				},
    				{label:'Thời gian đợi',key:'waitTime',width:'120px',formatter: function(o){
    				    		if (!allowDisplay(userName, o))
						{
						    return '';
						}
    				    		
                               		}
    				},
    				{label:'Trạng thái',key:'status',width:'100px',allowHTML:true,
                        	formatter: function(o){
                        	    	if(o.value == "answer" && !o.data.isMute && o.data.staffName == userName)
                        	    	{	
                        	    	    submitTest(o.data.callNumber,o.data.callId);
                        	    	    return '<i class="icon-volume-up"> Đang trả lời</i>';
                        	    	}
                        	    	else if (o.value == "answer" && o.data.isMute)
                        	    	{
                        	    	    return '<i class="icon-volume-off"> Mute </i>';
                        	    	}
                               	}
                               	},
                               	{key:'staffName',label:'Nhân viên',width:'90px'},
                               	{key:'extension',label:'SIP',width:'80px'},
                               	{key:'transfer',label:'Chuyển cuộc gọi',width:'120px',allowHTML:true,
                        	formatter: function(o)
                        		{	
                        	    		if (allowDisplay(userName, o))
                        	    		{
                        	    		    return '<i class="icon-exchange" style="font-size:30px;color:blue"></i>';
                        	    		}                        			
                        		}
                        	},
                        	{key:'hangup',label:'Gác Máy',width:'100px',allowHTML:true,formatter: function(o){
                        	    		if (allowDisplay(userName, o))
                        	    		{
                        	    		    return '<i class="icon-phone" style="font-size:30px;color:red"></i>';
                        	    		}
                        	    		
                               		} 
                        	   
                        	},
                        	{key:'overListen',label:'Nghe xen',width:'90px',allowHTML:true,formatter: function(o){
                        	    		if (allowDisplay(userName, o))
                        	    		{
                        	    		    return '<i class="icon-group" style="font-size:30px;color:green"></i>';
                                	    	}
                        		}
                        	}
                               ];                 
                var data = dataCall;
            
                myTableCall = new Y.DataTable(
                {
                    columnset : columns,
                    recordset : data,
                    caption : '<h3 align="left">Bảng thông báo cuộc gọi đến</h3>',
                    plugins: [
                              {
                                cfg: {
                                  highlightRange: true
                                },
                                fn: Y.Plugin.DataTableHighlight
                              }
                            ]                    
                });
                myTableCall.render('#myCallData');
                myTableCall.get('boundingBox').unselectable();
                
                Y.delegate('click', function(e) {
                  // Catch click event and convert selected row to JSON
                  var 	cell = myTableCall.getCell(e.target),
                  	row = cell.get('parentNode'),
                  	dataModel = myTableCall.getRecord(row);
                  
                  	rowData = dataModel.toJSON();
                	var column = myTableCall.getColumn(e.target);
                  	if (column.key == "status")
                  	{
                  	    mute(rowData);
                  	}
                  	else if (column.key == "transfer")
                  	{
                  	    //redirection(rowData,'1000');
                  	    panel.show();
                  	}
                  	else if (column.key == "hangup")
                  	{
                  	    //hangup(rowData);
                  	    processHangup(rowData);
                  	}
                  	else if (column.key=="callNumber")
                  	{
                  	  submitTest1();
                  	}
                  	else if (column.key == "overListen")
                  	{
                  	  confirmOveListen.show();
                  	}
                }, '#myCallData', 'td',myTableCall);
            }
);
function processHangup(rowData)
{
    AUI().use(
	    	'panel','dd-plugin',
	    	function(Y)
	        {
	            	var confirmPanel = new Y.Panel({            	    
	                    bodyContent: 'Bạn chắn chắn muốn cúp máy?',
	                    width        : 450,
	                    zIndex       : 6,
	                    centered     : true,
	                    modal        : true,
	                    visible	 : true,
	                    render       : '#confirmPanel',
	                    buttons:[
	                             {
	                        	 value: 'Có',
	                        	 selection: Y.WidgetStdMod.FOOTER,
	                        	 action: function(e){
	                        	     e.preventDefault();
	                        	     confirmPanel.hide();
	                        	     hangup(rowData);
	                        	 }
	                             },
	                             {
	                        	 value: 'Không',
	                        	 selection: Y.WidgetStdMod.FOOTER,
	                        	 action: function(e){
	                        	     e.preventDefault();
	                        	     confirmPanel.hide();
	                        	 }
	                        	 
	                             }
	                    ]
	            	});	    	    
	        }
    );
}
var panel;
AUI().use(
    	'panel','dd-plugin',
    	function(Y)
        {
            	panel = new Y.Panel({
                    srcNode      : '#panelContent',
            	    headerContent: 'Chuyển cuộc gọi',
                    width        : 250,
                    zIndex       : 5,
                    centered     : true,
                    modal        : true,
                    visible      : false,
                    render       : true,
                    plugins      : [Y.Plugin.Drag]
                });
                var idFieldExtenofAgent = Y.one('#extendOfAgent');
                var idNameOfAgent = Y.one('#name');
                panel.addButton(
                	    {
                		value : 'Chuyển',
                		selection : 'FOOTER',
                		action : function(e)
                		{
                		    e.preventDefault();
                		    panel.hide();
                		    redirection(rowData, idFieldExtenofAgent.get('value'));
                		}
                	    });
                	    panel.addButton(
                	    {
                		value : 'Hủy',
                		selection : 'FOOTER',
                		action : function(e)
                		{
                		    e.preventDefault();
                		    panel.hide();
                		}
                	    });                
        }
);
var confirmOveListen;
AUI().use(
    	'panel', 'dd-plugin', function(Y)
{
    confirmOveListen = new Y.Panel(
    {
	srcNode : '#panelOverListen',
	bodyContent : 'Xac nhan nghe xen, huong dan(coach) cuoc goi?',
	width : 400,
	zIndex : 7,
	centered : true,
	modal : true,
	visible : false,
	render : true,
	plugins : [ Y.Plugin.Drag ]
    });
    var idMyExtension = Y.one('#agentExtension');
    var idAgentName = Y.one('#agentName');
    confirmOveListen.addButton(
    {
	value : 'Nghe xen',
	selection : 'FOOTER',
	action : function(e)
	{
	    e.preventDefault();
	    confirmOveListen.hide();
	    overheardListen(rowData, idMyExtension.get('value'), idAgentName.get('value'));
	}
    });
    confirmOveListen.addButton(
    {
	value : 'Huấn luyện',
	selection : 'FOOTER',
	action : function(e)
	{
	    e.preventDefault();
	    confirmOveListen.hide();
	    // coach
	    coach(rowData, idMyExtension.get('value'), idAgentName.get('value'))
	}
    });

    confirmOveListen.addButton(
    {
	value : 'Hủy',
	selection : 'FOOTER',
	action : function(e)
	{
	    e.preventDefault();
	    confirmOveListen.hide();
	}
    });        	    	
}
);
AUI().use(
	'aui-datatable', 
	function(Y)
        {
	    ['queueName', 'lstMember', 'strategy', 'count', 'countAvaible',
             'countBusy', 'countPause', 'countUnvaible','countCallWait' ];
            var columns = [{label:'Tổng đài',key:'queueName'},
                           {label:'Cấu hình',key:'strategy'},
                           {label:'Tổng số thành viên',key:'count'},
                           {label:'Sẵn sàng',key:'countAvaible'},
                           {label:'Bận',key:'countBusy'},
                           {label:'Tạm Ngưng',key:'countPause'},
                           {key:'countUnvaible',label:'Không sẵn sàng'},
                           {key:'countCallWait',label:'Số cuộc gọi trên queue'}
                           ]; 
        
            var data = dataQueue;
          
            myTableQueue = new Y.DataTable(
            {
        	columnset : columns,
        	recordset : data,
        	caption : '<h3 align="left"> Bảng danh sách tổng đài</h3>',
                rowsPerPage: 5,
                pageSizes: [ [5,10,15,20], 'Show All' ]        	
            }).render('#myQueueData');
        }
);
AUI().use(
	'aui-datatable', 
	function(Y)
        {
            var columns = [{label:'Tên',key:'memberName',
        		    formatter : function(o){
        			var name = o.value;
        			if (name.indexOf("_") > 0)
        			{
        			    name = name.substr(0, name.indexOf("_")); 
        			}
        			return name;
        		    }},
                           {label:'Tổng đài',key:'queue'},
                           {label:'Ext',key:'location'},
                           {label:'Trạng thái',key:'status'},
                           {label:'Nguyên nhân',key:'reasonPause'},
                           {label:'Uu tiên',key:'penalty'},
                           {key:'lastCall',label:'Cuộc gọi cuối'},
                           {key:'callTaken',label:'Thực hiện gọi'}
                           ]; 
        
            var data = dataAgent;
          
            myTableAgent = new Y.DataTable(
            {
        	columnset : columns,
        	recordset : data,
        	caption : '<h3 align="left"> Bảng danh sách thành viên</h3>',
                rowsPerPage: 5,
                pageSizes: [ [5,10,15,20], 'Show All' ]        	
            }).render('#myCallDataHistory');
        }
);
function getValueOf(rowData,field)
{
    return rowData[field];
}
function hangup(rowData)
{
    send('hangup:' + getValueOf(rowData,'channel'));
}
//func nghe xen
function overheardListen(rowData, ext, agentName)
{
    send('listen:' + getValueOf(rowData,'extension') + ':' + ext + ':' +  getValueOf(rowData,'channelOld') + ':' + agentName);
}
function conference(rowData) 
{
    var obj = document.getElementById('valueHidden').value;
    var row = JSON.parse(obj);
    var ext = document.getElementById('ext').value;
    send('conference:' + row.extension + ':' + ext + ':' + row.channelOld);
}

function coach(rowData,ext,agentName) 
{
    send('coach:' + getValueOf(rowData,'extension') + ':' + ext + ':' + getValueOf(rowData,'channelOld') + ':' + agentName);
}

function redirection(rowData, extend) 
{
    //var receiver = '1000';
    send('redirect:' + extend + ':' + getValueOf(rowData,'channel'));
}

//send action mute/unmute call
function mute(rowData) 
{
    var state = '';
    if(!getValueOf(rowData,'isMute'))
    {
	state = 'off';
    }
    else state = 'on';
    send('mute:' + getValueOf(rowData,'channel') + ':' + state);
}
function jointMemberToQueue(ext,queueName, agentId, agentName)
{
    send('joinQueue:' + queueName + ":" + ext + ":" + agentId + ":" + agentName);
}
function removeMemberFromQueue(ext,queueName)
{
    send('removeQueue:' + queueName + ":" + ext);
}
function fillSelectPicker(idElement, data,field)
{
    var options;  
    valueList = JSON.parse(data);
    for (var i =0; i < valueList['length']; i ++)
    {
        options += "<option value ='" + valueList[i][field] + "'>" + valueList[i][field] + "</option>"; 
    }
    document.getElementById(idElement).append(options);
}
function holdCall()
{
    
}
function unholdCall()
{
    
}

AUI().use('aui-node',
	function(Y)
	{
            var options,queueName,agentName; 
            var valueList = JSON.parse(queueLists);
            
            Y.one('#selectQueueNames').empty();
            for (var i =0; i < valueList['length']; i ++)
            {
                Y.one('#selectQueueNames').append('<option value ="' + valueList[i]["queueName"] + '">' + valueList[i]["queueName"] + '</option>'); 
            }
            
            Y.one('#selectQueueNames').on('change', function(e) {
            	queueName = this.get('value');
            });
            
            Y.one('#btnAddQueue').on('click', function(e){
        	var ext = 'SIP/'+ Y.one('#txtExtension').get('value');
        	agentId = Y.one('#agentId').get('value');
        	agentName = Y.one('#agentName').get('value');
        	Y.one('#txtExtension').empty();
        	jointMemberToQueue(ext,queueName,agentId, agentName);
        	
            });
            Y.one('#btnRemoveQueue').on('click', function(e){
        	var ext = 'SIP/' + Y.one('#txtExtension').get('value');
        	Y.one('#txtExtension').empty();
        	removeMemberFromQueue(ext,queueName);
            });            
	}
);
// Auto add agent to queue
AUI().use('aui-node',
	function(Y)
	{
            var queueList = Y.one('#agentQueueLists').get('value');
            var	extension = 'SIP/' + Y.one('#agentExtension').get('value');
            var agentId = Y.one('#agentId').get('value');
            var agentName = Y.one('#agentName').get('value');
            var arrQueueList;
            if (queueList !=  null)
            {
                arrQueueList = queueList.split(",");
                for (i =0; i < arrQueueList.length; i++)
                {
            	jointMemberToQueue(extension, arrQueueList[i], agentId, agentName);
                }
            }
	}
);