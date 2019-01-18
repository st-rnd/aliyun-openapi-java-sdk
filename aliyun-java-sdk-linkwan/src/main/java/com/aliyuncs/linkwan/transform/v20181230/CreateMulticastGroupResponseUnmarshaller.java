/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.CreateMulticastGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMulticastGroupResponseUnmarshaller {

	public static CreateMulticastGroupResponse unmarshall(CreateMulticastGroupResponse createMulticastGroupResponse, UnmarshallerContext context) {
		
		createMulticastGroupResponse.setRequestId(context.stringValue("CreateMulticastGroupResponse.RequestId"));
		createMulticastGroupResponse.setSuccess(context.booleanValue("CreateMulticastGroupResponse.Success"));
		createMulticastGroupResponse.setData(context.stringValue("CreateMulticastGroupResponse.Data"));
	 
	 	return createMulticastGroupResponse;
	}
}