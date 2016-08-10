/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.customercare.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;

import com.liferay.docs.customercare.model.AgentDataEntry;
import com.liferay.docs.customercare.service.AgentDataEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.base.AgentDataEntryLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the agent data entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.customercare.service.AgentDataEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.base.AgentDataEntryLocalServiceBaseImpl
 * @see com.liferay.docs.customercare.service.AgentDataEntryLocalServiceUtil
 */
public class AgentDataEntryLocalServiceImpl	extends AgentDataEntryLocalServiceBaseImpl 
{
	public AgentDataEntry insertAgentData(AgentDataEntry agentDataEntry) throws SystemException
	{
		return agentDataEntryPersistence.update(agentDataEntry);
	}
	public AgentDataEntry getAgentDataEntryByAgentId(long companyId,long agentId) throws SystemException 
	{
		DynamicQuery dynamicQuery = buildDynamicQuery(agentId,"","","","","",AgentDataEntry.class,true);
		@SuppressWarnings("unchecked")
		List<AgentDataEntry> listOfAgent = AgentDataEntryLocalServiceUtil.dynamicQuery(dynamicQuery);
		if (listOfAgent.size()> 1)
		{
			throw new SystemException("There were duplicated agents");
		}
		else if (listOfAgent.size() < 1)
		{
			return agentDataEntryPersistence.create(0);
		}
		else
		{
			if(listOfAgent.get(0).getCompanyId() != companyId)
			{
				throw new SystemException("There were nodata found with companyid=" + companyId);
			}
		}
			
		return listOfAgent.get(0);
	}
	public DynamicQuery buildDynamicQuery(long agentId, String fullName,String userName, String emailAddr, 
										String queueName, String extension,Class<?> clazz, boolean andSearch)
	{
		Junction junction = null;
		if (andSearch)
		{
			junction = RestrictionsFactoryUtil.conjunction();
		}
		else
		{
			junction = RestrictionsFactoryUtil.disjunction();
		}

		if (agentId > 0)
		{
			Property  property =  PropertyFactoryUtil.forName("agentId");
			junction.add(property.eq(Long.valueOf(agentId)));
		}
		if(Validator.isNotNull(fullName))
		{
			Property  property =  PropertyFactoryUtil.forName("firstName");
			String value = (new StringBuilder("%")).append(fullName).append("%").toString();
			junction.add(property.like(value));
		}
		if(Validator.isNotNull(userName))
		{
			Property  property =  PropertyFactoryUtil.forName("screenName");
			String value = (new StringBuilder("%")).append(userName).append("%").toString();
			junction.add(property.like(value));
		}
		if(Validator.isNotNull(emailAddr))
		{
			Property  property =  PropertyFactoryUtil.forName("emailAddress");
			String value = (new StringBuilder("%")).append(emailAddr).append("%").toString();
			junction.add(property.like(value));
		}		
		if(Validator.isNotNull(queueName))
		{
			Property  property =  PropertyFactoryUtil.forName("queueList");
			String value = (new StringBuilder("%")).append(queueName).append("%").toString();
			junction.add(property.like(value));
		}		
		if(Validator.isNotNull(extension))
		{
			Property  property =  PropertyFactoryUtil.forName("extension");
			String value = (new StringBuilder("%")).append(extension).append("%").toString();
			junction.add(property.like(value));
		}		
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(clazz,getClassLoader());
		return dynamicQuery.add(junction);
	}
	public List<User> removeDefaultUserFromList(List<User> listOfUsers,long companyId)
	{
		List<User> result = new ArrayList<User>();
		for (int i=0; i < listOfUsers.size(); i ++)
		{
			User user = listOfUsers.get(i);
			if (!user.getDefaultUser() && user.getCompanyId() == companyId)
			{
				result.add(user);
			}
		}
		return result;
	}
	public List<AgentDataEntry> removeAgentOfOtherFromList(List<AgentDataEntry> listOfAgents,long companyId)
	{
		List<AgentDataEntry> result = new ArrayList<AgentDataEntry>();
		for (int i=0; i < listOfAgents.size(); i ++)
		{
			AgentDataEntry agent = listOfAgents.get(i);
			if (agent.getCompanyId() == companyId)
			{
				result.add(agent);
			}
		}
		return result;
	}	
	@SuppressWarnings("unchecked")
	public List<User> agentAdvanceSearch(long companyId,String fullName,String userName, String emailAddr, String queueName, String extension,
												   boolean andSearch)
	{
		List<User> finalResult = new ArrayList<User>();
		List<User> resultFromUser = new ArrayList<User>();
		boolean searchWithNoCondition = Validator.isNull(fullName) && Validator.isNull(userName) && Validator.isNull(emailAddr) &&
										Validator.isNull(queueName) && Validator.isNull(extension);
		try 
		{
				resultFromUser = removeDefaultUserFromList(
										UserLocalServiceUtil.dynamicQuery(
												buildDynamicQuery(0, fullName, userName, emailAddr, "", "", User.class, andSearch)),companyId);				
		}
		catch (SystemException e) 
		{
				e.printStackTrace();
		}
		List<AgentDataEntry> resultFromAgentDataEntry = new ArrayList<AgentDataEntry>();
		try 
		{
			resultFromAgentDataEntry = removeAgentOfOtherFromList(AgentDataEntryLocalServiceUtil.dynamicQuery(buildDynamicQuery(0, "", "", "", queueName, extension, AgentDataEntry.class, andSearch)),companyId);
		}
		catch (SystemException e) 
		{
			e.printStackTrace();
		}
		// Remove field in List
		if (!searchWithNoCondition)
		{
			if (resultFromAgentDataEntry.size() > 0 && resultFromUser.size() > 0)
			{
				for (int i =0; i< resultFromAgentDataEntry.size(); i++)
				{
					AgentDataEntry agentDataEntry =  resultFromAgentDataEntry.get(i);
					for(int j = 0; j < resultFromUser.size(); j ++)
					{
						User user = resultFromUser.get(j);
								
						if (user.getUserId() == agentDataEntry.getAgentId())
						{
							finalResult.add(user);
						}
					}
				}
			}
			else if (resultFromAgentDataEntry.size() > 0 && resultFromUser.size() < 1)
			{
				for (int i =0; i< resultFromAgentDataEntry.size(); i++)
				{
					AgentDataEntry agentDataEntry =  resultFromAgentDataEntry.get(i);
					try 
					{
						User user = UserLocalServiceUtil.getUser(agentDataEntry.getAgentId());
						finalResult.add(user);
					} catch (PortalException | SystemException e) {
						e.printStackTrace();
					}
				}
			}
			else 
			{
				finalResult = resultFromUser;
			}
		}
		else
		{
			finalResult = resultFromUser;
		}
		return finalResult;
	}
}