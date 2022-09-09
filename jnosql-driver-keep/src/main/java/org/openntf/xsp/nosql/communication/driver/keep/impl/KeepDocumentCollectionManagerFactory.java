/**
 * Copyright © 2022 Jesse Gallagher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openntf.xsp.nosql.communication.driver.keep.impl;

import org.openntf.xsp.nosql.communication.driver.keep.AccessTokenSupplier;
import org.openntf.xsp.nosql.communication.driver.keep.BaseUriSupplier;
import org.openntf.xsp.nosql.communication.driver.keep.DataSourceSupplier;

import jakarta.nosql.document.DocumentCollectionManagerFactory;

public class KeepDocumentCollectionManagerFactory implements DocumentCollectionManagerFactory {
	
	private final BaseUriSupplier baseUriSupplier;
	private final DataSourceSupplier dataSourceSupplier;
	private final AccessTokenSupplier tokenSupplier;
	
	public KeepDocumentCollectionManagerFactory(BaseUriSupplier baseUriSupplier, DataSourceSupplier dataSourceSupplier, AccessTokenSupplier tokenSupplier) {
		this.baseUriSupplier = baseUriSupplier;
		this.dataSourceSupplier = dataSourceSupplier;
		this.tokenSupplier = tokenSupplier;
	}

	@SuppressWarnings("unchecked")
	@Override
	public KeepDocumentCollectionManager get(String type) {
		return new KeepDocumentCollectionManager(baseUriSupplier, dataSourceSupplier, tokenSupplier);
	}

	@Override
	public void close() {

	}
}
