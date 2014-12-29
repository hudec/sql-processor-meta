package org.sqlproc.meta.ui.syntaxcoloring;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.meta.processorMeta.Constant;
import org.sqlproc.meta.processorMeta.DatabaseColumn;
import org.sqlproc.meta.processorMeta.DatabaseTable;
import org.sqlproc.meta.processorMeta.ExtendedColumn;
import org.sqlproc.meta.processorMeta.ExtendedMappingItem;
import org.sqlproc.meta.processorMeta.FunctionDefinition;
import org.sqlproc.meta.processorMeta.Identifier;
import org.sqlproc.meta.processorMeta.MappingItem;
import org.sqlproc.meta.processorMeta.MappingRule;
import org.sqlproc.meta.processorMeta.MetaStatement;
import org.sqlproc.meta.processorMeta.OptionalFeature;
import org.sqlproc.meta.processorMeta.PojoDefinition;
import org.sqlproc.meta.processorMeta.ProcedureDefinition;
import org.sqlproc.meta.processorMeta.TableDefinition;
import org.sqlproc.meta.resolver.PojoResolver;
import org.sqlproc.meta.resolver.PojoResolverFactory;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    public static final String CARET = "^";
    public static final String STRING = "$";
    public static final String LPAREN = "(";
    public static final String RPAREN = ")";

    @Inject
    PojoResolver pojoResolver;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        // tohle je blbarna, jak dostat tridu z org.sqlproc.meta.ui dp org.sqlproc.meta, mozna to jde jednoduseji
        if (pojoResolverFactory != null && pojoResolverFactory.getPojoResolver() == null)
            pojoResolverFactory.setPojoResolver(pojoResolver);

        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            if (current instanceof MetaStatement) {
                MetaStatement statement = (MetaStatement) current;
                if (statement.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev statementu je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), statement.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForModifiers(statement.getModifiers(), node, acceptor);
                }
            } else if (current instanceof MappingRule) {
                MappingRule rule = (MappingRule) current;
                if (rule.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev pravidla je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), rule.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForModifiers(rule.getModifiers(), node, acceptor);
                }
            } else if (current instanceof OptionalFeature) {
                OptionalFeature feature = (OptionalFeature) current;
                if (feature.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev vlastnosti je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), feature.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForModifiers(feature.getModifiers(), node, acceptor);
                }
            } else if (current instanceof Constant) {
                Constant constant = (Constant) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.CONSTANT, node, constant.getName(),
                        constant.getModifiers(), acceptor);
            } else if (current instanceof Identifier) {
                Identifier identifier = (Identifier) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.IDENTIFIER, node, identifier.getName(),
                        identifier.getModifiers(), acceptor);
            } else if (current instanceof ExtendedColumn) {
                ExtendedColumn column = (ExtendedColumn) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.COLUMN, node, column.getCol().getName(),
                        column.getModifiers(), acceptor);
            } else if (current instanceof MappingItem) {
                MappingItem item = (MappingItem) current;
                if (item.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev vlastnosti je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), item.getName().length(), HighlightingConfiguration.COLUMN);
                }
            } else if (current instanceof ExtendedMappingItem) {
                ExtendedMappingItem mappingItem = (ExtendedMappingItem) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.COLUMN, node, mappingItem.getAttr().getName(),
                        mappingItem.getModifiers(), acceptor);
            } else if (current instanceof DatabaseColumn) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.DATABASE_COLUMN);
            } else if (current instanceof DatabaseTable) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.DATABASE_TABLE);
            } else if (current instanceof PojoDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDefinition pojo = (PojoDefinition) current;
                provideHighlightingForPojo(null, pojo.getName(), node, acceptor);
            } else if (current instanceof TableDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                TableDefinition table = (TableDefinition) current;
                provideHighlightingForTable(null, table.getName(), node, acceptor);
            } else if (current instanceof ProcedureDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ProcedureDefinition procedure = (ProcedureDefinition) current;
                provideHighlightingForTable(null, procedure.getName(), node, acceptor);
            } else if (current instanceof FunctionDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                FunctionDefinition function = (FunctionDefinition) current;
                provideHighlightingForTable(null, function.getName(), node, acceptor);
            }
        }
    }

    private void provideHighlightingForModifiers(EList<String> filters, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (filters != null && !filters.isEmpty()) {
            Iterator<INode> iterator = new NodeTreeIterator(node);
            while (iterator.hasNext()) {
                INode inode = iterator.next();
                if (filters.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(),
                            HighlightingConfiguration.STATEMENT_MODIFIER);
                }
            }
        }
    }

    private void provideHighlightingForPojo(String name, String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (pojo == null)
                    return;
            }
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForPojoPackage(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PACKAGE_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoEntity(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoProperty(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PROPERTY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForEnumEntity(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForEnumProperty(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PROPERTY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoDao(String dao, ICompositeNode node, IHighlightedPositionAcceptor acceptor) {
        if (dao == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (dao != null && dao.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.DAO_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForTable(String name, String table, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && table == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (table == null)
                    return;
            }
            if (table != null && table.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForFragment(String defaultColor, ICompositeNode node, String name,
            EList<String> modifiers, IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        boolean afterName = false;
        boolean inParenthesis = false;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (!afterName) {
                if (name.equals(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
                    afterName = true;
                }
            } else if (!inParenthesis && inode.getText().equals("(")) {
                inParenthesis = true;
            } else if (inParenthesis && inode.getText().equals(")")) {
                inParenthesis = false;
            } else if (inParenthesis) {
                if (modifiers != null && !modifiers.isEmpty() && modifiers.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.MODIFIER);
                }
            } else {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
            }
        }
    }
}
