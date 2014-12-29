/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Pojo Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.FunctionPojoAssignement#getDbFunction <em>Db Function</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.FunctionPojoAssignement#getPojo <em>Pojo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getFunctionPojoAssignement()
 * @model
 * @generated
 */
public interface FunctionPojoAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Function</em>' attribute.
   * @see #setDbFunction(String)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getFunctionPojoAssignement_DbFunction()
   * @model
   * @generated
   */
  String getDbFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.FunctionPojoAssignement#getDbFunction <em>Db Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Function</em>' attribute.
   * @see #getDbFunction()
   * @generated
   */
  void setDbFunction(String value);

  /**
   * Returns the value of the '<em><b>Pojo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo</em>' containment reference.
   * @see #setPojo(PojoDefinition)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getFunctionPojoAssignement_Pojo()
   * @model containment="true"
   * @generated
   */
  PojoDefinition getPojo();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.FunctionPojoAssignement#getPojo <em>Pojo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pojo</em>' containment reference.
   * @see #getPojo()
   * @generated
   */
  void setPojo(PojoDefinition value);

} // FunctionPojoAssignement
