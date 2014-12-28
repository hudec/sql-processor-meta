/**
 */
package org.sqlproc.meta.processorMeta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.Artifacts#getPojoPackages <em>Pojo Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Pojos</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PojoDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojos</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Pojos()
   * @model containment="true"
   * @generated
   */
  EList<PojoDefinition> getPojos();

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.TableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Tables()
   * @model containment="true"
   * @generated
   */
  EList<TableDefinition> getTables();

  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.ProcedureDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<ProcedureDefinition> getProcedures();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFunctions();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.MetaStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Statements()
   * @model containment="true"
   * @generated
   */
  EList<MetaStatement> getStatements();

  /**
   * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.MappingRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappings</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Mappings()
   * @model containment="true"
   * @generated
   */
  EList<MappingRule> getMappings();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.OptionalFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_Features()
   * @model containment="true"
   * @generated
   */
  EList<OptionalFeature> getFeatures();

  /**
   * Returns the value of the '<em><b>Pojo Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.sqlproc.meta.processorMeta.PackageDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pojo Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pojo Packages</em>' containment reference list.
   * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage#getArtifacts_PojoPackages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDeclaration> getPojoPackages();

} // Artifacts
