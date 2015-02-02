/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.ValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.ValueType#getNumber <em>Number</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.ValueType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getValueType()
 * @model
 * @generated
 */
public interface ValueType extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getValueType_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.ValueType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getValueType_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.ValueType#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getValueType_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.ValueType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // ValueType
