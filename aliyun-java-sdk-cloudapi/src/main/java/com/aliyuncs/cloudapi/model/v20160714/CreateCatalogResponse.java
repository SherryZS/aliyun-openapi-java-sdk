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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.CreateCatalogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCatalogResponse extends AcsResponse {



	private String requestId;



	private String catalogId;



	public String getRequestId() {

		return this.requestId;

	}



	public void setRequestId(String requestId) {

		this.requestId = requestId;

	}



	public String getCatalogId() {

		return this.catalogId;

	}



	public void setCatalogId(String catalogId) {

		this.catalogId = catalogId;

	}



	@Override

	public CreateCatalogResponse getInstance(UnmarshallerContext context) {

		return	CreateCatalogResponseUnmarshaller.unmarshall(this, context);

	}

}
