/*
 */
package org.test.emf.model.addressbook.impl;

import org.gecko.emf.osgi.EPackageConfigurator;

import org.test.emf.model.addressbook.AddressBookPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class AddressBookEPackageConfigurator implements EPackageConfigurator {
	
	private AddressBookPackage ePackage;

	protected AddressBookEPackageConfigurator(AddressBookPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(AddressBookPackage.eNS_URI, ePackage);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(AddressBookPackage.eNS_URI);
	}
}