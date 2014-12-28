/**
 * generated by Xtext
 */
package org.sqlproc.meta.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.sqlproc.meta.ImportManager;
import org.sqlproc.meta.processorMeta.Entity;
import org.sqlproc.meta.processorMeta.EnumProperty;
import org.sqlproc.meta.processorMeta.PojoEntity;
import org.sqlproc.meta.processorMeta.PojoProperty;
import org.sqlproc.meta.processorMeta.PojoType;
import org.sqlproc.meta.util.Utils;

@SuppressWarnings("all")
public class ProcessorGeneratorUtils {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  public CharSequence compileType(final EnumProperty f, final ImportManager im) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        JvmType _type = f.getType();
        boolean _notEquals_1 = (!Objects.equal(_type, null));
        if (_notEquals_1) {
          JvmType _type_1 = f.getType();
          CharSequence _serialize = im.serialize(_type_1);
          _builder.append(_serialize, "");
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileType(final PojoProperty f, final ImportManager im) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        Entity _ref = f.getRef();
        boolean _notEquals_1 = (!Objects.equal(_ref, null));
        if (_notEquals_1) {
          Entity _ref_1 = f.getRef();
          QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_ref_1);
          _builder.append(_fullyQualifiedName, "");
        } else {
          JvmType _type = f.getType();
          boolean _notEquals_2 = (!Objects.equal(_type, null));
          if (_notEquals_2) {
            JvmType _type_1 = f.getType();
            CharSequence _serialize = im.serialize(_type_1);
            _builder.append(_serialize, "");
          }
        }
      }
    }
    {
      JvmType _gtype = f.getGtype();
      boolean _notEquals_3 = (!Objects.equal(_gtype, null));
      if (_notEquals_3) {
        _builder.append("<");
        JvmType _gtype_1 = f.getGtype();
        CharSequence _serialize_1 = im.serialize(_gtype_1);
        _builder.append(_serialize_1, "");
        _builder.append(">");
      }
    }
    {
      PojoEntity _gref = f.getGref();
      boolean _notEquals_4 = (!Objects.equal(_gref, null));
      if (_notEquals_4) {
        _builder.append("<");
        PojoEntity _gref_1 = f.getGref();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_gref_1);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(">");
      }
    }
    {
      boolean _isArray = f.isArray();
      if (_isArray) {
        _builder.append("[]");
      }
    }
    return _builder;
  }
  
  public CharSequence compileType(final PojoType f, final ImportManager im) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _native = f.getNative();
      boolean _notEquals = (!Objects.equal(_native, null));
      if (_notEquals) {
        String _native_1 = f.getNative();
        String _substring = _native_1.substring(1);
        _builder.append(_substring, "");
      } else {
        PojoEntity _ref = f.getRef();
        boolean _notEquals_1 = (!Objects.equal(_ref, null));
        if (_notEquals_1) {
          PojoEntity _ref_1 = f.getRef();
          JvmType _pojoMethod2jvmType = Utils.pojoMethod2jvmType(_ref_1);
          CharSequence _serialize = im.serialize(_pojoMethod2jvmType);
          _builder.append(_serialize, "");
        } else {
          JvmType _type = f.getType();
          boolean _notEquals_2 = (!Objects.equal(_type, null));
          if (_notEquals_2) {
            JvmType _type_1 = f.getType();
            CharSequence _serialize_1 = im.serialize(_type_1);
            _builder.append(_serialize_1, "");
          }
        }
      }
    }
    {
      JvmType _gtype = f.getGtype();
      boolean _notEquals_3 = (!Objects.equal(_gtype, null));
      if (_notEquals_3) {
        _builder.append("<");
        JvmType _gtype_1 = f.getGtype();
        CharSequence _serialize_2 = im.serialize(_gtype_1);
        _builder.append(_serialize_2, "");
        _builder.append(">");
      }
    }
    {
      PojoEntity _gref = f.getGref();
      boolean _notEquals_4 = (!Objects.equal(_gref, null));
      if (_notEquals_4) {
        _builder.append("<");
        PojoEntity _gref_1 = f.getGref();
        JvmType _pojoMethod2jvmType_1 = Utils.pojoMethod2jvmType(_gref_1);
        CharSequence _serialize_3 = im.serialize(_pojoMethod2jvmType_1);
        _builder.append(_serialize_3, "");
        _builder.append(">");
      }
    }
    {
      boolean _isArray = f.isArray();
      if (_isArray) {
        _builder.append("[]");
      }
    }
    return _builder;
  }
  
  public String completeName(final PojoEntity e) {
    String _package = Utils.getPackage(e);
    String _plus = (_package + ".");
    String _name = e.getName();
    return (_plus + _name);
  }
}
