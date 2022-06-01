/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.test.emf.address.example.service.api;

/**
 * 
 * @author Juergen Albert
 * @since 31 May 2022
 */
public interface AddressBookManager {
	
	String addPerson(String name, String type, String value); 

	String addContact(String personId, String type, String value);

	void print();

	void load(String fileName); 

	void save(String fileName); 

}
