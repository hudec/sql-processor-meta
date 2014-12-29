/**
 */
package org.sqlproc.meta.processorMeta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.meta.processorMeta.Artifacts;
import org.sqlproc.meta.processorMeta.FunctionDefinition;
import org.sqlproc.meta.processorMeta.MappingRule;
import org.sqlproc.meta.processorMeta.MetaStatement;
import org.sqlproc.meta.processorMeta.OptionalFeature;
import org.sqlproc.meta.processorMeta.PojoDefinition;
import org.sqlproc.meta.processorMeta.ProcedureDefinition;
import org.sqlproc.meta.processorMeta.ProcessorMetaPackage;
import org.sqlproc.meta.processorMeta.Property;
import org.sqlproc.meta.processorMeta.TableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getPojos <em>Pojos</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ArtifactsImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactsImpl extends MinimalEObjectImpl.Container implements Artifacts
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getPojos() <em>Pojos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojos()
   * @generated
   * @ordered
   */
  protected EList<PojoDefinition> pojos;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<TableDefinition> tables;

  /**
   * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedures()
   * @generated
   * @ordered
   */
  protected EList<ProcedureDefinition> procedures;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<FunctionDefinition> functions;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<MetaStatement> statements;

  /**
   * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappings()
   * @generated
   * @ordered
   */
  protected EList<MappingRule> mappings;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<OptionalFeature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProcessorMetaPackage.Literals.ARTIFACTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ProcessorMetaPackage.ARTIFACTS__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoDefinition> getPojos()
  {
    if (pojos == null)
    {
      pojos = new EObjectContainmentEList<PojoDefinition>(PojoDefinition.class, this, ProcessorMetaPackage.ARTIFACTS__POJOS);
    }
    return pojos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableDefinition> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<TableDefinition>(TableDefinition.class, this, ProcessorMetaPackage.ARTIFACTS__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcedureDefinition> getProcedures()
  {
    if (procedures == null)
    {
      procedures = new EObjectContainmentEList<ProcedureDefinition>(ProcedureDefinition.class, this, ProcessorMetaPackage.ARTIFACTS__PROCEDURES);
    }
    return procedures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDefinition> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<FunctionDefinition>(FunctionDefinition.class, this, ProcessorMetaPackage.ARTIFACTS__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetaStatement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<MetaStatement>(MetaStatement.class, this, ProcessorMetaPackage.ARTIFACTS__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingRule> getMappings()
  {
    if (mappings == null)
    {
      mappings = new EObjectContainmentEList<MappingRule>(MappingRule.class, this, ProcessorMetaPackage.ARTIFACTS__MAPPINGS);
    }
    return mappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptionalFeature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<OptionalFeature>(OptionalFeature.class, this, ProcessorMetaPackage.ARTIFACTS__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.ARTIFACTS__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__POJOS:
        return ((InternalEList<?>)getPojos()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__PROCEDURES:
        return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__MAPPINGS:
        return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ARTIFACTS__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.ARTIFACTS__PROPERTIES:
        return getProperties();
      case ProcessorMetaPackage.ARTIFACTS__POJOS:
        return getPojos();
      case ProcessorMetaPackage.ARTIFACTS__TABLES:
        return getTables();
      case ProcessorMetaPackage.ARTIFACTS__PROCEDURES:
        return getProcedures();
      case ProcessorMetaPackage.ARTIFACTS__FUNCTIONS:
        return getFunctions();
      case ProcessorMetaPackage.ARTIFACTS__STATEMENTS:
        return getStatements();
      case ProcessorMetaPackage.ARTIFACTS__MAPPINGS:
        return getMappings();
      case ProcessorMetaPackage.ARTIFACTS__FEATURES:
        return getFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        getPojos().addAll((Collection<? extends PojoDefinition>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends TableDefinition>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__PROCEDURES:
        getProcedures().clear();
        getProcedures().addAll((Collection<? extends ProcedureDefinition>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends FunctionDefinition>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends MetaStatement>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__MAPPINGS:
        getMappings().clear();
        getMappings().addAll((Collection<? extends MappingRule>)newValue);
        return;
      case ProcessorMetaPackage.ARTIFACTS__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends OptionalFeature>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.ARTIFACTS__PROPERTIES:
        getProperties().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__POJOS:
        getPojos().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__TABLES:
        getTables().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__PROCEDURES:
        getProcedures().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__FUNCTIONS:
        getFunctions().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__STATEMENTS:
        getStatements().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__MAPPINGS:
        getMappings().clear();
        return;
      case ProcessorMetaPackage.ARTIFACTS__FEATURES:
        getFeatures().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.ARTIFACTS__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__POJOS:
        return pojos != null && !pojos.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__TABLES:
        return tables != null && !tables.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__PROCEDURES:
        return procedures != null && !procedures.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__MAPPINGS:
        return mappings != null && !mappings.isEmpty();
      case ProcessorMetaPackage.ARTIFACTS__FEATURES:
        return features != null && !features.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArtifactsImpl
