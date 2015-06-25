/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.PropertiesType#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getPropertiesType()
 * @model
 * @generated
 */
public interface PropertiesType extends EObject {

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(EFeatureMapType)
	 * @see tosca.ToscaPackage#getPropertiesType_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EFeatureMapType getMap();

	/**
	 * Sets the value of the '{@link tosca.PropertiesType#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(EFeatureMapType value);
} // PropertiesType
