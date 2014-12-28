package org.sqlproc.meta.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.sqlproc.meta.parser.antlr.internal.InternalProcessorMetaLexer;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    @Override
    protected String calculateId(String tokenName, int tokenType) {
        if (tokenType == InternalProcessorMetaLexer.RULE_BAND || tokenType == InternalProcessorMetaLexer.RULE_RBRACE
                || tokenType == InternalProcessorMetaLexer.RULE_CARET
                || tokenType == InternalProcessorMetaLexer.RULE_MORE_THAN
                || tokenType == InternalProcessorMetaLexer.RULE_SEMICOLON
                || tokenType == InternalProcessorMetaLexer.RULE_PLUS || tokenType == InternalProcessorMetaLexer.RULE_OR
                || tokenType == InternalProcessorMetaLexer.RULE_HASH
                || tokenType == InternalProcessorMetaLexer.RULE_COMMA || tokenType == InternalProcessorMetaLexer.RULE_AND
                || tokenType == InternalProcessorMetaLexer.RULE_QUESTI
                || tokenType == InternalProcessorMetaLexer.RULE_NOT || tokenType == InternalProcessorMetaLexer.RULE_MINUS
                || tokenType == InternalProcessorMetaLexer.RULE_COLON
                || tokenType == InternalProcessorMetaLexer.RULE_STRING
                || tokenType == InternalProcessorMetaLexer.RULE_REST
                || tokenType == InternalProcessorMetaLexer.RULE_ESC_CHAR
                || tokenType == InternalProcessorMetaLexer.RULE_NUMBER
                || tokenType == InternalProcessorMetaLexer.RULE_IDENT
                || tokenType == InternalProcessorMetaLexer.RULE_LPAREN
                || tokenType == InternalProcessorMetaLexer.RULE_EQUALS
                || tokenType == InternalProcessorMetaLexer.RULE_LBRACE
                || tokenType == InternalProcessorMetaLexer.RULE_RPAREN
                || tokenType == InternalProcessorMetaLexer.RULE_BOR
                || tokenType == InternalProcessorMetaLexer.RULE_LESS_THAN
                || tokenType == InternalProcessorMetaLexer.RULE_PERCENT
                || tokenType == InternalProcessorMetaLexer.RULE_IDENT_DOT
                || tokenType == InternalProcessorMetaLexer.RULE_AT)
            return HighlightingConfiguration.PUNCTATION;

        if (tokenType == InternalProcessorMetaLexer.RULE_ML_COMMENT
                || tokenType == InternalProcessorMetaLexer.RULE_SL_COMMENT)
            return HighlightingConfiguration.COMMENT;

        if (tokenName.equals("'BOPT'") || tokenName.equals("'OUT'") || tokenName.equals("'SOPT'")
                || tokenName.equals("'OPT'") || tokenName.equals("'QRY'") || tokenName.equals("'IOPT'")
                || tokenName.equals("'LOPT'") || tokenName.equals("'MOPT'") || tokenName.equals("'CRUD'")
                || tokenName.equals("'CALL'") || tokenName.equals("'pojo'") || tokenName.equals("'out'")
                || tokenName.equals("'in'") || tokenName.equals("'const'") || tokenName.equals("'table'")
                || tokenName.equals("'col'") || tokenName.equals("'prefix'") || tokenName.startsWith("'database")
                || tokenName.startsWith("'resolve") || tokenName.equals("'abstract'") || tokenName.equals("'package'")
                || tokenName.startsWith("'equals") || tokenName.equals("'outx'") || tokenName.equals("'inx'")
                || tokenName.equals("'constx'") || tokenName.equals("'colx'") || tokenName.equals("'final'")
                || tokenName.equals("'discriminator'") || tokenName.equals("'required'")
                || tokenName.equals("'primaryKey'") || tokenName.equals("'dao'") || tokenName.equals("'procedure'")
                || tokenName.equals("'function'"))
            return HighlightingConfiguration.TYPE;

        return HighlightingConfiguration.DEFAULT;
    }
}
