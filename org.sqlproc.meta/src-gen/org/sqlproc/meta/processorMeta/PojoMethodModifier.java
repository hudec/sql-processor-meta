/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pojo Method Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallFunction <em>Call Function</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallUpdate <em>Call Update</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallQueryFunction <em>Call Query Function</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallSelectFunction <em>Call Select Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier()
 * @model
 * @generated
 */
public interface PojoMethodModifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Call Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Function</em>' attribute.
   * @see #setCallFunction(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier_CallFunction()
   * @model
   * @generated
   */
  boolean isCallFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallFunction <em>Call Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Function</em>' attribute.
   * @see #isCallFunction()
   * @generated
   */
  void setCallFunction(boolean value);

  /**
   * Returns the value of the '<em><b>Call Update</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Update</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Update</em>' attribute.
   * @see #setCallUpdate(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier_CallUpdate()
   * @model
   * @generated
   */
  boolean isCallUpdate();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallUpdate <em>Call Update</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Update</em>' attribute.
   * @see #isCallUpdate()
   * @generated
   */
  void setCallUpdate(boolean value);

  /**
   * Returns the value of the '<em><b>Call Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Query</em>' attribute.
   * @see #setCallQuery(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier_CallQuery()
   * @model
   * @generated
   */
  boolean isCallQuery();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallQuery <em>Call Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Query</em>' attribute.
   * @see #isCallQuery()
   * @generated
   */
  void setCallQuery(boolean value);

  /**
   * Returns the value of the '<em><b>Call Query Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Query Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Query Function</em>' attribute.
   * @see #setCallQueryFunction(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier_CallQueryFunction()
   * @model
   * @generated
   */
  boolean isCallQueryFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallQueryFunction <em>Call Query Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Query Function</em>' attribute.
   * @see #isCallQueryFunction()
   * @generated
   */
  void setCallQueryFunction(boolean value);

  /**
   * Returns the value of the '<em><b>Call Select Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Select Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Select Function</em>' attribute.
   * @see #setCallSelectFunction(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getPojoMethodModifier_CallSelectFunction()
   * @model
   * @generated
   */
  boolean isCallSelectFunction();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.PojoMethodModifier#isCallSelectFunction <em>Call Select Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Select Function</em>' attribute.
   * @see #isCallSelectFunction()
   * @generated
   */
  void setCallSelectFunction(boolean value);

} // PojoMethodModifier
