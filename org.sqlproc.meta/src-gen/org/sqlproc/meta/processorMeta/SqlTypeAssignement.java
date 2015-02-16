/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Type Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.SqlTypeAssignement#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.SqlTypeAssignement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getSqlTypeAssignement()
 * @model
 * @generated
 */
public interface SqlTypeAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Sql Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Type</em>' containment reference.
   * @see #setSqlType(ValueType)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getSqlTypeAssignement_SqlType()
   * @model containment="true"
   * @generated
   */
  ValueType getSqlType();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.SqlTypeAssignement#getSqlType <em>Sql Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sql Type</em>' containment reference.
   * @see #getSqlType()
   * @generated
   */
  void setSqlType(ValueType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(PojoType)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getSqlTypeAssignement_Type()
   * @model containment="true"
   * @generated
   */
  PojoType getType();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.SqlTypeAssignement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(PojoType value);

} // SqlTypeAssignement
