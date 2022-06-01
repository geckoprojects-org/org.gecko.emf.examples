/**
 */
package org.test.emf.model.addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.test.emf.model.addressbook.Contact#getId <em>Id</em>}</li>
 *   <li>{@link org.test.emf.model.addressbook.Contact#getType <em>Type</em>}</li>
 *   <li>{@link org.test.emf.model.addressbook.Contact#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.test.emf.model.addressbook.AddressBookPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.test.emf.model.addressbook.AddressBookPackage#getContact_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.test.emf.model.addressbook.Contact#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.test.emf.model.addressbook.ContactType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.test.emf.model.addressbook.ContactType
	 * @see #setType(ContactType)
	 * @see org.test.emf.model.addressbook.AddressBookPackage#getContact_Type()
	 * @model required="true"
	 * @generated
	 */
	ContactType getType();

	/**
	 * Sets the value of the '{@link org.test.emf.model.addressbook.Contact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.test.emf.model.addressbook.ContactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContactType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.test.emf.model.addressbook.AddressBookPackage#getContact_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.test.emf.model.addressbook.Contact#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Contact
