/*
 */
package org.test.emf.model.addressbook.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFResourceConfigurator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import org.test.emf.model.addressbook.AddressBookPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.test.emf.model.addressbook.util.AddressBookResourceImpl
 * @generated
 */
 @Component( name = AddressBookPackage.eNAME + "Factory", service = Resource.Factory.class, scope = ServiceScope.SINGLETON)
 @ProvideEMFResourceConfigurator( name = AddressBookPackage.eNAME,
	contentType = { "" }, 
	fileExtension = {
	"addressbook"
 	},  
	version = "1.0.0"
)
public class AddressBookResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBookResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new AddressBookResourceImpl(uri);
		return result;
	}

} //AddressBookResourceFactoryImpl
