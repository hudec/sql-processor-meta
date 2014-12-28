/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Type Assignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.DatabaseTypeAssignement#getDbType <em>Db Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getDatabaseTypeAssignement()
 * @model
 * @generated
 */
public interface DatabaseTypeAssignement extends EObject
{
  /**
   * Returns the value of the '<em><b>Db Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Db Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Db Type</em>' attribute.
   * @see #setDbType(String)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getDatabaseTypeAssignement_DbType()
   * @model
   * @generated
   */
  String getDbType();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.DatabaseTypeAssignement#getDbType <em>Db Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Db Type</em>' attribute.
   * @see #getDbType()
   * @generated
   */
  void setDbType(String value);

} // DatabaseTypeAssignement
