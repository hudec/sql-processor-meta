package org.sqlproc.meta.property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.sqlproc.meta.processorMeta.Artifacts;
import org.sqlproc.meta.processorMeta.DaogenProperty;
import org.sqlproc.meta.processorMeta.DatabaseProperty;
import org.sqlproc.meta.processorMeta.ExportAssignement;
import org.sqlproc.meta.processorMeta.ImportAssignement;
import org.sqlproc.meta.processorMeta.InheritanceAssignement;
import org.sqlproc.meta.processorMeta.JoinTableAssignement;
import org.sqlproc.meta.processorMeta.ManyToManyAssignement;
import org.sqlproc.meta.processorMeta.MetaTypeAssignement;
import org.sqlproc.meta.processorMeta.MetagenProperty;
import org.sqlproc.meta.processorMeta.PojoType;
import org.sqlproc.meta.processorMeta.PojogenProperty;
import org.sqlproc.meta.processorMeta.Property;
import org.sqlproc.meta.processorMeta.PropertyCondition;
import org.sqlproc.meta.processorMeta.ValueType;
import org.sqlproc.meta.util.Utils;

import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean extends AdapterImpl implements ModelProperty {

    protected Logger LOGGER = Logger.getLogger(ModelPropertyBean.class);

    public static final String RESOLVE_POJO_ON = "resolve-pojo-on";
    public static final String RESOLVE_POJO_OFF = "resolve-pojo-off";
    public static final String REPLACE_ALL_REGEX = "replace-all-regex";
    public static final String REPLACE_ALL_REPLACEMENT = "replace-all-replacement";
    public static final String COMPRESS_META_DIRECTIVES = "compress-meta-directives";
    public static final String DATABASE = "database";
    public static final String DATABASE_IS_ONLINE = "is-online";
    public static final String DATABASE_IS_OFFLINE = "is-offline";
    public static final String DATABASE_HAS_URL = "has-url";
    public static final String DATABASE_EXECUTE_BEFORE = "ddl-create";
    public static final String DATABASE_EXECUTE_AFTER = "ddl-drop";
    public static final String DATABASE_LOGIN_USERNAME = "login-username";
    public static final String DATABASE_LOGIN_NPASSWORD = "login-password";
    public static final String DATABASE_IN_CATALOG = "in-catalog";
    public static final String DATABASE_ACTIVE_SCHEMA = "active-schema";
    public static final String DATABASE_JDBC_DRIVER = "jdbc-driver";
    public static final String DATABASE_INDEX_TYPES = "index-types";
    public static final String DATABASE_SKIP_INDEXES = "skip-indexes";
    public static final String DATABASE_SKIP_CHECK_CONSTRAINTS = "skip-check-constraints";
    public static final String DATABASE_SKIP_PROCEDURES = "skip-functions-procedures";
    public static final String DATABASE_OF_TYPE = "is-of-type";
    public static final String DATABASE_DEBUG_LEVEL = "debug-level";
    public static final String DATABASE_TAKE_COMMENTS = "take-comments";
    public static final String DATABASE_LOWERCASE_NAMES = "lowercase-names";
    public static final String DATABASE_UPPERCASE_NAMES = "uppercase-names";
    public static final String POJOGEN = "pojogen";
    public static final String POJOGEN_TYPE_SQLTYPES = "types-sqltypes";
    public static final String POJOGEN_TYPE_IN_TABLE = "types-in-table";
    public static final String POJOGEN_TYPE_FOR_COLUMNS = "types-for-columns";
    public static final String POJOGEN_TYPE_FOR_PROCEDURE = "types-for-procedure";
    public static final String POJOGEN_TYPE_FOR_FUNCTION = "types-for-function";
    public static final String POJOGEN_IGNORE_TABLES = "ignore-tables";
    public static final String POJOGEN_ONLY_TABLES = "only-tables";
    public static final String POJOGEN_IGNORE_COLUMNS = "ignore-columns";
    public static final String POJOGEN_REQUIRED_COLUMNS = "required-columns";
    public static final String POJOGEN_NOT_REQUIRED_COLUMNS = "not-required-columns";
    public static final String POJOGEN_CREATE_COLUMNS = "create-columns";
    public static final String POJOGEN_RENAME_TABLES = "rename-tables";
    public static final String POJOGEN_RENAME_COLUMNS = "rename-columns";
    public static final String POJOGEN_IGNORE_EXPORTS = "ignore-one-to-many";
    public static final String POJOGEN_IGNORE_IMPORTS = "ignore-many-to-one";
    public static final String POJOGEN_CREATE_EXPORTS = "create-one-to-many";
    public static final String POJOGEN_CREATE_IMPORTS = "create-many-to-one";
    public static final String POJOGEN_INHERIT_IMPORTS = "inherit-many-to-one";
    public static final String POJOGEN_MANY_TO_MANY_IMPORTS = "table-many-to-many";
    public static final String POJOGEN_INHERITANCE = "inherit-discriminator";
    public static final String POJOGEN_GENERATE_METHODS = "generate-methods";
    public static final String POJOGEN_GENERATE_OPERATORS = "generate-operators";
    public static final String POJOGEN_IMPLEMENTS_INTERFACES = "implements-interfaces";
    public static final String POJOGEN_EXTENDS_CLASS = "extends-class";
    public static final String POJOGEN_IMPLEMENTS_INTERFACES_GENERICS = "implements-interfaces-generics";
    public static final String POJOGEN_EXTENDS_CLASS_GENERICS = "extends-class-generics";
    public static final String POJOGEN_JOIN_TABLES = "join-tables";
    public static final String POJOGEN_GENERATE_WRAPPERS = "generate-wrappers";
    public static final String POJOGEN_GENERATE_VALIDATION_ANNOTATIONS = "generate-validation-annotations";
    public static final String POJOGEN_NOT_ABSTRACT_TABLES_TABLES = "not-abstract-tables";
    public static final String POJOGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String POJOGEN_VERSION_COLUMN = "version-column";
    public static final String POJOGEN_DEBUG_LEVEL = "debug-level";
    public static final String POJOGEN_PRESERVE_FOREIGN_KEYS = "preserve-foreign-keys";
    public static final String POJOGEN_POJOS_FOR_PROCEDURES = "pojos-for-procedures";
    public static final String POJOGEN_POJOS_FOR_FUNCTIONS = "pojos-for-functions";
    public static final String POJOGEN_ACTIVE_FILTER = "active-filter";
    public static final String POJOGEN_PACKAGE = "package";
    public static final String POJOGEN_ENUM_FOR_CHECK_CONSTRAINTS = "enum-for-check-constraints";
    public static final String METAGEN = "metagen";
    public static final String METAGEN_GLOBAL_SEQUENCE = "global-sequence";
    public static final String METAGEN_TABLE_SEQUENCE = "table-sequence";
    public static final String METAGEN_GLOBAL_IDENTITY = "global-identity";
    public static final String METAGEN_TABLE_IDENTITY = "table-identity";
    public static final String METAGEN_COLUMN_META_TYPE = "column-meta-type";
    public static final String METAGEN_STATEMENT_META_TYPE = "statement-meta-type";
    public static final String METAGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String METAGEN_LIKE_COLUMNS = "like-columns";
    public static final String METAGEN_NOT_LIKE_COLUMNS = "not-like-columns";
    public static final String METAGEN_GENERATE_SEQUENCES = "generate-sequences";
    public static final String METAGEN_GENERATE_IDENTITIES = "generate-identities";
    public static final String METAGEN_GENERATE_IDGENERATORS = "generate-idgenerators";
    public static final String METAGEN_GENERATE_INDIRECT_IDGENERATORS = "generate-default-idgenerators";
    public static final String METAGEN_FUNCTION_RESULT = "function-result";
    public static final String METAGEN_FUNCTION_RESULT_SET = "function-result-set";
    public static final String METAGEN_PROCEDURE_RESULT_SET = "procedure-result-set";
    public static final String METAGEN_DEBUG_LEVEL = "debug-level";
    public static final String METAGEN_GENERATE_OPERATORS = "generate-operators";
    public static final String METAGEN_OPTIMIZE_INSERT = "optimize-insert";
    public static final String METAGEN_OPTIONAL_FEATURES = "optional-features";
    public static final String METAGEN_ACTIVE_FILTER = "active-filter";
    public static final String DAOGEN = "daogen";
    public static final String DAOGEN_IGNORE_TABLES = "ignore-tables";
    public static final String DAOGEN_ONLY_TABLES = "only-tables";
    public static final String DAOGEN_IMPLEMENTS_INTERFACES = "implements-interfaces";
    public static final String DAOGEN_EXTENDS_CLASS = "extends-class";
    public static final String DAOGEN_IMPLEMENTS_INTERFACES_GENERICS = "implements-interfaces-generics";
    public static final String DAOGEN_EXTENDS_CLASS_GENERICS = "extends-class-generics";
    public static final String DAOGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String DAOGEN_FUNCTION_RESULT = "function-result";
    public static final String DAOGEN_DEBUG_LEVEL = "debug-level";
    public static final String DAOGEN_ACTIVE_FILTER = "active-filter";
    public static final String DAOGEN_PACKAGE = "package";

    public static final String GLOBAL = "___GLOBAL";

    public static class PairValues {
        public String value1;
        public String value2;

        public PairValues(String value1, String value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }

    public static class ModelValues1 {
        private boolean doResolvePojo;
        private boolean doResolveDb;
        private Map<String, String> replaceAllRegex;
        private Map<String, String> replaceAllReplacement;
        private boolean doCompressMetaDirectives;

        private String dbDriver;
        private String dbUrl;
        private String dbUsername;
        private String dbPassword;
        private String dbCatalog;
        private String dbSchema;
        private String dbSqlsBefore;
        private String dbSqlsAfter;
        private String dbIndexTypes;
        private boolean dbSkipIndexes;
        private boolean dbSkipProcedures;
        private boolean dbSkipCheckConstraints;
        private String dbType;
        private String dbDebugLevel;
        private String dbDebugScope;
        private boolean dbTakeComments;
        private boolean dbLowercaseNames;
        private boolean dbUppercaseNames;

        private Map<String, PojoAttrType> pojoSqlTypes;
        private Map<String, Map<String, PojoAttrType>> pojoTableTypes;
        private Map<String, Map<String, PojoAttrType>> pojoColumnTypes;
        private Map<String, Map<String, PojoAttrType>> pojoProcedureTypes;
        private Map<String, Map<String, PojoAttrType>> pojoFunctionTypes;
        private Map<String, String> pojoTableNames;
        private Map<String, Map<String, String>> pojoColumnNames;
        private Set<String> pojoIgnoreTables;
        private Set<String> pojoOnlyTables;
        private Set<String> pojoNotAbstractTables;
        private Map<String, Set<String>> pojoIgnoreColumns;
        private Map<String, Set<String>> pojoRequiredColumns;
        private Map<String, Set<String>> pojoNotRequiredColumns;
        private Map<String, Map<String, PojoAttrType>> pojoCreateColumns;
        private Map<String, Map<String, Map<String, String>>> pojoIgnoreExports;
        private Map<String, Map<String, Map<String, String>>> pojoIgnoreImports;
        private Map<String, Map<String, Map<String, String>>> pojoCreateExports;
        private Map<String, Map<String, Map<String, String>>> pojoCreateImports;
        private Map<String, Map<String, Map<String, String>>> pojoInheritImports;
        private Map<String, Map<String, Map<String, String>>> pojoManyToManyImports;
        private Map<String, Map<String, Map<String, List<String>>>> pojoInheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
        private Map<String, String> pojoInheritanceColumns;
        private Set<String> pojoGenerateMethods;
        private String pojoGenerateOperators;
        private Map<String, ImplementsExtends> pojoToImplements;
        private ImplementsExtends pojoToExtends;
        private Map<String, List<String>> pojoJoinTables;
        private boolean pojoDoGenerateWrappers;
        private boolean pojoDoGenerateValidationAnnotations;
        private boolean pojoMakeItFinal;
        private String pojoVersionColumn;
        private Map<String, Set<String>> pojoVersionColumns;
        private Map<String, Set<String>> pojoNotVersionColumns;
        private String pojoDebugLevel;
        private String pojoDebugScope;
        private Set<String> pojoPreserveForeignKeys;
        private Map<String, PojoType> pojoPojosForProcedures;
        private Map<String, PojoType> pojoPojosForFunctions;
        private String pojoActiveFilter;
        private String pojoPackage;
        private Map<String, String> pojoEnumForCheckConstraints;

        private PairValues metaGlobalSequence;
        private Map<String, PairValues> metaTablesSequence;
        private PairValues metaGlobalIdentity;
        private Map<String, PairValues> metaTablesIdentity;
        private Map<String, Map<String, PairValues>> metaColumnsMetaTypes;
        private Map<String, Map<String, PairValues>> metaStatementsMetaTypes;
        private boolean metaMakeItFinal;
        private Map<String, Set<String>> metaLikeColumns;
        private Map<String, Set<String>> metaNotLikeColumns;
        private boolean metaGenerateSequences;
        private Set<String> metaGlobalSequenceForTables;
        private Set<String> metaGlobalSequenceNotForTables;
        private boolean metaGenerateIdentities;
        private Set<String> metaGlobalIdentityForTables;
        private Set<String> metaGlobalIdentityNotForTables;
        private boolean metaGenerateIdGenerators;
        private boolean metaGenerateIndirectIdGenerators;
        private Map<String, String> metaFunctionsResult;
        private Map<String, String> metaFunctionsResultSet;
        private Map<String, String> metaProceduresResultSet;
        private String metaDebugLevel;
        private String metaDebugScope;
        private boolean metaGenerateOperators;
        private Set<String> metaOptimizeInsert;
        private Map<String, Set<String>> metaOptionalFeatures;
        private String metaActiveFilter;

        private Set<String> daoIgnoreTables;
        private Set<String> daoOnlyTables;
        private Map<String, ImplementsExtends> daoToImplements;
        private ImplementsExtends daoToExtends;
        private boolean daoMakeItFinal;
        private Map<String, PojoType> daoFunctionsResult;
        private String daoDebugLevel;
        private String daoDebugScope;
        private String daoActiveFilter;
        private String daoPackage;
    }

    public static class ModelValues {
        public static final String DEFAULT = "_DEFAULT_";
        public static final String GLOBAL = "_GLOBAL_";
        public static final String DATABASE = "_DATABASE_";
        public static final String POJOGEN = "_POJOGEN_";
        public static final String METAGEN = "_METAGEN_";
        public static final String DAOGEN = "_DAOGEN_";
        public static final String[] ALL = { GLOBAL, DATABASE, POJOGEN, METAGEN, DAOGEN };

        Map<String, ModelValues1> defaultValues;
        Map<String, Map<String, Map<String, ModelValues1>>> values;
        public Boolean doResolveDb;

        public ModelValues() {
            values = new HashMap<String, Map<String, Map<String, ModelValues1>>>();
            defaultValues = new HashMap<String, ModelValues1>();
            for (String name : ALL)
                initModel(name);
        }

        public String dir;

        public ModelValues1 initModel(String name) {
            values.put(name, new HashMap<String, Map<String, ModelValues1>>());
            ModelValues1 defaultModel = new ModelValues1();
            defaultValues.put(name, defaultModel);
            System.out.println("Initialized model for " + name);
            return defaultModel;
        }

        public ModelValues1 initModel(String name, String key, String value) {
            Map<String, Map<String, ModelValues1>> modelValues = values.get(name);
            Map<String, ModelValues1> modelValuesKey = modelValues.get(key);
            if (modelValuesKey == null) {
                modelValues.put(key, modelValuesKey = new HashMap<String, ModelValues1>());
                System.out.println("Initialized key model for " + name + " and " + key);
            }
            ModelValues1 model = modelValuesKey.get(value);
            if (model == null) {
                modelValuesKey.put(key, model = new ModelValues1());
                System.out.println("Initialized value model for " + name + " and " + key + " = " + value);
            }
            return model;
        }

        public ModelValues1 initModel(String name, PropertyCondition condition) {
            if (condition == null || condition.getName() == null || condition.getValue() == null)
                return defaultValues.get(name);
            return initModel(name, condition.getName(), ModelPropertyBean.getPropertyValue(condition.getValue()));
        }

        public ModelValues1 getModel(String name) {
            Map<String, Map<String, ModelValues1>> modelValues = values.get(name);
            for (Entry<String, Map<String, ModelValues1>> e : modelValues.entrySet()) {
                String value = System.getenv(e.getKey());
                if (e.getValue().containsKey(value)) {
                    System.out.println("Returned special model for " + name + " and " + e.getKey() + " = " + value);
                    return e.getValue().get(value);
                }
            }
            return defaultValues.get(name);
        }
    }

    private static final String FAKE_DIR = "_XXX";
    private Map<String, ModelValues> dirs2models = new HashMap<String, ModelValues>();

    public ModelPropertyBean() {
    }

    public ModelPropertyBean(ModelValues modelValues) {
        dirs2models.put(FAKE_DIR, modelValues);
    }

    @Override
    public void notifyChanged(Notification msg) {
        if (msg.getNotifier() == null || msg.getFeatureID(Resource.class) == Notification.NO_FEATURE_ID)
            return;

        if (msg.getNotifier() instanceof XtextResource) {
            int featureID = msg.getFeatureID(Resource.class);

            if (featureID == Resource.RESOURCE__IS_LOADED) {
                XtextResource resource = (XtextResource) msg.getNotifier();

                if (!msg.getNewBooleanValue()) {
                    LOGGER.debug("UNLOADED RESOURCE " + resource);
                    return;
                }

                IParseResult parseResult = resource.getParseResult();
                EObject rootASTElement = (parseResult != null) ? parseResult.getRootASTElement() : null;
                LOGGER.debug("LOADED RESOURCE " + resource + " for " + rootASTElement);
                if (parseResult == null || rootASTElement == null || !(rootASTElement instanceof Artifacts)
                        || resource.getURI() == null) {
                    LOGGER.error("LOADED RESOURCE IS NOT VALID: for parseResult " + parseResult
                            + " and rootASTElement " + rootASTElement + " and msg " + msg);
                    return;
                }
                String dir = Utils.resourceDir(resource);
                if (dir == null) {
                    LOGGER.error("LOADED RESOURCE URI IS NOT VALID " + resource.getURI());
                    return;
                }

                ModelValues modelValues = null;
                if (dirs2models.containsKey(dir)) {
                    modelValues = dirs2models.get(dir);
                } else {
                    modelValues = new ModelValues();
                    dirs2models.put(dir, modelValues);
                    modelValues.dir = dir;
                }

                Artifacts artifacts = (Artifacts) rootASTElement;
                if (loadModel(modelValues, artifacts) == null)
                    return;

                LOGGER.debug("MODEL " + modelValues.toString());
            }
            // This is obsolete, just to document the possibilities
            // } else if (msg.getNotifier() instanceof Artifacts) {
            // if (msg.getFeature() instanceof EReference
            // && ((EReference) msg.getFeature()).getName().equals("properties")) {
            //
            // Property oldValue = (Property) msg.getOldValue();
            // Property newValue = (Property) msg.getNewValue();
            // Artifacts artifacts = (Artifacts) newValue.eContainer();
            //
            // if (msg.getEventType() == Notification.ADD) {
            // addValue(artifacts, newValue);
            // } else if (msg.getEventType() == Notification.REMOVE) {
            // resetValue(artifacts, newValue);
            // } else if (msg.getEventType() == Notification.SET) {
            // setValue(artifacts, newValue);
            // } else {
            // LOGGER.warn("UNNOWN PROPERTY ACTION " + msg);
            // }
            // // LOGGER.debug("PROPERTY " + ((newValue != null) ? newValue.getName() : "null"));
            // return;
            // }
        }
    }

    public static ModelValues loadModel(ModelValues modelValues, Artifacts artifacts) {

        if (artifacts.getProperties().isEmpty())
            return null;
        if (modelValues == null)
            modelValues = new ModelValues();

        initModel(modelValues);

        boolean firstDatabase = true;
        boolean firstPojogen = true;
        boolean firstMetagen = true;
        boolean firstDaogen = true;
        try {
            for (Property property : artifacts.getProperties()) {
                PropertyCondition condition = property.getCondition();
                if (property.getName().startsWith(DATABASE)) {
                    if (firstDatabase) {
                        firstDatabase = false;
                        initDatabaseModel(modelValues);
                    }
                    ModelValues1 modelValues1 = modelValues.initModel(ModelValues.DATABASE, condition);
                    setValue(modelValues1, property.getDatabase());
                } else if (property.getName().startsWith(POJOGEN)) {
                    if (firstPojogen) {
                        firstPojogen = false;
                        initPojogenModel(modelValues);
                    }
                    ModelValues1 modelValues1 = modelValues.initModel(ModelValues.POJOGEN, condition);
                    setValue(modelValues1, property.getPojogen());
                } else if (property.getName().startsWith(METAGEN)) {
                    if (firstMetagen) {
                        firstMetagen = false;
                        initMetagenModel(modelValues);
                    }
                    ModelValues1 modelValues1 = modelValues.initModel(ModelValues.METAGEN, condition);
                    setValue(modelValues1, property.getMetagen());
                } else if (property.getName().startsWith(DAOGEN)) {
                    if (firstDaogen) {
                        firstDaogen = false;
                        initDaogenModel(modelValues);
                    }
                    ModelValues1 modelValues1 = modelValues.initModel(ModelValues.DAOGEN, condition);
                    setValue(modelValues1, property.getDaogen());
                } else {
                    ModelValues1 modelValues1 = modelValues.initModel(ModelValues.GLOBAL, condition);
                    setValue(modelValues1, property);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        return modelValues;
    }

    private static void initModel(ModelValues modelValues) {
        ModelValues1 modelValues1 = modelValues.initModel(ModelValues.GLOBAL);
        modelValues1.replaceAllRegex = new HashMap<String, String>();
        modelValues1.replaceAllReplacement = new HashMap<String, String>();
        modelValues1.doCompressMetaDirectives = false;
    }

    private static void initDatabaseModel(ModelValues modelValues) {
        ModelValues1 modelValues1 = modelValues.initModel(ModelValues.DATABASE);
        modelValues1.doResolveDb = false;
        modelValues1.dbDriver = null;
        modelValues1.dbUrl = null;
        modelValues1.dbUsername = null;
        modelValues1.dbPassword = null;
        modelValues1.dbCatalog = null;
        modelValues1.dbSchema = null;
        modelValues1.dbSqlsBefore = null;
        modelValues1.dbSqlsAfter = null;
        modelValues1.dbIndexTypes = null;
        modelValues1.dbSkipIndexes = false;
        modelValues1.dbSkipProcedures = false;
        modelValues1.dbSkipCheckConstraints = false;
        modelValues1.dbType = null;
        modelValues1.dbDebugLevel = null;
        modelValues1.dbDebugScope = null;
        modelValues1.dbTakeComments = false;
        modelValues1.dbLowercaseNames = false;
        modelValues1.dbUppercaseNames = false;
    }

    private static void initPojogenModel(ModelValues modelValues) {
        ModelValues1 modelValues1 = modelValues.initModel(ModelValues.POJOGEN);
        modelValues1.pojoSqlTypes = new HashMap<String, PojoAttrType>();
        modelValues1.pojoTableTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues1.pojoColumnTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues1.pojoProcedureTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues1.pojoFunctionTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues1.pojoTableNames = new HashMap<String, String>();
        modelValues1.pojoColumnNames = new HashMap<String, Map<String, String>>();
        modelValues1.pojoIgnoreTables = new HashSet<String>();
        modelValues1.pojoOnlyTables = new HashSet<String>();
        modelValues1.pojoNotAbstractTables = new HashSet<String>();
        modelValues1.pojoIgnoreColumns = new HashMap<String, Set<String>>();
        modelValues1.pojoRequiredColumns = new HashMap<String, Set<String>>();
        modelValues1.pojoNotRequiredColumns = new HashMap<String, Set<String>>();
        modelValues1.pojoCreateColumns = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues1.pojoIgnoreExports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoIgnoreImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoCreateExports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoCreateImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoInheritImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoManyToManyImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues1.pojoInheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
        modelValues1.pojoInheritanceColumns = new HashMap<String, String>();
        modelValues1.pojoGenerateMethods = new HashSet<String>();
        modelValues1.pojoGenerateOperators = null;
        modelValues1.pojoToImplements = new HashMap<String, ImplementsExtends>();
        modelValues1.pojoToExtends = null;
        modelValues1.pojoJoinTables = new HashMap<String, List<String>>();
        modelValues1.pojoDoGenerateWrappers = false;
        modelValues1.pojoDoGenerateValidationAnnotations = false;
        modelValues1.pojoMakeItFinal = false;
        modelValues1.pojoVersionColumn = null;
        modelValues1.pojoVersionColumns = new HashMap<String, Set<String>>();
        modelValues1.pojoNotVersionColumns = new HashMap<String, Set<String>>();
        modelValues1.pojoDebugLevel = null;
        modelValues1.pojoDebugScope = null;
        modelValues1.pojoPreserveForeignKeys = new HashSet<String>();
        modelValues1.pojoPojosForProcedures = new HashMap<String, PojoType>();
        modelValues1.pojoPojosForFunctions = new HashMap<String, PojoType>();
        modelValues1.pojoActiveFilter = null;
        modelValues1.pojoPackage = null;
        modelValues1.pojoEnumForCheckConstraints = new HashMap<String, String>();
    }

    private static void initMetagenModel(ModelValues modelValues) {
        ModelValues1 modelValues1 = modelValues.initModel(ModelValues.METAGEN);
        modelValues1.metaGlobalSequence = null;
        modelValues1.metaTablesSequence = new HashMap<String, PairValues>();
        modelValues1.metaGlobalIdentity = null;
        modelValues1.metaTablesIdentity = new HashMap<String, PairValues>();
        modelValues1.metaColumnsMetaTypes = new HashMap<String, Map<String, PairValues>>();
        modelValues1.metaStatementsMetaTypes = new HashMap<String, Map<String, PairValues>>();
        modelValues1.metaMakeItFinal = false;
        modelValues1.metaLikeColumns = new HashMap<String, Set<String>>();
        modelValues1.metaNotLikeColumns = new HashMap<String, Set<String>>();
        modelValues1.metaGenerateSequences = false;
        modelValues1.metaGlobalSequenceForTables = new HashSet<String>();
        modelValues1.metaGlobalSequenceNotForTables = new HashSet<String>();
        modelValues1.metaGenerateIdentities = false;
        modelValues1.metaGlobalIdentityForTables = new HashSet<String>();
        modelValues1.metaGlobalIdentityNotForTables = new HashSet<String>();
        modelValues1.metaGenerateIdGenerators = false;
        modelValues1.metaGenerateIndirectIdGenerators = false;
        modelValues1.metaFunctionsResult = new HashMap<String, String>();
        modelValues1.metaFunctionsResultSet = new HashMap<String, String>();
        modelValues1.metaProceduresResultSet = new HashMap<String, String>();
        modelValues1.metaDebugLevel = null;
        modelValues1.metaDebugScope = null;
        modelValues1.metaGenerateOperators = false;
        modelValues1.metaOptimizeInsert = new HashSet<String>();
        modelValues1.metaOptionalFeatures = new HashMap<String, Set<String>>();
        modelValues1.metaActiveFilter = null;
    }

    private static void initDaogenModel(ModelValues modelValues) {
        ModelValues1 modelValues1 = modelValues.initModel(ModelValues.DAOGEN);
        modelValues1.daoIgnoreTables = new HashSet<String>();
        modelValues1.daoOnlyTables = new HashSet<String>();
        modelValues1.daoToImplements = new HashMap<String, ImplementsExtends>();
        modelValues1.daoToExtends = null;
        modelValues1.daoMakeItFinal = false;
        modelValues1.daoFunctionsResult = new HashMap<String, PojoType>();
        modelValues1.daoDebugLevel = null;
        modelValues1.daoDebugScope = null;
        modelValues1.daoActiveFilter = null;
        modelValues1.daoPackage = null;
    }

    public static void setValue(ModelValues1 modelValues1, Property property) {
        if (property == null)
            return;
        if (RESOLVE_POJO_ON.equals(property.getName())) {
            modelValues1.doResolvePojo = true;
        } else if (RESOLVE_POJO_OFF.equals(property.getName())) {
            modelValues1.doResolvePojo = false;
        } else if (REPLACE_ALL_REGEX.equals(property.getName())) {
            if (property.getRegex() != null && property.getReplaceId() != null)
                modelValues1.replaceAllRegex.put(property.getReplaceId(), getPropertyValue(property.getRegex()));
        } else if (REPLACE_ALL_REPLACEMENT.equals(property.getName())) {
            if (property.getReplacement() != null && property.getReplaceId() != null)
                modelValues1.replaceAllReplacement.put(property.getReplaceId(),
                        getPropertyValue(property.getReplacement()));
        } else if (COMPRESS_META_DIRECTIVES.equals(property.getName())) {
            modelValues1.doCompressMetaDirectives = true;
        }
    }

    public static void setValue(ModelValues1 modelValues1, DatabaseProperty property) {
        if (property == null)
            return;
        if (DATABASE_IS_ONLINE.equals(property.getName())) {
            modelValues1.doResolveDb = true;
        } else if (DATABASE_IS_OFFLINE.equals(property.getName())) {
            modelValues1.doResolveDb = false;
        } else if (DATABASE_HAS_URL.equals(property.getName())) {
            modelValues1.dbUrl = getPropertyValue(property.getDbUrl());
        } else if (DATABASE_LOGIN_USERNAME.equals(property.getName())) {
            modelValues1.dbUsername = getPropertyValue(property.getDbUsername());
        } else if (DATABASE_LOGIN_NPASSWORD.equals(property.getName())) {
            modelValues1.dbPassword = getPropertyValue(property.getDbPassword());
        } else if (DATABASE_IN_CATALOG.equals(property.getName())) {
            if (property.getDbCatalog() != null)
                modelValues1.dbCatalog = getPropertyValue(property.getDbCatalog().getDbCatalog());
            else
                modelValues1.dbCatalog = null;
        } else if (DATABASE_ACTIVE_SCHEMA.equals(property.getName())) {
            if (property.getDbSchema() != null)
                modelValues1.dbSchema = getPropertyValue(property.getDbSchema().getDbSchema());
            else
                modelValues1.dbSchema = null;
        } else if (DATABASE_JDBC_DRIVER.equals(property.getName())) {
            if (property.getDbDriverx() != null)
                modelValues1.dbDriver = getPropertyValue(property.getDbDriverx().getQualifiedName());
            else
                modelValues1.dbDriver = getPropertyValue(property.getDbDriver());
        } else if (DATABASE_EXECUTE_BEFORE.equals(property.getName())) {
            modelValues1.dbSqlsBefore = getPropertyValue(property.getDbExecuteBefore());
        } else if (DATABASE_EXECUTE_AFTER.equals(property.getName())) {
            modelValues1.dbSqlsAfter = getPropertyValue(property.getDbExecuteAfter());
        } else if (DATABASE_INDEX_TYPES.equals(property.getName())) {
            modelValues1.dbIndexTypes = getPropertyValue(property.getDbIndexTypes());
        } else if (DATABASE_SKIP_INDEXES.equals(property.getName())) {
            modelValues1.dbSkipIndexes = true;
        } else if (DATABASE_SKIP_PROCEDURES.equals(property.getName())) {
            modelValues1.dbSkipProcedures = true;
        } else if (DATABASE_SKIP_CHECK_CONSTRAINTS.equals(property.getName())) {
            modelValues1.dbSkipCheckConstraints = true;
        } else if (DATABASE_OF_TYPE.equals(property.getName())) {
            if (property.getDbType() != null)
                modelValues1.dbType = getPropertyValue(property.getDbType().getDbType());
            else
                modelValues1.dbType = null;
        } else if (DATABASE_DEBUG_LEVEL.equals(property.getName()) && property.getDebug() != null) {
            modelValues1.dbDebugLevel = property.getDebug().getDebug();
            modelValues1.dbDebugScope = getPropertyValue(property.getDebug().getScope());
        } else if (DATABASE_TAKE_COMMENTS.equals(property.getName())) {
            modelValues1.dbTakeComments = true;
        } else if (DATABASE_LOWERCASE_NAMES.equals(property.getName())) {
            modelValues1.dbLowercaseNames = true;
        } else if (DATABASE_UPPERCASE_NAMES.equals(property.getName())) {
            modelValues1.dbUppercaseNames = true;
        }
    }

    private static void setValue(ModelValues1 modelValues1, PojogenProperty property) {
        if (property == null)
            return;
        if (POJOGEN_TYPE_SQLTYPES.equals(property.getName())) {
            // if (modelValues1.sqlTypes == null)
            // modelValues1.sqlTypes = new HashMap<String, PojoAttrType>();
            for (int i = 0, m = property.getSqlTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getSqlTypes().get(i).getTypeName(), property
                        .getSqlTypes().get(i).getSize(), property.getSqlTypes().get(i).getType());
                modelValues1.pojoSqlTypes.put(type.getName() + type.getSize(), type);
            }
        } else if (POJOGEN_TYPE_IN_TABLE.equals(property.getName())) {
            // if (modelValues1.tableTypes == null)
            // modelValues1.tableTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues1.pojoTableTypes.containsKey(property.getDbTable()))
                modelValues1.pojoTableTypes.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getSqlTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getSqlTypes().get(i).getTypeName(), property
                        .getSqlTypes().get(i).getSize(), property.getSqlTypes().get(i).getType());
                modelValues1.pojoTableTypes.get(property.getDbTable()).put(type.getName() + type.getSize(), type);
            }
        } else if (POJOGEN_TYPE_FOR_COLUMNS.equals(property.getName())) {
            // if (modelValues1.columnTypes == null)
            // modelValues1.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues1.pojoColumnTypes.containsKey(property.getDbTable()))
                modelValues1.pojoColumnTypes.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues1.pojoColumnTypes.get(property.getDbTable()).put(type.getName(), type);
            }
        } else if (POJOGEN_TYPE_FOR_PROCEDURE.equals(property.getName())) {
            // if (modelValues1.columnTypes == null)
            // modelValues1.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues1.pojoProcedureTypes.containsKey(property.getDbProcedure()))
                modelValues1.pojoProcedureTypes.put(property.getDbProcedure(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues1.pojoProcedureTypes.get(property.getDbProcedure()).put(type.getName(), type);
            }
        } else if (POJOGEN_TYPE_FOR_FUNCTION.equals(property.getName())) {
            // if (modelValues1.columnTypes == null)
            // modelValues1.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues1.pojoFunctionTypes.containsKey(property.getDbFunction()))
                modelValues1.pojoFunctionTypes.put(property.getDbFunction(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues1.pojoFunctionTypes.get(property.getDbFunction()).put(type.getName(), type);
            }
        } else if (POJOGEN_RENAME_TABLES.equals(property.getName())) {
            // if (modelValues1.tableNames == null)
            // modelValues1.tableNames = new HashMap<String, String>();
            for (int i = 0, m = property.getTables().size(); i < m; i++) {
                modelValues1.pojoTableNames.put(property.getTables().get(i).getDbTable(), property.getTables().get(i)
                        .getNewName());
            }
        } else if (POJOGEN_RENAME_COLUMNS.equals(property.getName())) {
            // if (modelValues1.columnNames == null)
            // modelValues1.columnNames = new HashMap<String, Map<String, String>>();
            if (!modelValues1.pojoColumnNames.containsKey(property.getDbTable()))
                modelValues1.pojoColumnNames.put(property.getDbTable(), new HashMap<String, String>());
            for (int i = 0, m = property.getColumns().size(); i < m; i++) {
                modelValues1.pojoColumnNames.get(property.getDbTable()).put(property.getColumns().get(i).getDbColumn(),
                        property.getColumns().get(i).getNewName());
            }
        } else if (POJOGEN_IGNORE_TABLES.equals(property.getName())) {
            // if (modelValues1.ignoreTables == null)
            // modelValues1.ignoreTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues1.pojoIgnoreTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_ONLY_TABLES.equals(property.getName())) {
            // if (modelValues1.onlyTables == null)
            // modelValues1.onlyTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues1.pojoOnlyTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_NOT_ABSTRACT_TABLES_TABLES.equals(property.getName())) {
            // if (modelValues1.notAbstractTables == null)
            // modelValues1.notAbstractTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues1.pojoNotAbstractTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_IGNORE_COLUMNS.equals(property.getName())) {
            // if (modelValues1.ignoreColumns == null)
            // modelValues1.ignoreColumns = new HashMap<String, Set<String>>();
            if (!modelValues1.pojoIgnoreColumns.containsKey(property.getDbTable()))
                modelValues1.pojoIgnoreColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues1.pojoIgnoreColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_REQUIRED_COLUMNS.equals(property.getName())) {
            // if (modelValues1.requiredColumns == null)
            // modelValues1.requiredColumns = new HashMap<String, Set<String>>();
            if (!modelValues1.pojoRequiredColumns.containsKey(property.getDbTable()))
                modelValues1.pojoRequiredColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues1.pojoRequiredColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_NOT_REQUIRED_COLUMNS.equals(property.getName())) {
            // if (modelValues1.notRequiredColumns == null)
            // modelValues1.notRequiredColumns = new HashMap<String, Set<String>>();
            if (!modelValues1.pojoNotRequiredColumns.containsKey(property.getDbTable()))
                modelValues1.pojoNotRequiredColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues1.pojoNotRequiredColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_CREATE_COLUMNS.equals(property.getName())) {
            // if (modelValues1.createColumns == null)
            // modelValues1.createColumns = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues1.pojoCreateColumns.containsKey(property.getDbTable()))
                modelValues1.pojoCreateColumns.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues1.pojoCreateColumns.get(property.getDbTable()).put(type.getName(), type);
            }
        } else if (POJOGEN_IGNORE_EXPORTS.equals(property.getName())) {
            // if (modelValues1.ignoreExports == null)
            // modelValues1.ignoreExports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoIgnoreExports.containsKey(property.getDbTable()))
                modelValues1.pojoIgnoreExports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> exports = modelValues1.pojoIgnoreExports.get(property.getDbTable());
            for (int i = 0, m = property.getExports().size(); i < m; i++) {
                ExportAssignement export = property.getExports().get(i);
                if (!exports.containsKey(export.getDbColumn()))
                    exports.put(export.getDbColumn(), new HashMap<String, String>());
                exports.get(export.getDbColumn()).put(export.getFkTable(), export.getFkColumn());
            }
        } else if (POJOGEN_IGNORE_IMPORTS.equals(property.getName())) {
            // if (modelValues1.ignoreImports == null)
            // modelValues1.ignoreImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoIgnoreImports.containsKey(property.getDbTable()))
                modelValues1.pojoIgnoreImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues1.pojoIgnoreImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_CREATE_EXPORTS.equals(property.getName())) {
            // if (modelValues1.createExports == null)
            // modelValues1.createExports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoCreateExports.containsKey(property.getDbTable()))
                modelValues1.pojoCreateExports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> exports = modelValues1.pojoCreateExports.get(property.getDbTable());
            for (int i = 0, m = property.getExports().size(); i < m; i++) {
                ExportAssignement export = property.getExports().get(i);
                if (!exports.containsKey(export.getDbColumn()))
                    exports.put(export.getDbColumn(), new HashMap<String, String>());
                exports.get(export.getDbColumn()).put(export.getFkTable(), export.getFkColumn());
            }
        } else if (POJOGEN_CREATE_IMPORTS.equals(property.getName())) {
            // if (modelValues1.createImports == null)
            // modelValues1.createImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoCreateImports.containsKey(property.getDbTable()))
                modelValues1.pojoCreateImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues1.pojoCreateImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_INHERIT_IMPORTS.equals(property.getName())) {
            // if (modelValues1.inheritImports == null)
            // modelValues1.inheritImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoInheritImports.containsKey(property.getDbTable()))
                modelValues1.pojoInheritImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues1.pojoInheritImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_MANY_TO_MANY_IMPORTS.equals(property.getName())) {
            // if (modelValues1.manyToManyImports == null)
            // modelValues1.manyToManyImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues1.pojoManyToManyImports.containsKey(property.getDbTable()))
                modelValues1.pojoManyToManyImports.put(property.getDbTable(),
                        new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> many2s = modelValues1.pojoManyToManyImports.get(property.getDbTable());
            for (int i = 0, m = property.getMany2s().size(); i < m; i++) {
                ManyToManyAssignement many2 = property.getMany2s().get(i);
                if (!many2s.containsKey(many2.getPkColumn()))
                    many2s.put(many2.getPkColumn(), new HashMap<String, String>());
                many2s.get(many2.getPkColumn()).put(many2.getPkTable(), many2.getFkColumn());
            }
        } else if (POJOGEN_INHERITANCE.equals(property.getName())) {
            // if (modelValues1.inheritance == null)
            // modelValues1.inheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
            if (!modelValues1.pojoInheritance.containsKey(property.getDbTable()))
                modelValues1.pojoInheritance.put(property.getDbTable(),
                        new HashMap<String, Map<String, List<String>>>());
            // if (modelValues1.inheritanceColumns == null)
            // modelValues1.inheritanceColumns = new HashMap<String, String>();
            modelValues1.pojoInheritanceColumns.put(property.getDbTable(), property.getDbColumn());
            Map<String, Map<String, List<String>>> inherits = modelValues1.pojoInheritance.get(property.getDbTable());
            for (int i = 0, m = property.getInheritance().size(); i < m; i++) {
                InheritanceAssignement _inherit = property.getInheritance().get(i);
                if (!inherits.containsKey(_inherit.getDiscriminator()))
                    inherits.put(_inherit.getDiscriminator(), new HashMap<String, List<String>>());
                inherits.get(_inherit.getDiscriminator()).put(_inherit.getDbTable(), _inherit.getDbColumns());
            }
        } else if (POJOGEN_GENERATE_METHODS.equals(property.getName())) {
            // if (modelValues1.generateMethods == null)
            // modelValues1.generateMethods = new HashSet<String>();
            for (int i = 0, m = property.getMethods().size(); i < m; i++) {
                modelValues1.pojoGenerateMethods.add(property.getMethods().get(i));
            }
        } else if (POJOGEN_GENERATE_OPERATORS.equals(property.getName())) {
            modelValues1.pojoGenerateOperators = getPropertyValue(property.getOperatorsSuffix());
            if (modelValues1.pojoGenerateOperators == null)
                modelValues1.pojoGenerateOperators = "operators";
        } else if (POJOGEN_IMPLEMENTS_INTERFACES.equals(property.getName())) {
            // if (modelValues1.toImplements == null)
            // modelValues1.toImplements = new HashMap<String, JvmType>();
            ImplementsExtends ie = new ImplementsExtends(property.getToImplements().getToImplement(), false, property
                    .getToImplements().getDbTables(), property.getToImplements().getDbNotTables());
            modelValues1.pojoToImplements.put(property.getToImplements().getToImplement().getIdentifier(), ie);
        } else if (POJOGEN_EXTENDS_CLASS.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToExtends().getToExtends(), false, property
                    .getToExtends().getDbTables(), property.getToExtends().getDbNotTables());
            modelValues1.pojoToExtends = ie;
        } else if (POJOGEN_IMPLEMENTS_INTERFACES_GENERICS.equals(property.getName())) {
            // if (modelValues1.toImplements == null)
            // modelValues1.toImplements = new HashMap<String, JvmType>();
            ImplementsExtends ie = new ImplementsExtends(property.getToImplementsGenerics().getToImplement(), true,
                    property.getToImplementsGenerics().getDbTables(), property.getToImplementsGenerics()
                            .getDbNotTables());
            modelValues1.pojoToImplements.put(property.getToImplementsGenerics().getToImplement().getIdentifier(), ie);
        } else if (POJOGEN_EXTENDS_CLASS_GENERICS.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToExtendsGenerics().getToExtends(), true, property
                    .getToExtendsGenerics().getDbTables(), property.getToExtendsGenerics().getDbNotTables());
            modelValues1.pojoToExtends = ie;
        } else if (POJOGEN_JOIN_TABLES.equals(property.getName())) {
            // if (modelValues1.joinTables == null)
            // modelValues1.joinTables = new HashMap<String, List<String>>();
            for (int i = 0, m = property.getJoinTables().size(); i < m; i++) {
                JoinTableAssignement joinTableAssignement = property.getJoinTables().get(i);
                if (!modelValues1.pojoJoinTables.containsKey(joinTableAssignement.getDbTable()))
                    modelValues1.pojoJoinTables.put(joinTableAssignement.getDbTable(), new ArrayList<String>());
                for (String dbTable : joinTableAssignement.getDbTables()) {
                    modelValues1.pojoJoinTables.get(joinTableAssignement.getDbTable()).add(dbTable);
                }
            }
        } else if (POJOGEN_GENERATE_WRAPPERS.equals(property.getName())) {
            modelValues1.pojoDoGenerateWrappers = true;
        } else if (POJOGEN_GENERATE_VALIDATION_ANNOTATIONS.equals(property.getName())) {
            modelValues1.pojoDoGenerateValidationAnnotations = true;
        } else if (POJOGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues1.pojoMakeItFinal = true;
        } else if (POJOGEN_VERSION_COLUMN.equals(property.getName())) {
            String versionColumn = property.getVersion();
            if ((property.getDbTables() == null || property.getDbTables().isEmpty())
                    && (property.getDbNotTables() == null || property.getDbNotTables().isEmpty())) {
                modelValues1.pojoVersionColumn = versionColumn;
            } else if (property.getDbTables() != null && !property.getDbTables().isEmpty()) {
                if (!modelValues1.pojoVersionColumns.containsKey(versionColumn))
                    modelValues1.pojoVersionColumns.put(versionColumn, new HashSet<String>());
                for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                    modelValues1.pojoVersionColumns.get(versionColumn).add(property.getDbTables().get(i));
                }
            } else {
                if (!modelValues1.pojoNotVersionColumns.containsKey(versionColumn))
                    modelValues1.pojoNotVersionColumns.put(versionColumn, new HashSet<String>());
                for (int i = 0, m = property.getDbNotTables().size(); i < m; i++) {
                    modelValues1.pojoNotVersionColumns.get(versionColumn).add(property.getDbNotTables().get(i));
                }
            }
        } else if (POJOGEN_DEBUG_LEVEL.equals(property.getName()) && property.getDebug().getDebug() != null) {
            modelValues1.pojoDebugLevel = property.getDebug().getDebug();
            modelValues1.pojoDebugScope = getPropertyValue(property.getDebug().getScope());
        } else if (POJOGEN_PRESERVE_FOREIGN_KEYS.equals(property.getName())) {
            if (property.getDbTables().isEmpty()) {
                modelValues1.pojoPreserveForeignKeys.add("_ALL_");
            } else {
                for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                    modelValues1.pojoPreserveForeignKeys.add(property.getDbTables().get(i));
                }
            }
        } else if (POJOGEN_POJOS_FOR_PROCEDURES.equals(property.getName())) {
            for (int i = 0, m = property.getProcPojos().size(); i < m; i++) {
                modelValues1.pojoPojosForProcedures.put(property.getProcPojos().get(i).getDbProcedure(), property
                        .getProcPojos().get(i).getPojo());
            }
        } else if (POJOGEN_POJOS_FOR_FUNCTIONS.equals(property.getName())) {
            for (int i = 0, m = property.getFunPojos().size(); i < m; i++) {
                modelValues1.pojoPojosForFunctions.put(property.getFunPojos().get(i).getDbFunction(), property
                        .getFunPojos().get(i).getPojo());
            }
        } else if (POJOGEN_ACTIVE_FILTER.equals(property.getName())) {
            modelValues1.pojoActiveFilter = getPropertyValue(property.getActiveFilter());
        } else if (POJOGEN_PACKAGE.equals(property.getName())) {
            modelValues1.pojoPackage = getPropertyValue(property.getPckg());
        } else if (POJOGEN_ENUM_FOR_CHECK_CONSTRAINTS.equals(property.getName())) {
            for (int i = 0, m = property.getDbCheckConstraints().size(); i < m; i++) {
                if (i == 0)
                    modelValues1.pojoEnumForCheckConstraints.put(property.getEnumName(), property
                            .getDbCheckConstraints().get(i));
                modelValues1.pojoEnumForCheckConstraints.put(property.getDbCheckConstraints().get(i),
                        property.getEnumName());
            }
        }
    }

    private static void setValue(ModelValues1 modelValues1, MetagenProperty property) {
        if (property == null)
            return;
        if (METAGEN_GLOBAL_IDENTITY.equals(property.getName())) {
            modelValues1.metaGlobalIdentity = new PairValues(property.getIdentity(), property.getType());
            if (property.getDbTables() != null) {
                modelValues1.metaGlobalIdentityForTables.addAll(property.getDbTables());
            }
            if (property.getDbNotTables() != null) {
                modelValues1.metaGlobalIdentityNotForTables.addAll(property.getDbNotTables());
            }
        } else if (METAGEN_TABLE_IDENTITY.equals(property.getName())) {
            modelValues1.metaTablesIdentity.put(property.getDbTable(),
                    new PairValues(property.getIdentity(), property.getType()));
        } else if (METAGEN_GLOBAL_SEQUENCE.equals(property.getName())) {
            modelValues1.metaGlobalSequence = new PairValues(property.getSequence(), property.getType());
            if (property.getDbTables() != null) {
                modelValues1.metaGlobalSequenceForTables.addAll(property.getDbTables());
            }
            if (property.getDbNotTables() != null) {
                modelValues1.metaGlobalSequenceNotForTables.addAll(property.getDbNotTables());
            }
        } else if (METAGEN_TABLE_SEQUENCE.equals(property.getName())) {
            modelValues1.metaTablesSequence.put(property.getDbTable(),
                    new PairValues(property.getSequence(), property.getType()));
        } else if (METAGEN_COLUMN_META_TYPE.equals(property.getName())) {
            if (!modelValues1.metaColumnsMetaTypes.containsKey(property.getDbTable()))
                modelValues1.metaColumnsMetaTypes.put(property.getDbTable(), new HashMap<String, PairValues>());
            for (int i = 0, m = property.getMetaTypes().size(); i < m; i++) {
                MetaTypeAssignement metaType = property.getMetaTypes().get(i);
                modelValues1.metaColumnsMetaTypes.get(property.getDbTable()).put(metaType.getDbColumn(),
                        new PairValues(metaType.getType(), metaType.getExtension()));
            }
        } else if (METAGEN_STATEMENT_META_TYPE.equals(property.getName())) {
            if (!modelValues1.metaStatementsMetaTypes.containsKey(property.getDbStatement()))
                modelValues1.metaStatementsMetaTypes.put(property.getDbStatement(), new HashMap<String, PairValues>());
            for (int i = 0, m = property.getMetaTypes().size(); i < m; i++) {
                MetaTypeAssignement metaType = property.getMetaTypes().get(i);
                modelValues1.metaStatementsMetaTypes.get(property.getDbStatement()).put(metaType.getDbColumn(),
                        new PairValues(metaType.getType(), metaType.getExtension()));
            }
        } else if (METAGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues1.metaMakeItFinal = true;
        } else if (METAGEN_LIKE_COLUMNS.equals(property.getName())) {
            if (property.getDbTable() == null) {
                modelValues1.metaLikeColumns.put(GLOBAL, new HashSet<String>());
            } else {
                if (!modelValues1.metaLikeColumns.containsKey(property.getDbTable()))
                    modelValues1.metaLikeColumns.put(property.getDbTable(), new HashSet<String>());
                for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                    modelValues1.metaLikeColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
                }
            }
        } else if (METAGEN_NOT_LIKE_COLUMNS.equals(property.getName())) {
            if (property.getDbTable() == null) {
                modelValues1.metaNotLikeColumns.put(GLOBAL, new HashSet<String>());
            } else {
                if (!modelValues1.metaNotLikeColumns.containsKey(property.getDbTable()))
                    modelValues1.metaNotLikeColumns.put(property.getDbTable(), new HashSet<String>());
                for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                    modelValues1.metaNotLikeColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
                }
            }
        } else if (METAGEN_GENERATE_SEQUENCES.equals(property.getName())) {
            modelValues1.metaGenerateSequences = true;
        } else if (METAGEN_GENERATE_IDENTITIES.equals(property.getName())) {
            modelValues1.metaGenerateIdentities = true;
        } else if (METAGEN_GENERATE_IDGENERATORS.equals(property.getName())) {
            modelValues1.metaGenerateIdGenerators = true;
        } else if (METAGEN_GENERATE_INDIRECT_IDGENERATORS.equals(property.getName())) {
            modelValues1.metaGenerateIndirectIdGenerators = true;
        } else if (METAGEN_FUNCTION_RESULT.equals(property.getName())) {
            modelValues1.metaFunctionsResult.put(property.getDbFunction(), property.getType());
        } else if (METAGEN_FUNCTION_RESULT_SET.equals(property.getName())) {
            modelValues1.metaFunctionsResultSet.put(property.getDbFunction(), property.getDbTable());
        } else if (METAGEN_PROCEDURE_RESULT_SET.equals(property.getName())) {
            modelValues1.metaProceduresResultSet.put(property.getDbProcedure(), property.getDbTable());
        } else if (METAGEN_DEBUG_LEVEL.equals(property.getName()) && property.getDebug() != null) {
            modelValues1.metaDebugLevel = property.getDebug().getDebug();
            modelValues1.metaDebugScope = getPropertyValue(property.getDebug().getScope());
        } else if (METAGEN_GENERATE_OPERATORS.equals(property.getName())) {
            modelValues1.metaGenerateOperators = true;
        } else if (METAGEN_OPTIMIZE_INSERT.equals(property.getName())) {
            if (property.getDbTables().isEmpty()) {
                modelValues1.metaOptimizeInsert.add("_ALL_");
            } else {
                for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                    modelValues1.metaOptimizeInsert.add(property.getDbTables().get(i));
                }
            }
        } else if (METAGEN_OPTIONAL_FEATURES.equals(property.getName())) {
            if (!modelValues1.metaOptionalFeatures.containsKey(property.getDbStatement()))
                modelValues1.metaOptionalFeatures.put(property.getDbStatement(), new HashSet<String>());
            for (int i = 0, m = property.getOptionalFeatures().size(); i < m; i++) {
                String optionalFeature = property.getOptionalFeatures().get(i);
                modelValues1.metaOptionalFeatures.get(property.getDbStatement()).add(optionalFeature);
            }
        } else if (METAGEN_ACTIVE_FILTER.equals(property.getName())) {
            modelValues1.metaActiveFilter = getPropertyValue(property.getActiveFilter());
        }
    }

    private static void setValue(ModelValues1 modelValues1, DaogenProperty property) {
        if (property == null)
            return;
        if (DAOGEN_IGNORE_TABLES.equals(property.getName())) {
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues1.daoIgnoreTables.add(property.getDbTables().get(i));
            }
        } else if (DAOGEN_ONLY_TABLES.equals(property.getName())) {
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues1.daoOnlyTables.add(property.getDbTables().get(i));
            }
        } else if (DAOGEN_IMPLEMENTS_INTERFACES.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToImplements().getToImplement(), false, property
                    .getToImplements().getDbTables(), property.getToImplements().getDbNotTables());
            modelValues1.daoToImplements.put(property.getToImplements().getToImplement().getIdentifier(), ie);
        } else if (DAOGEN_EXTENDS_CLASS.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToExtends().getToExtends(), false, property
                    .getToExtends().getDbTables(), property.getToExtends().getDbNotTables());
            modelValues1.daoToExtends = ie;
        } else if (DAOGEN_IMPLEMENTS_INTERFACES_GENERICS.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToImplementsGenerics().getToImplement(), true,
                    property.getToImplementsGenerics().getDbTables(), property.getToImplementsGenerics()
                            .getDbNotTables());
            modelValues1.daoToImplements.put(property.getToImplementsGenerics().getToImplement().getIdentifier(), ie);
        } else if (DAOGEN_EXTENDS_CLASS_GENERICS.equals(property.getName())) {
            ImplementsExtends ie = new ImplementsExtends(property.getToExtendsGenerics().getToExtends(), true, property
                    .getToExtendsGenerics().getDbTables(), property.getToExtendsGenerics().getDbNotTables());
            modelValues1.daoToExtends = ie;
        } else if (DAOGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues1.daoMakeItFinal = true;
        } else if (DAOGEN_FUNCTION_RESULT.equals(property.getName())) {
            modelValues1.daoFunctionsResult.put(property.getDbFunction(), property.getResultType());
        } else if (DAOGEN_DEBUG_LEVEL.equals(property.getName()) && property.getDebug().getDebug() != null) {
            modelValues1.daoDebugLevel = property.getDebug().getDebug();
            modelValues1.daoDebugScope = getPropertyValue(property.getDebug().getScope());
        } else if (DAOGEN_ACTIVE_FILTER.equals(property.getName())) {
            modelValues1.daoActiveFilter = getPropertyValue(property.getActiveFilter());
        } else if (DAOGEN_PACKAGE.equals(property.getName())) {
            modelValues1.daoPackage = getPropertyValue(property.getPckg());
        }
    }

    @Override
    public boolean isDoResolvePojo(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.GLOBAL);
        return (modelValues1 != null) ? modelValues1.doResolvePojo : false;
    }

    @Override
    public boolean isDoResolveDb(EObject model) {
        ModelValues modelValues = getModelValues(model);
        if (modelValues != null && modelValues.doResolveDb != null)
            return modelValues.doResolveDb;
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.doResolveDb : false;
    }

    @Override
    public Map<String, String> getReplaceAll(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.GLOBAL);
        if (modelValues1 == null || modelValues1.replaceAllRegex == null || modelValues1.replaceAllReplacement == null)
            return Collections.<String, String> emptyMap();
        Map<String, String> result = new HashMap<String, String>();
        for (String replaceId : modelValues1.replaceAllRegex.keySet()) {
            if (modelValues1.replaceAllReplacement.containsKey(replaceId)) {
                result.put(modelValues1.replaceAllRegex.get(replaceId),
                        modelValues1.replaceAllReplacement.get(replaceId));
            }
        }
        return result;
    }

    @Override
    public boolean isCompressMetaDirectives(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.GLOBAL);
        return (modelValues1 != null) ? modelValues1.doCompressMetaDirectives : false;
    }

    @Override
    public Map<String, PojoAttrType> getSqlTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoSqlTypes : Collections.<String, PojoAttrType> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getTableTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoTableTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getColumnTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoColumnTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getProcedureTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoProcedureTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getFunctionTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoFunctionTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, String> getTableNames(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoTableNames : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, Map<String, String>> getColumnNames(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoColumnNames : Collections
                .<String, Map<String, String>> emptyMap();
    }

    @Override
    public Set<String> getIgnoreTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoIgnoreTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getOnlyTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoOnlyTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getNotAbstractTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoNotAbstractTables : Collections.<String> emptySet();
    }

    @Override
    public Map<String, Set<String>> getIgnoreColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoIgnoreColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getRequiredColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoRequiredColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getNotRequiredColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoNotRequiredColumns : Collections
                .<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getCreateColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoCreateColumns : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getIgnoreExports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoIgnoreExports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getIgnoreImports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoIgnoreImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getCreateExports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoCreateExports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getCreateImports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoCreateImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getInheritImports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoInheritImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getManyToManyImports(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoManyToManyImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, List<String>>>> getInheritance(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoInheritance : Collections
                .<String, Map<String, Map<String, List<String>>>> emptyMap();
    }

    @Override
    public Map<String, String> getInheritanceColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoInheritanceColumns : Collections.<String, String> emptyMap();
    }

    @Override
    public Set<String> getGenerateMethods(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoGenerateMethods : Collections.<String> emptySet();
    }

    @Override
    public String getGenerateOperators(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoGenerateOperators : null;
    }

    @Override
    public Map<String, ImplementsExtends> getToImplements(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoToImplements : Collections
                .<String, ImplementsExtends> emptyMap();
    }

    @Override
    public ImplementsExtends getToExtends(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoToExtends : null;
    }

    @Override
    public Map<String, List<String>> getJoinTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoJoinTables : Collections.<String, List<String>> emptyMap();
    }

    @Override
    public boolean isDoGenerateWrappers(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoDoGenerateWrappers : false;
    }

    @Override
    public boolean isDoGenerateValidationAnnotations(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoDoGenerateValidationAnnotations : false;
    }

    @Override
    public boolean isMakeItFinal(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoMakeItFinal : false;
    }

    @Override
    public String getVersionColumn(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoVersionColumn : null;
    }

    @Override
    public Map<String, Set<String>> getVersionColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoVersionColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getNotVersionColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoNotVersionColumns : Collections
                .<String, Set<String>> emptyMap();
    }

    @Override
    public String getDebugLevel(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoDebugLevel : null;
    }

    @Override
    public String getDebugScope(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoDebugScope : null;
    }

    @Override
    public Set<String> getPreserveForeignKeys(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoPreserveForeignKeys : Collections.<String> emptySet();
    }

    @Override
    public PairValues getMetaGlobalIdentity(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalIdentity : null;
    }

    @Override
    public Map<String, PojoType> getPojosForProcedures(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoPojosForProcedures : Collections.<String, PojoType> emptyMap();
    }

    @Override
    public Map<String, PojoType> getPojosForFunctions(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoPojosForFunctions : Collections.<String, PojoType> emptyMap();
    }

    @Override
    public String getActiveFilter(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoActiveFilter : null;
    }

    @Override
    public String getPackage(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoPackage : null;
    }

    @Override
    public Map<String, String> getEnumForCheckConstraints(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.POJOGEN);
        return (modelValues1 != null) ? modelValues1.pojoEnumForCheckConstraints : Collections
                .<String, String> emptyMap();
    }

    @Override
    public Map<String, PairValues> getMetaTablesIdentity(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaTablesIdentity : Collections.<String, PairValues> emptyMap();
    }

    @Override
    public PairValues getMetaGlobalSequence(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalSequence : null;
    }

    @Override
    public Map<String, PairValues> getMetaTablesSequence(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaTablesSequence : Collections.<String, PairValues> emptyMap();
    }

    @Override
    public Map<String, Map<String, PairValues>> getMetaColumnsMetaTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaColumnsMetaTypes : Collections
                .<String, Map<String, PairValues>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PairValues>> getMetaStatementsMetaTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaStatementsMetaTypes : Collections
                .<String, Map<String, PairValues>> emptyMap();
    }

    @Override
    public boolean isMetaMakeItFinal(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaMakeItFinal : false;
    }

    @Override
    public Map<String, Set<String>> getMetaLikeColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaLikeColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getMetaNotLikeColumns(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaNotLikeColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public boolean isMetaGenerateSequences(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGenerateSequences : false;
    }

    @Override
    public Set<String> getMetaGlobalSequenceForTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalSequenceForTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getMetaGlobalSequenceNotForTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalSequenceNotForTables : Collections.<String> emptySet();
    }

    @Override
    public boolean isMetaGenerateIdentities(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGenerateIdentities : false;
    }

    @Override
    public Set<String> getMetaGlobalIdentityForTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalIdentityForTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getMetaGlobalIdentityNotForTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGlobalIdentityNotForTables : Collections.<String> emptySet();
    }

    @Override
    public boolean isMetaGenerateIdGenerators(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGenerateIdGenerators : false;
    }

    @Override
    public boolean isMetaGenerateIndirectIdGenerators(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGenerateIndirectIdGenerators : false;
    }

    @Override
    public Map<String, String> getMetaFunctionsResult(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaFunctionsResult : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, String> getMetaFunctionsResultSet(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaFunctionsResultSet : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, String> getMetaProceduresResultSet(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaProceduresResultSet : Collections.<String, String> emptyMap();
    }

    @Override
    public String getMetaDebugLevel(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaDebugLevel : null;
    }

    @Override
    public String getMetaDebugScope(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaDebugScope : null;
    }

    @Override
    public boolean isMetaGenerateOperators(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaGenerateOperators : false;
    }

    @Override
    public Set<String> getMetaOptimizeInsert(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaOptimizeInsert : Collections.<String> emptySet();
    }

    @Override
    public Map<String, Set<String>> getMetaOptionalFeatures(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaOptionalFeatures : Collections
                .<String, Set<String>> emptyMap();
    }

    @Override
    public String getMetaActiveFilter(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.METAGEN);
        return (modelValues1 != null) ? modelValues1.metaActiveFilter : null;
    }

    @Override
    public Set<String> getDaoIgnoreTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoIgnoreTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getDaoOnlyTables(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoOnlyTables : Collections.<String> emptySet();
    }

    @Override
    public Map<String, ImplementsExtends> getDaoToImplements(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoToImplements : Collections
                .<String, ImplementsExtends> emptyMap();
    }

    @Override
    public ImplementsExtends getDaoToExtends(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoToExtends : null;
    }

    @Override
    public boolean isDaoMakeItFinal(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoMakeItFinal : false;
    }

    @Override
    public Map<String, PojoType> getDaoFunctionsResult(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoFunctionsResult : Collections.<String, PojoType> emptyMap();
    }

    @Override
    public String getDaoDebugLevel(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoDebugLevel : null;
    }

    @Override
    public String getDaoDebugScope(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoDebugScope : null;
    }

    @Override
    public String getDaoActiveFilter(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoActiveFilter : null;
    }

    @Override
    public String getDaoPackage(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DAOGEN);
        return (modelValues1 != null) ? modelValues1.daoPackage : null;
    }

    @Override
    public String getDbDriver(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbDriver : null;
    }

    @Override
    public String getDbUrl(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbUrl : null;
    }

    @Override
    public String getDbUsername(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbUsername : null;
    }

    @Override
    public String getDbPassword(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbPassword : null;
    }

    @Override
    public String getDbCatalog(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbCatalog : null;
    }

    @Override
    public String getDbSchema(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSchema : null;
    }

    @Override
    public String getDbSqlsBefore(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSqlsBefore : null;
    }

    @Override
    public String getDbSqlsAfter(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSqlsAfter : null;
    }

    @Override
    public String getDbIndexTypes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbIndexTypes : null;
    }

    @Override
    public Boolean getDbSkipIndexes(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSkipIndexes : null;
    }

    @Override
    public Boolean getDbSkipProcedures(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSkipProcedures : null;
    }

    @Override
    public Boolean getDbSkipCheckConstraints(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbSkipCheckConstraints : null;
    }

    @Override
    public String getDbType(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbType : null;
    }

    @Override
    public String getDbDebugLevel(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbDebugLevel : null;
    }

    @Override
    public String getDbDebugScope(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbDebugScope : null;
    }

    @Override
    public Boolean getDbTakeComments(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbTakeComments : null;
    }

    @Override
    public Boolean getDbLowercaseNames(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbLowercaseNames : null;
    }

    @Override
    public Boolean getDbUppercaseNames(EObject model) {
        ModelValues1 modelValues1 = getModelValues(model, ModelValues.DATABASE);
        return (modelValues1 != null) ? modelValues1.dbUppercaseNames : null;
    }

    @Override
    public ModelValues getModelValues(EObject model) {
        ModelValues modelValues = dirs2models.get(FAKE_DIR);
        if (modelValues != null)
            return modelValues;
        EObject emodel = (EObject) model;
        Artifacts artifacts = EcoreUtil2.getContainerOfType(emodel, Artifacts.class);
        if (artifacts == null) {
            LOGGER.error("UKNOWN ARTIFACTS FOR " + emodel);
            return null;
        }
        if (artifacts.eResource() == null) {
            LOGGER.error("UKNOWN RESOURCE FOR " + artifacts);
            return null;
        }
        String dir = Utils.resourceDir(artifacts.eResource());
        if (dir == null) {
            LOGGER.error("LOADED RESOURCE URI IS NOT VALID " + artifacts.eResource().getURI());
            return null;
        }
        return dirs2models.get(dir);
    }

    @Override
    public ModelValues1 getModelValues(EObject model, String name) {
        ModelValues modelValues = getModelValues(model);
        return modelValues != null ? modelValues.getModel(name) : null;
    }

    @Override
    public String toString() {
        return "ModelPropertyBean [dirs2models=" + dirs2models + "]";
    }

    private static String getPropertyValue(String value) {
        if (value == null)
            return null;
        value = value.trim();
        if (value.startsWith("\""))
            value = value.substring(1);
        if (value.endsWith("\""))
            value = value.substring(0, value.length() - 1);
        return value;
    }

    private static String getPropertyValue(ValueType pv) {
        if (pv == null)
            return null;
        String s = pv.getValue();
        if (s != null) {
            s = s.trim();
            if (s.startsWith("\""))
                s = s.substring(1);
            if (s.endsWith("\""))
                s = s.substring(0, s.length() - 1);
            return s;
        } else if (pv.getId() != null)
            return pv.getId();
        else
            return "" + pv.getNumber();
    }
}
