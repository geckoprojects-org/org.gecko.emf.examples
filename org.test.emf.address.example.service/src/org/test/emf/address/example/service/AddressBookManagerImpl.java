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
package org.test.emf.address.example.service;

import java.io.IOException;
import java.util.UUID;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.test.emf.address.example.service.api.AddressBookManager;
import org.test.emf.model.addressbook.AddressBook;
import org.test.emf.model.addressbook.AddressBookFactory;
import org.test.emf.model.addressbook.Contact;
import org.test.emf.model.addressbook.ContactType;
import org.test.emf.model.addressbook.Person;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.ComponentServiceObjects;

/**
 * 
 * @author ungei
 * @since 31 May 2022
 */
@Component(immediate = true)
public class AddressBookManagerImpl implements AddressBookManager {

	@Reference
	private AddressBookFactory factory;

	@Reference
	ComponentServiceObjects<ResourceSet> sets;
	
	private AddressBook instance;
	
	@Activate
	public void activate() {
		instance = factory.createAddressBook();
		instance.setId(UUID.randomUUID().toString());
		instance.setDescription("Some Addressbook");
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.test.emf.address.example.service.api.AddressBookManager#addPerson(java.lang.String, org.test.emf.model.addressbook.ContactType, java.lang.String)
	 */
	@Override
	public String addPerson(String name, String type, String value) {
		Person person = factory.createPerson();
		person.setId(UUID.randomUUID().toString());
		person.setName(name);
		instance.getPersons().add(person);
		addContact(person.getId(), type, value);
		return person.getId();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.test.emf.address.example.service.api.AddressBookManager#addContact(java.lang.String, org.test.emf.model.addressbook.ContactType, java.lang.String)
	 */
	@Override
	public String addContact(String personId, String type, String value) {
		Person person = instance.getPersons().stream().filter(p -> p.getId().equals(personId)).findFirst().get();
		Contact contact = factory.createContact();
		contact.setId(UUID.randomUUID().toString());
		contact.setType(ContactType.get(type));
		contact.setValue(value);
		person.getContacts().add(contact);
		return contact.getId();
	}
	
	@Override
	public void print() {
		 ResourceSet set = sets.getService();
		 try {
			 Resource resource = set.createResource(URI.createURI("AddressBook.xmi"));
			 EObject copy = EcoreUtil.copy(instance);
			 resource.getContents().add(copy);
			resource.save(System.out, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sets.ungetService(set);
		}
	}

	@Override
	public void save(String fileName) {
		ResourceSet set = sets.getService();
		try {
			Resource resource = set.createResource(URI.createURI(fileName));
			EObject copy = EcoreUtil.copy(instance);
			resource.getContents().add(copy);
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sets.ungetService(set);
		}
	}

	@Override
	public void load(String fileName) {
		ResourceSet set = sets.getService();
		try {
			Resource resource = set.createResource(URI.createURI(fileName));
			resource.load(null);
			instance = (AddressBook) resource.getContents().remove(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sets.ungetService(set);
		}
	}

}
