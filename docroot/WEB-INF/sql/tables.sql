create table CC_AgentDataEntry (
	agentDataEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	agentId LONG,
	queueList VARCHAR(75) null,
	extension VARCHAR(75) null
);

create table CC_CallDataEntry (
	callDataEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	callId VARCHAR(75) null,
	startCallDate DATE null,
	endCallDate DATE null,
	queueName VARCHAR(75) null,
	callNumber VARCHAR(75) null,
	channel VARCHAR(75) null,
	waitTime VARCHAR(75) null,
	durationTime VARCHAR(75) null,
	extension VARCHAR(75) null,
	status VARCHAR(75) null,
	channelOld VARCHAR(75) null,
	channelTo VARCHAR(75) null,
	extOfMonitor VARCHAR(75) null,
	causeCode VARCHAR(75) null,
	sipCause VARCHAR(75) null,
	staffName VARCHAR(75) null
);

create table CC_CustomerInforEntry (
	customerInforEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	custName VARCHAR(75) null,
	custIdentiication VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	address VARCHAR(75) null,
	service VARCHAR(75) null,
	comment_ VARCHAR(75) null,
	status VARCHAR(75) null,
	reason VARCHAR(75) null
);