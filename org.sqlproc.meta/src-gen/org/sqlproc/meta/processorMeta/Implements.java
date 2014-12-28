/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#isGenerics <em>Generics</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#getOnlyPojos <em>Only Pojos</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#getOnlyDaos <em>Only Daos</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#getExceptPojos <em>Except Pojos</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Implements#getExceptDaos <em>Except Daos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements()
 * @model
 * @generated
 */
public interface Implements extends AbstractPojoEntity
{
  /**
   * Returns the value of the '<em><b>Implements</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implements</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implements</em>' reference.
   * @see #setImplements(JvmType)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_Implements()
   * @model
   * @generated
   */
  JvmType getImplements();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.Implements#getImplements <em>Implements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implements</em>' reference.
   * @see #getImplements()
   * @generated
   */
  void setImplements(JvmType value);

  /**
   * Returns the value of the '<em><b>Generics</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generics</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generics</em>' attribute.
   * @see #setGenerics(boolean)
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_Generics()
   * @model
   * @generated
   */
  boolean isGenerics();

  /**
   * Sets the value of the '{@link org.sqlproc.meta.processorMeta.Implements#isGenerics <em>Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generics</em>' attribute.
   * @see #isGenerics()
   * @generated
   */
  void setGenerics(boolean value);

  /**
   * Returns the value of the '<em><b>Only Pojos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PojoEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only Pojos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only Pojos</em>' reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_OnlyPojos()
   * @model
   * @generated
   */
  EList<PojoEntity> getOnlyPojos();

  /**
   * Returns the value of the '<em><b>Only Daos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PojoDao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only Daos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only Daos</em>' reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_OnlyDaos()
   * @model
   * @generated
   */
  EList<PojoDao> getOnlyDaos();

  /**
   * Returns the value of the '<em><b>Except Pojos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PojoEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except Pojos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Except Pojos</em>' reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_ExceptPojos()
   * @model
   * @generated
   */
  EList<PojoEntity> getExceptPojos();

  /**
   * Returns the value of the '<em><b>Except Daos</b></em>' reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PojoDao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except Daos</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Except Daos</em>' reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getImplements_ExceptDaos()
   * @model
   * @generated
   */
  EList<PojoDao> getExceptDaos();

} // Implements
