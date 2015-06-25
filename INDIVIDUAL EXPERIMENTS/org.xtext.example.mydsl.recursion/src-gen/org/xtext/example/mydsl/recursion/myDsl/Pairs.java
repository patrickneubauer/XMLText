/**
 */
package org.xtext.example.mydsl.recursion.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pairs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.recursion.myDsl.Pairs#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.recursion.myDsl.MyDslPackage#getPairs()
 * @model
 * @generated
 */
public interface Pairs extends Element
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.recursion.myDsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.recursion.myDsl.MyDslPackage#getPairs_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Pairs
