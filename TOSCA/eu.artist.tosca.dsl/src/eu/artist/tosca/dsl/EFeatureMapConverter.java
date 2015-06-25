//package eu.artist.tosca.dsl;
//
//import org.eclipse.emf.ecore.util.FeatureMap;
//import org.eclipse.emf.ecore.util.FeatureMap.Entry;
//import org.eclipse.emf.ecore.util.FeatureMapUtil;
//import org.eclipse.xtext.conversion.IValueConverter;
//import org.eclipse.xtext.conversion.ValueConverterException;
//import org.eclipse.xtext.nodemodel.INode;
//
//public class EFeatureMapConverter implements IValueConverter<FeatureMap.Entry> {
//
//	@Override
//	public Entry toValue(String string, INode node)
//			throws ValueConverterException {
//		String a=string.substring(2, string.length()-2);
//		return (FeatureMap.Entry) FeatureMapUtil.createTextEntry(a);
//	}
//
//	@Override
//	public String toString(Entry value) throws ValueConverterException {
//		return '<' + value.getValue().toString() + '>';
//	}
//
//}
//
//package eu.artist.tosca.dsl;
//
//import org.eclipse.emf.ecore.util.FeatureMapUtil;
//import org.eclipse.xtext.conversion.IValueConverter;
//import org.eclipse.xtext.conversion.ValueConverterException;
//import org.eclipse.xtext.nodemodel.INode;
//
//import tosca.EFeatureMapType;
//
//public class EFeatureMapConverter implements IValueConverter<EFeatureMapType> {
//
//	@Override
//	public EFeatureMapType toValue(String string, INode node)
//			throws ValueConverterException {
//		String a=string.substring(2, string.length()-2);
//		return (EFeatureMapType) FeatureMapUtil.createTextEntry(a);
//	}
//
//	@Override
//	public String toString(EFeatureMapType entry) throws ValueConverterException {
//		return '<' + entry.getId().toString() + '>';
//	}
//
//}