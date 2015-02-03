/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xwikisas.learnpad.cw.component.service.bpmn.flownode;

import java.util.List;

import org.xwiki.component.annotation.Role;

@Role
public interface BPMNFlowNodeManager {
	String getCurrent() throws BPMNFlowNodeManagerException;

	String getName() throws BPMNFlowNodeManagerException;

	String getName(String id) throws BPMNFlowNodeManagerException;
	
	String getDocumentation() throws BPMNFlowNodeManagerException;
	
	String getDocumentation(String id) throws BPMNFlowNodeManagerException;
	
	String getURL() throws BPMNFlowNodeManagerException;
	
	String getURL(String id) throws BPMNFlowNodeManagerException;

	List<String> getIncomings() throws BPMNFlowNodeManagerException;

	List<String> getIncomings(String id) throws BPMNFlowNodeManagerException;
	
	List<String> getOutgoings() throws BPMNFlowNodeManagerException;
	
	List<String> getOutgoings(String id) throws BPMNFlowNodeManagerException;
}