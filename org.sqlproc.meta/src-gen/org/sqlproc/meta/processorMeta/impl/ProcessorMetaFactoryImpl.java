/**
 */
package org.sqlproc.meta.processorMeta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sqlproc.meta.processorMeta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessorMetaFactoryImpl extends EFactoryImpl implements ProcessorMetaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessorMetaFactory init()
  {
    try
    {
      ProcessorMetaFactory theProcessorMetaFactory = (ProcessorMetaFactory)EPackage.Registry.INSTANCE.getEFactory(ProcessorMetaPackage.eNS_URI);
      if (theProcessorMetaFactory != null)
      {
        return theProcessorMetaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ProcessorMetaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorMetaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ProcessorMetaPackage.ARTIFACTS: return createArtifacts();
      case ProcessorMetaPackage.DATABASE_CATALOG_ASSIGNEMENT: return createDatabaseCatalogAssignement();
      case ProcessorMetaPackage.DATABASE_SCHEMA_ASSIGNEMENT: return createDatabaseSchemaAssignement();
      case ProcessorMetaPackage.DATABASE_TYPE_ASSIGNEMENT: return createDatabaseTypeAssignement();
      case ProcessorMetaPackage.DATABASE_META_INFO_ASSIGNEMENT: return createDatabaseMetaInfoAssignement();
      case ProcessorMetaPackage.DRIVER_META_INFO_ASSIGNEMENT: return createDriverMetaInfoAssignement();
      case ProcessorMetaPackage.DRIVER_METHOD_OUTPUT_ASSIGNEMENT: return createDriverMethodOutputAssignement();
      case ProcessorMetaPackage.SQL_TYPE_ASSIGNEMENT: return createSqlTypeAssignement();
      case ProcessorMetaPackage.COLUMN_TYPE_ASSIGNEMENT: return createColumnTypeAssignement();
      case ProcessorMetaPackage.SHOW_COLUMN_TYPE_ASSIGNEMENT: return createShowColumnTypeAssignement();
      case ProcessorMetaPackage.TABLE_ASSIGNEMENT: return createTableAssignement();
      case ProcessorMetaPackage.JOIN_TABLE_ASSIGNEMENT: return createJoinTableAssignement();
      case ProcessorMetaPackage.COLUMN_ASSIGNEMENT: return createColumnAssignement();
      case ProcessorMetaPackage.IMPORT_ASSIGNEMENT: return createImportAssignement();
      case ProcessorMetaPackage.EXPORT_ASSIGNEMENT: return createExportAssignement();
      case ProcessorMetaPackage.INHERITANCE_ASSIGNEMENT: return createInheritanceAssignement();
      case ProcessorMetaPackage.MANY_TO_MANY_ASSIGNEMENT: return createManyToManyAssignement();
      case ProcessorMetaPackage.DEBUG_LEVEL_ASSIGNEMENT: return createDebugLevelAssignement();
      case ProcessorMetaPackage.PROCEDURE_POJO_ASSIGNEMENT: return createProcedurePojoAssignement();
      case ProcessorMetaPackage.FUNCTION_POJO_ASSIGNEMENT: return createFunctionPojoAssignement();
      case ProcessorMetaPackage.IMPLEMENTS_ASSIGNEMENT: return createImplementsAssignement();
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT: return createExtendsAssignement();
      case ProcessorMetaPackage.IMPLEMENTS_ASSIGNEMENT_GENERICS: return createImplementsAssignementGenerics();
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT_GENERICS: return createExtendsAssignementGenerics();
      case ProcessorMetaPackage.PROPERTY: return createProperty();
      case ProcessorMetaPackage.DATABASE_PROPERTY: return createDatabaseProperty();
      case ProcessorMetaPackage.POJOGEN_PROPERTY: return createPojogenProperty();
      case ProcessorMetaPackage.META_TYPE_ASSIGNEMENT: return createMetaTypeAssignement();
      case ProcessorMetaPackage.METAGEN_PROPERTY: return createMetagenProperty();
      case ProcessorMetaPackage.DAOGEN_PROPERTY: return createDaogenProperty();
      case ProcessorMetaPackage.POJO_DEFINITION: return createPojoDefinition();
      case ProcessorMetaPackage.TABLE_DEFINITION: return createTableDefinition();
      case ProcessorMetaPackage.PROCEDURE_DEFINITION: return createProcedureDefinition();
      case ProcessorMetaPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case ProcessorMetaPackage.META_STATEMENT: return createMetaStatement();
      case ProcessorMetaPackage.SQL: return createSql();
      case ProcessorMetaPackage.SQL_FRAGMENT: return createSqlFragment();
      case ProcessorMetaPackage.META_SQL: return createMetaSql();
      case ProcessorMetaPackage.IF_SQL: return createIfSql();
      case ProcessorMetaPackage.IF_SQL_FRAGMENT: return createIfSqlFragment();
      case ProcessorMetaPackage.IF_META_SQL: return createIfMetaSql();
      case ProcessorMetaPackage.IF_SQL_COND: return createIfSqlCond();
      case ProcessorMetaPackage.IF_SQL_BOOL: return createIfSqlBool();
      case ProcessorMetaPackage.ORD_SQL: return createOrdSql();
      case ProcessorMetaPackage.ORD_SQL2: return createOrdSql2();
      case ProcessorMetaPackage.COLUMN: return createColumn();
      case ProcessorMetaPackage.EXTENDED_COLUMN: return createExtendedColumn();
      case ProcessorMetaPackage.EXTENDED_COLUMN_NAME: return createExtendedColumnName();
      case ProcessorMetaPackage.CONSTANT: return createConstant();
      case ProcessorMetaPackage.IDENTIFIER: return createIdentifier();
      case ProcessorMetaPackage.CONSTANT_OPERATOR: return createConstantOperator();
      case ProcessorMetaPackage.IDENTIFIER_OPERATOR: return createIdentifierOperator();
      case ProcessorMetaPackage.DATABASE_COLUMN: return createDatabaseColumn();
      case ProcessorMetaPackage.DATABASE_TABLE: return createDatabaseTable();
      case ProcessorMetaPackage.MAPPING_RULE: return createMappingRule();
      case ProcessorMetaPackage.MAPPING: return createMapping();
      case ProcessorMetaPackage.MAPPING_ITEM: return createMappingItem();
      case ProcessorMetaPackage.MAPPING_COLUMN: return createMappingColumn();
      case ProcessorMetaPackage.EXTENDED_MAPPING_ITEM: return createExtendedMappingItem();
      case ProcessorMetaPackage.MAPPING_COLUMN_NAME: return createMappingColumnName();
      case ProcessorMetaPackage.OPTIONAL_FEATURE: return createOptionalFeature();
      case ProcessorMetaPackage.POJO_TYPE: return createPojoType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifacts createArtifacts()
  {
    ArtifactsImpl artifacts = new ArtifactsImpl();
    return artifacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseCatalogAssignement createDatabaseCatalogAssignement()
  {
    DatabaseCatalogAssignementImpl databaseCatalogAssignement = new DatabaseCatalogAssignementImpl();
    return databaseCatalogAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseSchemaAssignement createDatabaseSchemaAssignement()
  {
    DatabaseSchemaAssignementImpl databaseSchemaAssignement = new DatabaseSchemaAssignementImpl();
    return databaseSchemaAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTypeAssignement createDatabaseTypeAssignement()
  {
    DatabaseTypeAssignementImpl databaseTypeAssignement = new DatabaseTypeAssignementImpl();
    return databaseTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseMetaInfoAssignement createDatabaseMetaInfoAssignement()
  {
    DatabaseMetaInfoAssignementImpl databaseMetaInfoAssignement = new DatabaseMetaInfoAssignementImpl();
    return databaseMetaInfoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMetaInfoAssignement createDriverMetaInfoAssignement()
  {
    DriverMetaInfoAssignementImpl driverMetaInfoAssignement = new DriverMetaInfoAssignementImpl();
    return driverMetaInfoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DriverMethodOutputAssignement createDriverMethodOutputAssignement()
  {
    DriverMethodOutputAssignementImpl driverMethodOutputAssignement = new DriverMethodOutputAssignementImpl();
    return driverMethodOutputAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlTypeAssignement createSqlTypeAssignement()
  {
    SqlTypeAssignementImpl sqlTypeAssignement = new SqlTypeAssignementImpl();
    return sqlTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnTypeAssignement createColumnTypeAssignement()
  {
    ColumnTypeAssignementImpl columnTypeAssignement = new ColumnTypeAssignementImpl();
    return columnTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowColumnTypeAssignement createShowColumnTypeAssignement()
  {
    ShowColumnTypeAssignementImpl showColumnTypeAssignement = new ShowColumnTypeAssignementImpl();
    return showColumnTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableAssignement createTableAssignement()
  {
    TableAssignementImpl tableAssignement = new TableAssignementImpl();
    return tableAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinTableAssignement createJoinTableAssignement()
  {
    JoinTableAssignementImpl joinTableAssignement = new JoinTableAssignementImpl();
    return joinTableAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnAssignement createColumnAssignement()
  {
    ColumnAssignementImpl columnAssignement = new ColumnAssignementImpl();
    return columnAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportAssignement createImportAssignement()
  {
    ImportAssignementImpl importAssignement = new ImportAssignementImpl();
    return importAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExportAssignement createExportAssignement()
  {
    ExportAssignementImpl exportAssignement = new ExportAssignementImpl();
    return exportAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceAssignement createInheritanceAssignement()
  {
    InheritanceAssignementImpl inheritanceAssignement = new InheritanceAssignementImpl();
    return inheritanceAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManyToManyAssignement createManyToManyAssignement()
  {
    ManyToManyAssignementImpl manyToManyAssignement = new ManyToManyAssignementImpl();
    return manyToManyAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugLevelAssignement createDebugLevelAssignement()
  {
    DebugLevelAssignementImpl debugLevelAssignement = new DebugLevelAssignementImpl();
    return debugLevelAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedurePojoAssignement createProcedurePojoAssignement()
  {
    ProcedurePojoAssignementImpl procedurePojoAssignement = new ProcedurePojoAssignementImpl();
    return procedurePojoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionPojoAssignement createFunctionPojoAssignement()
  {
    FunctionPojoAssignementImpl functionPojoAssignement = new FunctionPojoAssignementImpl();
    return functionPojoAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignement createImplementsAssignement()
  {
    ImplementsAssignementImpl implementsAssignement = new ImplementsAssignementImpl();
    return implementsAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignement createExtendsAssignement()
  {
    ExtendsAssignementImpl extendsAssignement = new ExtendsAssignementImpl();
    return extendsAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementsAssignementGenerics createImplementsAssignementGenerics()
  {
    ImplementsAssignementGenericsImpl implementsAssignementGenerics = new ImplementsAssignementGenericsImpl();
    return implementsAssignementGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsAssignementGenerics createExtendsAssignementGenerics()
  {
    ExtendsAssignementGenericsImpl extendsAssignementGenerics = new ExtendsAssignementGenericsImpl();
    return extendsAssignementGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseProperty createDatabaseProperty()
  {
    DatabasePropertyImpl databaseProperty = new DatabasePropertyImpl();
    return databaseProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojogenProperty createPojogenProperty()
  {
    PojogenPropertyImpl pojogenProperty = new PojogenPropertyImpl();
    return pojogenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaTypeAssignement createMetaTypeAssignement()
  {
    MetaTypeAssignementImpl metaTypeAssignement = new MetaTypeAssignementImpl();
    return metaTypeAssignement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetagenProperty createMetagenProperty()
  {
    MetagenPropertyImpl metagenProperty = new MetagenPropertyImpl();
    return metagenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaogenProperty createDaogenProperty()
  {
    DaogenPropertyImpl daogenProperty = new DaogenPropertyImpl();
    return daogenProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoDefinition createPojoDefinition()
  {
    PojoDefinitionImpl pojoDefinition = new PojoDefinitionImpl();
    return pojoDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDefinition createTableDefinition()
  {
    TableDefinitionImpl tableDefinition = new TableDefinitionImpl();
    return tableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureDefinition createProcedureDefinition()
  {
    ProcedureDefinitionImpl procedureDefinition = new ProcedureDefinitionImpl();
    return procedureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaStatement createMetaStatement()
  {
    MetaStatementImpl metaStatement = new MetaStatementImpl();
    return metaStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sql createSql()
  {
    SqlImpl sql = new SqlImpl();
    return sql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlFragment createSqlFragment()
  {
    SqlFragmentImpl sqlFragment = new SqlFragmentImpl();
    return sqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaSql createMetaSql()
  {
    MetaSqlImpl metaSql = new MetaSqlImpl();
    return metaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSql createIfSql()
  {
    IfSqlImpl ifSql = new IfSqlImpl();
    return ifSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlFragment createIfSqlFragment()
  {
    IfSqlFragmentImpl ifSqlFragment = new IfSqlFragmentImpl();
    return ifSqlFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfMetaSql createIfMetaSql()
  {
    IfMetaSqlImpl ifMetaSql = new IfMetaSqlImpl();
    return ifMetaSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlCond createIfSqlCond()
  {
    IfSqlCondImpl ifSqlCond = new IfSqlCondImpl();
    return ifSqlCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfSqlBool createIfSqlBool()
  {
    IfSqlBoolImpl ifSqlBool = new IfSqlBoolImpl();
    return ifSqlBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql createOrdSql()
  {
    OrdSqlImpl ordSql = new OrdSqlImpl();
    return ordSql;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdSql2 createOrdSql2()
  {
    OrdSql2Impl ordSql2 = new OrdSql2Impl();
    return ordSql2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedColumn createExtendedColumn()
  {
    ExtendedColumnImpl extendedColumn = new ExtendedColumnImpl();
    return extendedColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedColumnName createExtendedColumnName()
  {
    ExtendedColumnNameImpl extendedColumnName = new ExtendedColumnNameImpl();
    return extendedColumnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantOperator createConstantOperator()
  {
    ConstantOperatorImpl constantOperator = new ConstantOperatorImpl();
    return constantOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierOperator createIdentifierOperator()
  {
    IdentifierOperatorImpl identifierOperator = new IdentifierOperatorImpl();
    return identifierOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseColumn createDatabaseColumn()
  {
    DatabaseColumnImpl databaseColumn = new DatabaseColumnImpl();
    return databaseColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseTable createDatabaseTable()
  {
    DatabaseTableImpl databaseTable = new DatabaseTableImpl();
    return databaseTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingRule createMappingRule()
  {
    MappingRuleImpl mappingRule = new MappingRuleImpl();
    return mappingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingItem createMappingItem()
  {
    MappingItemImpl mappingItem = new MappingItemImpl();
    return mappingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingColumn createMappingColumn()
  {
    MappingColumnImpl mappingColumn = new MappingColumnImpl();
    return mappingColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendedMappingItem createExtendedMappingItem()
  {
    ExtendedMappingItemImpl extendedMappingItem = new ExtendedMappingItemImpl();
    return extendedMappingItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingColumnName createMappingColumnName()
  {
    MappingColumnNameImpl mappingColumnName = new MappingColumnNameImpl();
    return mappingColumnName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalFeature createOptionalFeature()
  {
    OptionalFeatureImpl optionalFeature = new OptionalFeatureImpl();
    return optionalFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoType createPojoType()
  {
    PojoTypeImpl pojoType = new PojoTypeImpl();
    return pojoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorMetaPackage getProcessorMetaPackage()
  {
    return (ProcessorMetaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ProcessorMetaPackage getPackage()
  {
    return ProcessorMetaPackage.eINSTANCE;
  }

} //ProcessorMetaFactoryImpl
