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
package org.test.emf.address.example.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.test.emf.address.example.service.api.AddressBookManager;

/**
 * @author Juergen Albert
 * @since 31 May 2022
 */
@Component(service = AddressBook.class)
@Command(scope = "address", function = { "addPerson", "addContact", "print", "load", "save"})
public class AddressBook {

	@Reference
	AddressBookManager manager ;
	
	public String addPerson(String name, String type, String value) {
		return manager.addPerson(name, type, value);
	}

	public String addContact(String personId, String type, String value) {
		return manager.addContact(personId, type, value);
	}

	public void print() {
		manager.print();
	};

	public void load(String fileName) {
		manager.load(fileName);
	}

	public void save(String fileName) {
		manager.save(fileName);
	}
	
}
