/**
 */
package org.sqlproc.meta.processorMeta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.common.types.JvmType;

import org.sqlproc.meta.processorMeta.ExtendsAssignement;
import org.sqlproc.meta.processorMeta.ProcessorMetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends Assignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ExtendsAssignementImpl#getToExtends <em>To Extends</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ExtendsAssignementImpl#getDbTables <em>Db Tables</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.ExtendsAssignementImpl#getDbNotTables <em>Db Not Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendsAssignementImpl extends MinimalEObjectImpl.Container implements ExtendsAssignement
{
  /**
   * The cached value of the '{@link #getToExtends() <em>To Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToExtends()
   * @generated
   * @ordered
   */
  protected JvmType toExtends;

  /**
   * The cached value of the '{@link #getDbTables() <em>Db Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbTables;

  /**
   * The cached value of the '{@link #getDbNotTables() <em>Db Not Tables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDbNotTables()
   * @generated
   * @ordered
   */
  protected EList<String> dbNotTables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendsAssignementImpl()
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
    return ProcessorMetaPackage.Literals.EXTENDS_ASSIGNEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getToExtends()
  {
    if (toExtends != null && toExtends.eIsProxy())
    {
      InternalEObject oldToExtends = (InternalEObject)toExtends;
      toExtends = (JvmType)eResolveProxy(oldToExtends);
      if (toExtends != oldToExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS, oldToExtends, toExtends));
      }
    }
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetToExtends()
  {
    return toExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToExtends(JvmType newToExtends)
  {
    JvmType oldToExtends = toExtends;
    toExtends = newToExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS, oldToExtends, toExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbTables()
  {
    if (dbTables == null)
    {
      dbTables = new EDataTypeEList<String>(String.class, this, ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_TABLES);
    }
    return dbTables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDbNotTables()
  {
    if (dbNotTables == null)
    {
      dbNotTables = new EDataTypeEList<String>(String.class, this, ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_NOT_TABLES);
    }
    return dbNotTables;
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
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS:
        if (resolve) return getToExtends();
        return basicGetToExtends();
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_TABLES:
        return getDbTables();
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_NOT_TABLES:
        return getDbNotTables();
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
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS:
        setToExtends((JvmType)newValue);
        return;
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_TABLES:
        getDbTables().clear();
        getDbTables().addAll((Collection<? extends String>)newValue);
        return;
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_NOT_TABLES:
        getDbNotTables().clear();
        getDbNotTables().addAll((Collection<? extends String>)newValue);
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
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS:
        setToExtends((JvmType)null);
        return;
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_TABLES:
        getDbTables().clear();
        return;
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_NOT_TABLES:
        getDbNotTables().clear();
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
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__TO_EXTENDS:
        return toExtends != null;
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_TABLES:
        return dbTables != null && !dbTables.isEmpty();
      case ProcessorMetaPackage.EXTENDS_ASSIGNEMENT__DB_NOT_TABLES:
        return dbNotTables != null && !dbNotTables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dbTables: ");
    result.append(dbTables);
    result.append(", dbNotTables: ");
    result.append(dbNotTables);
    result.append(')');
    return result.toString();
  }

} //ExtendsAssignementImpl
