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

import org.sqlproc.meta.processorMeta.AnnotatedEntity;
import org.sqlproc.meta.processorMeta.Annotation;
import org.sqlproc.meta.processorMeta.Entity;
import org.sqlproc.meta.processorMeta.ProcessorMetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.AnnotatedEntityImpl#getConflictAnnotations <em>Conflict Annotations</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.AnnotatedEntityImpl#getStaticAnnotations <em>Static Annotations</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.AnnotatedEntityImpl#getConstructorAnnotations <em>Constructor Annotations</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.AnnotatedEntityImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.sqlproc.meta.processorMeta.impl.AnnotatedEntityImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotatedEntityImpl extends AbstractPojoEntityImpl implements AnnotatedEntity
{
  /**
   * The cached value of the '{@link #getConflictAnnotations() <em>Conflict Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> conflictAnnotations;

  /**
   * The cached value of the '{@link #getStaticAnnotations() <em>Static Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> staticAnnotations;

  /**
   * The cached value of the '{@link #getConstructorAnnotations() <em>Constructor Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructorAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> constructorAnnotations;

  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotatedEntityImpl()
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
    return ProcessorMetaPackage.Literals.ANNOTATED_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getConflictAnnotations()
  {
    if (conflictAnnotations == null)
    {
      conflictAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS);
    }
    return conflictAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getStaticAnnotations()
  {
    if (staticAnnotations == null)
    {
      staticAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS);
    }
    return staticAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getConstructorAnnotations()
  {
    if (constructorAnnotations == null)
    {
      constructorAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS);
    }
    return constructorAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY, newEntity, newEntity));
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
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS:
        return ((InternalEList<?>)getConflictAnnotations()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS:
        return ((InternalEList<?>)getStaticAnnotations()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS:
        return ((InternalEList<?>)getConstructorAnnotations()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY:
        return basicSetEntity(null, msgs);
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
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS:
        return getConflictAnnotations();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS:
        return getStaticAnnotations();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS:
        return getConstructorAnnotations();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS:
        return getAnnotations();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY:
        return getEntity();
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
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS:
        getConflictAnnotations().clear();
        getConflictAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS:
        getStaticAnnotations().clear();
        getStaticAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS:
        getConstructorAnnotations().clear();
        getConstructorAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY:
        setEntity((Entity)newValue);
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
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS:
        getConflictAnnotations().clear();
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS:
        getStaticAnnotations().clear();
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS:
        getConstructorAnnotations().clear();
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY:
        setEntity((Entity)null);
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
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONFLICT_ANNOTATIONS:
        return conflictAnnotations != null && !conflictAnnotations.isEmpty();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__STATIC_ANNOTATIONS:
        return staticAnnotations != null && !staticAnnotations.isEmpty();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__CONSTRUCTOR_ANNOTATIONS:
        return constructorAnnotations != null && !constructorAnnotations.isEmpty();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case ProcessorMetaPackage.ANNOTATED_ENTITY__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotatedEntityImpl
