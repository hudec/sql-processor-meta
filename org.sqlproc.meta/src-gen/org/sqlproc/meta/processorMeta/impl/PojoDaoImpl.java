/**
 */
package org.sqlproc.meta.processorMeta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sqlproc.meta.processorMeta.PojoDao;
import org.sqlproc.meta.processorMeta.PojoDaoModifier;
import org.sqlproc.meta.processorMeta.PojoEntity;
import org.sqlproc.meta.processorMeta.PojoEntityModifier1;
import org.sqlproc.meta.processorMeta.PojoMethod;
import org.sqlproc.meta.processorMeta.ProcessorMetaPackage;
import org.sqlproc.meta.processorMeta.ToInitMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Dao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getModifiers1 <em>Modifiers1</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#isPojoGenerics <em>Pojo Generics</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getPojo <em>Pojo</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getModifiers2 <em>Modifiers2</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.PojoDaoImpl#getToInits <em>To Inits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoDaoImpl extends AbstractPojoEntityImpl implements PojoDao
{
  /**
   * The cached value of the '{@link #getModifiers1() <em>Modifiers1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers1()
   * @generated
   * @ordered
   */
  protected EList<PojoEntityModifier1> modifiers1;

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
   * The default value of the '{@link #isPojoGenerics() <em>Pojo Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPojoGenerics()
   * @generated
   * @ordered
   */
  protected static final boolean POJO_GENERICS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPojoGenerics() <em>Pojo Generics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPojoGenerics()
   * @generated
   * @ordered
   */
  protected boolean pojoGenerics = POJO_GENERICS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPojo() <em>Pojo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPojo()
   * @generated
   * @ordered
   */
  protected PojoEntity pojo;

  /**
   * The cached value of the '{@link #getModifiers2() <em>Modifiers2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers2()
   * @generated
   * @ordered
   */
  protected EList<PojoDaoModifier> modifiers2;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<PojoMethod> methods;

  /**
   * The cached value of the '{@link #getToInits() <em>To Inits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToInits()
   * @generated
   * @ordered
   */
  protected EList<ToInitMethod> toInits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PojoDaoImpl()
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
    return ProcessorMetaPackage.Literals.POJO_DAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoEntityModifier1> getModifiers1()
  {
    if (modifiers1 == null)
    {
      modifiers1 = new EObjectContainmentEList<PojoEntityModifier1>(PojoEntityModifier1.class, this, ProcessorMetaPackage.POJO_DAO__MODIFIERS1);
    }
    return modifiers1;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.POJO_DAO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPojoGenerics()
  {
    return pojoGenerics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojoGenerics(boolean newPojoGenerics)
  {
    boolean oldPojoGenerics = pojoGenerics;
    pojoGenerics = newPojoGenerics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.POJO_DAO__POJO_GENERICS, oldPojoGenerics, pojoGenerics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity getPojo()
  {
    if (pojo != null && pojo.eIsProxy())
    {
      InternalEObject oldPojo = (InternalEObject)pojo;
      pojo = (PojoEntity)eResolveProxy(oldPojo);
      if (pojo != oldPojo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorMetaPackage.POJO_DAO__POJO, oldPojo, pojo));
      }
    }
    return pojo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PojoEntity basicGetPojo()
  {
    return pojo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPojo(PojoEntity newPojo)
  {
    PojoEntity oldPojo = pojo;
    pojo = newPojo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.POJO_DAO__POJO, oldPojo, pojo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoDaoModifier> getModifiers2()
  {
    if (modifiers2 == null)
    {
      modifiers2 = new EObjectContainmentEList<PojoDaoModifier>(PojoDaoModifier.class, this, ProcessorMetaPackage.POJO_DAO__MODIFIERS2);
    }
    return modifiers2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PojoMethod> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<PojoMethod>(PojoMethod.class, this, ProcessorMetaPackage.POJO_DAO__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ToInitMethod> getToInits()
  {
    if (toInits == null)
    {
      toInits = new EObjectContainmentEList<ToInitMethod>(ToInitMethod.class, this, ProcessorMetaPackage.POJO_DAO__TO_INITS);
    }
    return toInits;
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
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS1:
        return ((InternalEList<?>)getModifiers1()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS2:
        return ((InternalEList<?>)getModifiers2()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.POJO_DAO__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.POJO_DAO__TO_INITS:
        return ((InternalEList<?>)getToInits()).basicRemove(otherEnd, msgs);
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
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS1:
        return getModifiers1();
      case ProcessorMetaPackage.POJO_DAO__NAME:
        return getName();
      case ProcessorMetaPackage.POJO_DAO__POJO_GENERICS:
        return isPojoGenerics();
      case ProcessorMetaPackage.POJO_DAO__POJO:
        if (resolve) return getPojo();
        return basicGetPojo();
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS2:
        return getModifiers2();
      case ProcessorMetaPackage.POJO_DAO__METHODS:
        return getMethods();
      case ProcessorMetaPackage.POJO_DAO__TO_INITS:
        return getToInits();
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
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS1:
        getModifiers1().clear();
        getModifiers1().addAll((Collection<? extends PojoEntityModifier1>)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__NAME:
        setName((String)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__POJO_GENERICS:
        setPojoGenerics((Boolean)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__POJO:
        setPojo((PojoEntity)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS2:
        getModifiers2().clear();
        getModifiers2().addAll((Collection<? extends PojoDaoModifier>)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends PojoMethod>)newValue);
        return;
      case ProcessorMetaPackage.POJO_DAO__TO_INITS:
        getToInits().clear();
        getToInits().addAll((Collection<? extends ToInitMethod>)newValue);
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
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS1:
        getModifiers1().clear();
        return;
      case ProcessorMetaPackage.POJO_DAO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProcessorMetaPackage.POJO_DAO__POJO_GENERICS:
        setPojoGenerics(POJO_GENERICS_EDEFAULT);
        return;
      case ProcessorMetaPackage.POJO_DAO__POJO:
        setPojo((PojoEntity)null);
        return;
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS2:
        getModifiers2().clear();
        return;
      case ProcessorMetaPackage.POJO_DAO__METHODS:
        getMethods().clear();
        return;
      case ProcessorMetaPackage.POJO_DAO__TO_INITS:
        getToInits().clear();
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
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS1:
        return modifiers1 != null && !modifiers1.isEmpty();
      case ProcessorMetaPackage.POJO_DAO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProcessorMetaPackage.POJO_DAO__POJO_GENERICS:
        return pojoGenerics != POJO_GENERICS_EDEFAULT;
      case ProcessorMetaPackage.POJO_DAO__POJO:
        return pojo != null;
      case ProcessorMetaPackage.POJO_DAO__MODIFIERS2:
        return modifiers2 != null && !modifiers2.isEmpty();
      case ProcessorMetaPackage.POJO_DAO__METHODS:
        return methods != null && !methods.isEmpty();
      case ProcessorMetaPackage.POJO_DAO__TO_INITS:
        return toInits != null && !toInits.isEmpty();
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
    result.append(", pojoGenerics: ");
    result.append(pojoGenerics);
    result.append(')');
    return result.toString();
  }

} //PojoDaoImpl
