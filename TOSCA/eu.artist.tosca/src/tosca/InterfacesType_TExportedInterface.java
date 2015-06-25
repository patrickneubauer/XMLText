/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces Type TExported Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.InterfacesType_TExportedInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getInterfacesType_TExportedInterface()
 * @model
 * @generated
 */
public interface InterfacesType_TExportedInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TExportedInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see tosca.ToscaPackage#getInterfacesType_TExportedInterface_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TExportedInterface> getInterface();

} // InterfacesType_TExportedInterface
