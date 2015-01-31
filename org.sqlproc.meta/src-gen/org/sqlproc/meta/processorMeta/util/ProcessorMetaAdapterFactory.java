/**
 */
package org.sqlproc.meta.processorMeta.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sqlproc.meta.processorMeta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sqlproc.meta.processorMeta.ProcessorMetaPackage
 * @generated
 */
public class ProcessorMetaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProcessorMetaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorMetaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ProcessorMetaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessorMetaSwitch<Adapter> modelSwitch =
    new ProcessorMetaSwitch<Adapter>()
    {
      @Override
      public Adapter caseArtifacts(Artifacts object)
      {
        return createArtifactsAdapter();
      }
      @Override
      public Adapter caseDatabaseCatalogAssignement(DatabaseCatalogAssignement object)
      {
        return createDatabaseCatalogAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseSchemaAssignement(DatabaseSchemaAssignement object)
      {
        return createDatabaseSchemaAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseTypeAssignement(DatabaseTypeAssignement object)
      {
        return createDatabaseTypeAssignementAdapter();
      }
      @Override
      public Adapter caseDatabaseMetaInfoAssignement(DatabaseMetaInfoAssignement object)
      {
        return createDatabaseMetaInfoAssignementAdapter();
      }
      @Override
      public Adapter caseDriverMetaInfoAssignement(DriverMetaInfoAssignement object)
      {
        return createDriverMetaInfoAssignementAdapter();
      }
      @Override
      public Adapter caseDriverMethodOutputAssignement(DriverMethodOutputAssignement object)
      {
        return createDriverMethodOutputAssignementAdapter();
      }
      @Override
      public Adapter caseSqlTypeAssignement(SqlTypeAssignement object)
      {
        return createSqlTypeAssignementAdapter();
      }
      @Override
      public Adapter caseColumnTypeAssignement(ColumnTypeAssignement object)
      {
        return createColumnTypeAssignementAdapter();
      }
      @Override
      public Adapter caseShowColumnTypeAssignement(ShowColumnTypeAssignement object)
      {
        return createShowColumnTypeAssignementAdapter();
      }
      @Override
      public Adapter caseTableAssignement(TableAssignement object)
      {
        return createTableAssignementAdapter();
      }
      @Override
      public Adapter caseJoinTableAssignement(JoinTableAssignement object)
      {
        return createJoinTableAssignementAdapter();
      }
      @Override
      public Adapter caseColumnAssignement(ColumnAssignement object)
      {
        return createColumnAssignementAdapter();
      }
      @Override
      public Adapter caseImportAssignement(ImportAssignement object)
      {
        return createImportAssignementAdapter();
      }
      @Override
      public Adapter caseExportAssignement(ExportAssignement object)
      {
        return createExportAssignementAdapter();
      }
      @Override
      public Adapter caseInheritanceAssignement(InheritanceAssignement object)
      {
        return createInheritanceAssignementAdapter();
      }
      @Override
      public Adapter caseManyToManyAssignement(ManyToManyAssignement object)
      {
        return createManyToManyAssignementAdapter();
      }
      @Override
      public Adapter caseDebugLevelAssignement(DebugLevelAssignement object)
      {
        return createDebugLevelAssignementAdapter();
      }
      @Override
      public Adapter caseProcedurePojoAssignement(ProcedurePojoAssignement object)
      {
        return createProcedurePojoAssignementAdapter();
      }
      @Override
      public Adapter caseFunctionPojoAssignement(FunctionPojoAssignement object)
      {
        return createFunctionPojoAssignementAdapter();
      }
      @Override
      public Adapter caseImplementsAssignement(ImplementsAssignement object)
      {
        return createImplementsAssignementAdapter();
      }
      @Override
      public Adapter caseExtendsAssignement(ExtendsAssignement object)
      {
        return createExtendsAssignementAdapter();
      }
      @Override
      public Adapter caseImplementsAssignementGenerics(ImplementsAssignementGenerics object)
      {
        return createImplementsAssignementGenericsAdapter();
      }
      @Override
      public Adapter caseExtendsAssignementGenerics(ExtendsAssignementGenerics object)
      {
        return createExtendsAssignementGenericsAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseDatabaseProperty(DatabaseProperty object)
      {
        return createDatabasePropertyAdapter();
      }
      @Override
      public Adapter casePojogenProperty(PojogenProperty object)
      {
        return createPojogenPropertyAdapter();
      }
      @Override
      public Adapter caseMetaTypeAssignement(MetaTypeAssignement object)
      {
        return createMetaTypeAssignementAdapter();
      }
      @Override
      public Adapter caseMetagenProperty(MetagenProperty object)
      {
        return createMetagenPropertyAdapter();
      }
      @Override
      public Adapter caseDaogenProperty(DaogenProperty object)
      {
        return createDaogenPropertyAdapter();
      }
      @Override
      public Adapter casePojoDefinition(PojoDefinition object)
      {
        return createPojoDefinitionAdapter();
      }
      @Override
      public Adapter caseTableDefinition(TableDefinition object)
      {
        return createTableDefinitionAdapter();
      }
      @Override
      public Adapter caseProcedureDefinition(ProcedureDefinition object)
      {
        return createProcedureDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseMetaStatement(MetaStatement object)
      {
        return createMetaStatementAdapter();
      }
      @Override
      public Adapter caseSql(Sql object)
      {
        return createSqlAdapter();
      }
      @Override
      public Adapter caseSqlFragment(SqlFragment object)
      {
        return createSqlFragmentAdapter();
      }
      @Override
      public Adapter caseMetaSql(MetaSql object)
      {
        return createMetaSqlAdapter();
      }
      @Override
      public Adapter caseIfSql(IfSql object)
      {
        return createIfSqlAdapter();
      }
      @Override
      public Adapter caseIfSqlFragment(IfSqlFragment object)
      {
        return createIfSqlFragmentAdapter();
      }
      @Override
      public Adapter caseIfMetaSql(IfMetaSql object)
      {
        return createIfMetaSqlAdapter();
      }
      @Override
      public Adapter caseIfSqlCond(IfSqlCond object)
      {
        return createIfSqlCondAdapter();
      }
      @Override
      public Adapter caseIfSqlBool(IfSqlBool object)
      {
        return createIfSqlBoolAdapter();
      }
      @Override
      public Adapter caseOrdSql(OrdSql object)
      {
        return createOrdSqlAdapter();
      }
      @Override
      public Adapter caseOrdSql2(OrdSql2 object)
      {
        return createOrdSql2Adapter();
      }
      @Override
      public Adapter caseColumn(Column object)
      {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseExtendedColumn(ExtendedColumn object)
      {
        return createExtendedColumnAdapter();
      }
      @Override
      public Adapter caseExtendedColumnName(ExtendedColumnName object)
      {
        return createExtendedColumnNameAdapter();
      }
      @Override
      public Adapter caseConstant(Constant object)
      {
        return createConstantAdapter();
      }
      @Override
      public Adapter caseIdentifier(Identifier object)
      {
        return createIdentifierAdapter();
      }
      @Override
      public Adapter caseConstantOperator(ConstantOperator object)
      {
        return createConstantOperatorAdapter();
      }
      @Override
      public Adapter caseIdentifierOperator(IdentifierOperator object)
      {
        return createIdentifierOperatorAdapter();
      }
      @Override
      public Adapter caseDatabaseColumn(DatabaseColumn object)
      {
        return createDatabaseColumnAdapter();
      }
      @Override
      public Adapter caseDatabaseTable(DatabaseTable object)
      {
        return createDatabaseTableAdapter();
      }
      @Override
      public Adapter caseMappingRule(MappingRule object)
      {
        return createMappingRuleAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseMappingItem(MappingItem object)
      {
        return createMappingItemAdapter();
      }
      @Override
      public Adapter caseMappingColumn(MappingColumn object)
      {
        return createMappingColumnAdapter();
      }
      @Override
      public Adapter caseExtendedMappingItem(ExtendedMappingItem object)
      {
        return createExtendedMappingItemAdapter();
      }
      @Override
      public Adapter caseMappingColumnName(MappingColumnName object)
      {
        return createMappingColumnNameAdapter();
      }
      @Override
      public Adapter caseOptionalFeature(OptionalFeature object)
      {
        return createOptionalFeatureAdapter();
      }
      @Override
      public Adapter casePojoType(PojoType object)
      {
        return createPojoTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Artifacts <em>Artifacts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Artifacts
   * @generated
   */
  public Adapter createArtifactsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseCatalogAssignement <em>Database Catalog Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseCatalogAssignement
   * @generated
   */
  public Adapter createDatabaseCatalogAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseSchemaAssignement <em>Database Schema Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseSchemaAssignement
   * @generated
   */
  public Adapter createDatabaseSchemaAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseTypeAssignement <em>Database Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseTypeAssignement
   * @generated
   */
  public Adapter createDatabaseTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseMetaInfoAssignement <em>Database Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseMetaInfoAssignement
   * @generated
   */
  public Adapter createDatabaseMetaInfoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DriverMetaInfoAssignement <em>Driver Meta Info Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DriverMetaInfoAssignement
   * @generated
   */
  public Adapter createDriverMetaInfoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DriverMethodOutputAssignement <em>Driver Method Output Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DriverMethodOutputAssignement
   * @generated
   */
  public Adapter createDriverMethodOutputAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.SqlTypeAssignement <em>Sql Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.SqlTypeAssignement
   * @generated
   */
  public Adapter createSqlTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ColumnTypeAssignement <em>Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ColumnTypeAssignement
   * @generated
   */
  public Adapter createColumnTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ShowColumnTypeAssignement <em>Show Column Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ShowColumnTypeAssignement
   * @generated
   */
  public Adapter createShowColumnTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.TableAssignement <em>Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.TableAssignement
   * @generated
   */
  public Adapter createTableAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.JoinTableAssignement <em>Join Table Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.JoinTableAssignement
   * @generated
   */
  public Adapter createJoinTableAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ColumnAssignement <em>Column Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ColumnAssignement
   * @generated
   */
  public Adapter createColumnAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ImportAssignement <em>Import Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ImportAssignement
   * @generated
   */
  public Adapter createImportAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExportAssignement <em>Export Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExportAssignement
   * @generated
   */
  public Adapter createExportAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.InheritanceAssignement <em>Inheritance Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.InheritanceAssignement
   * @generated
   */
  public Adapter createInheritanceAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ManyToManyAssignement <em>Many To Many Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ManyToManyAssignement
   * @generated
   */
  public Adapter createManyToManyAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DebugLevelAssignement <em>Debug Level Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DebugLevelAssignement
   * @generated
   */
  public Adapter createDebugLevelAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ProcedurePojoAssignement <em>Procedure Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ProcedurePojoAssignement
   * @generated
   */
  public Adapter createProcedurePojoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.FunctionPojoAssignement <em>Function Pojo Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.FunctionPojoAssignement
   * @generated
   */
  public Adapter createFunctionPojoAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ImplementsAssignement <em>Implements Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ImplementsAssignement
   * @generated
   */
  public Adapter createImplementsAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExtendsAssignement <em>Extends Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExtendsAssignement
   * @generated
   */
  public Adapter createExtendsAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ImplementsAssignementGenerics <em>Implements Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ImplementsAssignementGenerics
   * @generated
   */
  public Adapter createImplementsAssignementGenericsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExtendsAssignementGenerics <em>Extends Assignement Generics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExtendsAssignementGenerics
   * @generated
   */
  public Adapter createExtendsAssignementGenericsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseProperty <em>Database Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseProperty
   * @generated
   */
  public Adapter createDatabasePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.PojogenProperty <em>Pojogen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.PojogenProperty
   * @generated
   */
  public Adapter createPojogenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MetaTypeAssignement <em>Meta Type Assignement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MetaTypeAssignement
   * @generated
   */
  public Adapter createMetaTypeAssignementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MetagenProperty <em>Metagen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MetagenProperty
   * @generated
   */
  public Adapter createMetagenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DaogenProperty <em>Daogen Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DaogenProperty
   * @generated
   */
  public Adapter createDaogenPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.PojoDefinition <em>Pojo Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.PojoDefinition
   * @generated
   */
  public Adapter createPojoDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.TableDefinition <em>Table Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.TableDefinition
   * @generated
   */
  public Adapter createTableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ProcedureDefinition <em>Procedure Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ProcedureDefinition
   * @generated
   */
  public Adapter createProcedureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MetaStatement <em>Meta Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MetaStatement
   * @generated
   */
  public Adapter createMetaStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Sql <em>Sql</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Sql
   * @generated
   */
  public Adapter createSqlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.SqlFragment <em>Sql Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.SqlFragment
   * @generated
   */
  public Adapter createSqlFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MetaSql <em>Meta Sql</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MetaSql
   * @generated
   */
  public Adapter createMetaSqlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IfSql <em>If Sql</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IfSql
   * @generated
   */
  public Adapter createIfSqlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IfSqlFragment <em>If Sql Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IfSqlFragment
   * @generated
   */
  public Adapter createIfSqlFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IfMetaSql <em>If Meta Sql</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IfMetaSql
   * @generated
   */
  public Adapter createIfMetaSqlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IfSqlCond <em>If Sql Cond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IfSqlCond
   * @generated
   */
  public Adapter createIfSqlCondAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IfSqlBool <em>If Sql Bool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IfSqlBool
   * @generated
   */
  public Adapter createIfSqlBoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.OrdSql <em>Ord Sql</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.OrdSql
   * @generated
   */
  public Adapter createOrdSqlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.OrdSql2 <em>Ord Sql2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.OrdSql2
   * @generated
   */
  public Adapter createOrdSql2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Column
   * @generated
   */
  public Adapter createColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExtendedColumn <em>Extended Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExtendedColumn
   * @generated
   */
  public Adapter createExtendedColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExtendedColumnName <em>Extended Column Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExtendedColumnName
   * @generated
   */
  public Adapter createExtendedColumnNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Constant
   * @generated
   */
  public Adapter createConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Identifier
   * @generated
   */
  public Adapter createIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ConstantOperator <em>Constant Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ConstantOperator
   * @generated
   */
  public Adapter createConstantOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.IdentifierOperator <em>Identifier Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.IdentifierOperator
   * @generated
   */
  public Adapter createIdentifierOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseColumn <em>Database Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseColumn
   * @generated
   */
  public Adapter createDatabaseColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.DatabaseTable <em>Database Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.DatabaseTable
   * @generated
   */
  public Adapter createDatabaseTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MappingRule <em>Mapping Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MappingRule
   * @generated
   */
  public Adapter createMappingRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MappingItem <em>Mapping Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MappingItem
   * @generated
   */
  public Adapter createMappingItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MappingColumn <em>Mapping Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MappingColumn
   * @generated
   */
  public Adapter createMappingColumnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.ExtendedMappingItem <em>Extended Mapping Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.ExtendedMappingItem
   * @generated
   */
  public Adapter createExtendedMappingItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.MappingColumnName <em>Mapping Column Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.MappingColumnName
   * @generated
   */
  public Adapter createMappingColumnNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.OptionalFeature <em>Optional Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.OptionalFeature
   * @generated
   */
  public Adapter createOptionalFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sqlproc.meta.processorMeta.PojoType <em>Pojo Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sqlproc.meta.processorMeta.PojoType
   * @generated
   */
  public Adapter createPojoTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ProcessorMetaAdapterFactory
