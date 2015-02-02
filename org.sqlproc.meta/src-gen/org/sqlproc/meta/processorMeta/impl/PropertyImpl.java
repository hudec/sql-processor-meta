/**
 */
package org.sqlproc.meta.processorMeta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sqlproc.meta.processorMeta.DaogenProperty;
import org.sqlproc.meta.processorMeta.DatabaseProperty;
import org.sqlproc.meta.processorMeta.MetagenProperty;
import org.sqlproc.meta.processorMeta.PojogenProperty;
import org.sqlproc.meta.processorMeta.ProcessorMetaPackage;
import org.sqlproc.meta.processorMeta.Property;
import org.sqlproc.meta.processorMeta.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getPojogen <em>Pojogen</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getMetagen <em>Metagen</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getDaogen <em>Daogen</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getReplaceId <em>Replace Id</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PropertyImpl#getReplacement <em>Replacement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected DatabaseProperty database;

  /**
   * The cached value of the '{@link #getPojogen() <em>Pojogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojogen()
   * @generated
   * @ordered
   */
  protected PojogenProperty pojogen;

  /**
   * The cached value of the '{@link #getMetagen() <em>Metagen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetagen()
   * @generated
   * @ordered
   */
  protected MetagenProperty metagen;

  /**
   * The cached value of the '{@link #getDaogen() <em>Daogen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaogen()
   * @generated
   * @ordered
   */
  protected DaogenProperty daogen;

  /**
   * The default value of the '{@link #getReplaceId() <em>Replace Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaceId()
   * @generated
   * @ordered
   */
  protected static final String REPLACE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReplaceId() <em>Replace Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaceId()
   * @generated
   * @ordered
   */
  protected String replaceId = REPLACE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getRegex() <em>Regex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegex()
   * @generated
   * @ordered
   */
  protected ValueType regex;

  /**
   * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacement()
   * @generated
   * @ordered
   */
  protected ValueType replacement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return ProcessorMetaPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseProperty getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(DatabaseProperty newDatabase, NotificationChain msgs)
  {
    DatabaseProperty oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(DatabaseProperty newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__DATABASE, newDatabase, newDatabase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojogenProperty getPojogen()
  {
    return pojogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPojogen(PojogenProperty newPojogen, NotificationChain msgs)
  {
    PojogenProperty oldPojogen = pojogen;
    pojogen = newPojogen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__POJOGEN, oldPojogen, newPojogen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojogen(PojogenProperty newPojogen)
  {
    if (newPojogen != pojogen)
    {
      NotificationChain msgs = null;
      if (pojogen != null)
        msgs = ((InternalEObject)pojogen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__POJOGEN, null, msgs);
      if (newPojogen != null)
        msgs = ((InternalEObject)newPojogen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__POJOGEN, null, msgs);
      msgs = basicSetPojogen(newPojogen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__POJOGEN, newPojogen, newPojogen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetagenProperty getMetagen()
  {
    return metagen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetagen(MetagenProperty newMetagen, NotificationChain msgs)
  {
    MetagenProperty oldMetagen = metagen;
    metagen = newMetagen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__METAGEN, oldMetagen, newMetagen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetagen(MetagenProperty newMetagen)
  {
    if (newMetagen != metagen)
    {
      NotificationChain msgs = null;
      if (metagen != null)
        msgs = ((InternalEObject)metagen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__METAGEN, null, msgs);
      if (newMetagen != null)
        msgs = ((InternalEObject)newMetagen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__METAGEN, null, msgs);
      msgs = basicSetMetagen(newMetagen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__METAGEN, newMetagen, newMetagen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaogenProperty getDaogen()
  {
    return daogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDaogen(DaogenProperty newDaogen, NotificationChain msgs)
  {
    DaogenProperty oldDaogen = daogen;
    daogen = newDaogen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__DAOGEN, oldDaogen, newDaogen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDaogen(DaogenProperty newDaogen)
  {
    if (newDaogen != daogen)
    {
      NotificationChain msgs = null;
      if (daogen != null)
        msgs = ((InternalEObject)daogen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__DAOGEN, null, msgs);
      if (newDaogen != null)
        msgs = ((InternalEObject)newDaogen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__DAOGEN, null, msgs);
      msgs = basicSetDaogen(newDaogen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__DAOGEN, newDaogen, newDaogen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReplaceId()
  {
    return replaceId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplaceId(String newReplaceId)
  {
    String oldReplaceId = replaceId;
    replaceId = newReplaceId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__REPLACE_ID, oldReplaceId, replaceId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getRegex()
  {
    return regex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegex(ValueType newRegex, NotificationChain msgs)
  {
    ValueType oldRegex = regex;
    regex = newRegex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__REGEX, oldRegex, newRegex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegex(ValueType newRegex)
  {
    if (newRegex != regex)
    {
      NotificationChain msgs = null;
      if (regex != null)
        msgs = ((InternalEObject)regex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__REGEX, null, msgs);
      if (newRegex != null)
        msgs = ((InternalEObject)newRegex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__REGEX, null, msgs);
      msgs = basicSetRegex(newRegex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__REGEX, newRegex, newRegex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getReplacement()
  {
    return replacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplacement(ValueType newReplacement, NotificationChain msgs)
  {
    ValueType oldReplacement = replacement;
    replacement = newReplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__REPLACEMENT, oldReplacement, newReplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplacement(ValueType newReplacement)
  {
    if (newReplacement != replacement)
    {
      NotificationChain msgs = null;
      if (replacement != null)
        msgs = ((InternalEObject)replacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__REPLACEMENT, null, msgs);
      if (newReplacement != null)
        msgs = ((InternalEObject)newReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.PROPERTY__REPLACEMENT, null, msgs);
      msgs = basicSetReplacement(newReplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.PROPERTY__REPLACEMENT, newReplacement, newReplacement));
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
      case ProcessorMetaPackage.PROPERTY__DATABASE:
        return basicSetDatabase(null, msgs);
      case ProcessorMetaPackage.PROPERTY__POJOGEN:
        return basicSetPojogen(null, msgs);
      case ProcessorMetaPackage.PROPERTY__METAGEN:
        return basicSetMetagen(null, msgs);
      case ProcessorMetaPackage.PROPERTY__DAOGEN:
        return basicSetDaogen(null, msgs);
      case ProcessorMetaPackage.PROPERTY__REGEX:
        return basicSetRegex(null, msgs);
      case ProcessorMetaPackage.PROPERTY__REPLACEMENT:
        return basicSetReplacement(null, msgs);
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
      case ProcessorMetaPackage.PROPERTY__NAME:
        return getName();
      case ProcessorMetaPackage.PROPERTY__DATABASE:
        return getDatabase();
      case ProcessorMetaPackage.PROPERTY__POJOGEN:
        return getPojogen();
      case ProcessorMetaPackage.PROPERTY__METAGEN:
        return getMetagen();
      case ProcessorMetaPackage.PROPERTY__DAOGEN:
        return getDaogen();
      case ProcessorMetaPackage.PROPERTY__REPLACE_ID:
        return getReplaceId();
      case ProcessorMetaPackage.PROPERTY__REGEX:
        return getRegex();
      case ProcessorMetaPackage.PROPERTY__REPLACEMENT:
        return getReplacement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProcessorMetaPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__DATABASE:
        setDatabase((DatabaseProperty)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__POJOGEN:
        setPojogen((PojogenProperty)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__METAGEN:
        setMetagen((MetagenProperty)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__DAOGEN:
        setDaogen((DaogenProperty)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__REPLACE_ID:
        setReplaceId((String)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__REGEX:
        setRegex((ValueType)newValue);
        return;
      case ProcessorMetaPackage.PROPERTY__REPLACEMENT:
        setReplacement((ValueType)newValue);
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
      case ProcessorMetaPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorMetaPackage.PROPERTY__DATABASE:
        setDatabase((DatabaseProperty)null);
        return;
      case ProcessorMetaPackage.PROPERTY__POJOGEN:
        setPojogen((PojogenProperty)null);
        return;
      case ProcessorMetaPackage.PROPERTY__METAGEN:
        setMetagen((MetagenProperty)null);
        return;
      case ProcessorMetaPackage.PROPERTY__DAOGEN:
        setDaogen((DaogenProperty)null);
        return;
      case ProcessorMetaPackage.PROPERTY__REPLACE_ID:
        setReplaceId(REPLACE_ID_EDEFAULT);
        return;
      case ProcessorMetaPackage.PROPERTY__REGEX:
        setRegex((ValueType)null);
        return;
      case ProcessorMetaPackage.PROPERTY__REPLACEMENT:
        setReplacement((ValueType)null);
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
      case ProcessorMetaPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorMetaPackage.PROPERTY__DATABASE:
        return database != null;
      case ProcessorMetaPackage.PROPERTY__POJOGEN:
        return pojogen != null;
      case ProcessorMetaPackage.PROPERTY__METAGEN:
        return metagen != null;
      case ProcessorMetaPackage.PROPERTY__DAOGEN:
        return daogen != null;
      case ProcessorMetaPackage.PROPERTY__REPLACE_ID:
        return REPLACE_ID_EDEFAULT == null ? replaceId != null : !REPLACE_ID_EDEFAULT.equals(replaceId);
      case ProcessorMetaPackage.PROPERTY__REGEX:
        return regex != null;
      case ProcessorMetaPackage.PROPERTY__REPLACEMENT:
        return replacement != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", replaceId: ");
    result.append(replaceId);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
