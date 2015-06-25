/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFeature Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.EFeatureMapType#getId <em>Id</em>}</li>
 *   <li>{@link tosca.EFeatureMapType#getPropertyKeyValuePair <em>Property Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getEFeatureMapType()
 * @model
 * @generated
 */
public interface EFeatureMapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tosca.ToscaPackage#getEFeatureMapType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tosca.EFeatureMapType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Property Key Value Pair</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.EFeatureMapEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Key Value Pair</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Key Value Pair</em>' containment reference list.
	 * @see tosca.ToscaPackage#getEFeatureMapType_PropertyKeyValuePair()
	 * @model containment="true"
	 * @generated
	 */
	EList<EFeatureMapEntryType> getPropertyKeyValuePair();

} // EFeatureMapType
