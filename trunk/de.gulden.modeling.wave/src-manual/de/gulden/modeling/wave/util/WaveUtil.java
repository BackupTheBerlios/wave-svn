/*
 * WAVE - Web Application Visual Environment
 * A Graphical Modeling Framework (GMF) Plugin for Eclipse
 * Copyright Jens Gulden, 2009, mail@jensgulden.de
 * Licensed under the GNU General Public License (GPL)
 */
package de.gulden.modeling.wave.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.xtend.util.stdlib.GlobalVarExtensions;

import de.gulden.modeling.wave.Action;
import de.gulden.modeling.wave.ActionToViewTransition;
import de.gulden.modeling.wave.Actor;
import de.gulden.modeling.wave.AssociationRelationship;
import de.gulden.modeling.wave.Attribute;
import de.gulden.modeling.wave.Classifier;
import de.gulden.modeling.wave.ClassifierMember;
import de.gulden.modeling.wave.Controller;
import de.gulden.modeling.wave.ControllerMember;
import de.gulden.modeling.wave.ControllerMemberExecutable;
import de.gulden.modeling.wave.DependencyRelationship;
import de.gulden.modeling.wave.Dictionary;
import de.gulden.modeling.wave.EnumDirection;
import de.gulden.modeling.wave.EnumDisplayMode;
import de.gulden.modeling.wave.EnumLabelMode;
import de.gulden.modeling.wave.EnumMultiplicity;
import de.gulden.modeling.wave.EnumVisibility;
import de.gulden.modeling.wave.Enumeration;
import de.gulden.modeling.wave.Form;
import de.gulden.modeling.wave.Include;
import de.gulden.modeling.wave.InheritanceRelationship;
import de.gulden.modeling.wave.Label;
import de.gulden.modeling.wave.Model;
import de.gulden.modeling.wave.ModelMember;
import de.gulden.modeling.wave.OOPClassifier;
import de.gulden.modeling.wave.Operation;
import de.gulden.modeling.wave.Package;
import de.gulden.modeling.wave.RealizationRelationship;
import de.gulden.modeling.wave.StyleSheet;
import de.gulden.modeling.wave.TaggedValue;
import de.gulden.modeling.wave.TopLevelModelMember;
import de.gulden.modeling.wave.Usecase;
import de.gulden.modeling.wave.UsecaseSubsystem;
import de.gulden.modeling.wave.View;
import de.gulden.modeling.wave.ViewTransition;
import de.gulden.modeling.wave.WaveFactory;
import de.gulden.modeling.wave.WavePackage;
import de.gulden.modeling.wave.Widget;
import de.gulden.modeling.wave.WidgetAssociation;
import de.gulden.modeling.wave.WidgetAttribute;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.AssociationRelationshipFigureBase;
import de.gulden.modeling.wave.diagram.edit.parts.Class2EditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ClassEditPart;
import de.gulden.modeling.wave.diagram.edit.parts.ModelEditPart;
import de.gulden.modeling.wave.impl.AttributeImpl;
import de.gulden.modeling.wave.impl.ClassImpl;
import de.gulden.modeling.wave.impl.OperationImpl;
import de.gulden.modeling.wave.impl.TaggedValueImpl;

/**
 * This utility class encapsulates the business logic of generating
 * code fragments for the gui or the overall code generation via XPand.
 * The code is not located in the OO classes in order to keep
 * modifications in the generated classes as minimal invasive as possible.  
 * 
 * @author Jens Gulden 
 */
public class WaveUtil { // <<utility>>
	
	public final static String MAGIC_BEGIN = "/*begin ";
	public final static String MAGIC_END = "/*end ";
	
	/**
	 * TODO doc
	 */
	public static Adapter signatureListener = new Adapter() {

		public Notifier getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isAdapterForType(Object type) {
			// TODO Auto-generated method stub
			return false;
		}

		public void notifyChanged(Notification notification) {
			Object o = notification.getNotifier(); //Feature();
			if (o instanceof AttributeImpl) {
				AttributeImpl att = ((AttributeImpl)o);
				int id = notification.getFeatureID(Attribute.class);
				switch (id) {
					case WavePackage.ATTRIBUTE__NAME:
					case WavePackage.ATTRIBUTE__TYPE:
					case WavePackage.ATTRIBUTE__DEFAULT_VALUE:
					case WavePackage.ATTRIBUTE__VISIBILITY:
						String oldSignature = att.getSignature(); 
						att.markDirty();
						String newSignature = att.getSignature(); 
						att.eNotify(new ENotificationImpl(att, Notification.SET, WavePackage.ATTRIBUTE__SIGNATURE, oldSignature, newSignature));
				}
			} else if (o instanceof OperationImpl) {
				OperationImpl op = ((OperationImpl)o);
				int id = notification.getFeatureID(Operation.class);
				switch (id) {
					case WavePackage.OPERATION__NAME:
					case WavePackage.OPERATION__RETURN_TYPE:
					case WavePackage.OPERATION__VISIBILITY:
					case WavePackage.OPERATION__PARAMETERS:
						String oldSignature = op.getSignature(); 
						op.markDirty();
						String newSignature = op.getSignature(); 
						op.eNotify(new ENotificationImpl(op, Notification.SET, WavePackage.ATTRIBUTE__SIGNATURE, oldSignature, newSignature));
				}
			}
			/*
			if ((o instanceof Attribute) || (o instanceof Operation)) {
				String oldVal = notification.getOldStringValue();
				String newVal = notification.getNewStringValue();
				if (((oldVal == null) && (newVal != null)) || ( ! oldVal.equals(newVal) )) {
					if (o instanceof Attribute) {
						parseAttributeSignature((Attribute)o, newVal);
					} else if (o instanceof Operation) {
						parseOperationSignature((Operation)o, newVal);
					}
				}
			}
			*/
			
		}

		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			
		}

	};
	
	public static Model getModel(ModelMember member) {
		if (member instanceof Model) {
			return (Model)member;
		} else {
			return getModel((ModelMember)member.eContainer()); // recursion
		}
	}
	
	public static void setRectilinearLineStyle(org.eclipse.gmf.runtime.notation.View view) {
		// TODO move to own class for runtime-utils, keep separate from codegen-utils
		org.eclipse.gmf.runtime.notation.NotationPackage NOTATION = org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE;
		org.eclipse.emf.ecore.EClass routingStyle = NOTATION.getRoutingStyle();
		org.eclipse.gmf.runtime.notation.RoutingStyle routing = (org.eclipse.gmf.runtime.notation.RoutingStyle) view.getStyle(routingStyle);
		if (routing == null){
		    routing = (org.eclipse.gmf.runtime.notation.RoutingStyle) view.createStyle(routingStyle);
		}
		routing.setRouting(org.eclipse.gmf.runtime.notation.Routing.RECTILINEAR_LITERAL);
	}
	
	public static String toCondition(String s) {
		if ((s != null) && (s.trim().length()>0) && ( ! s.equals("<...>") ) ) {
			return "["+s+"]";
		} else {
			return "";
		}
	}

	public static String toStereotype(String s) {
		if ((s != null) && (s.trim().length()>0) && ( ! s.equals("<...>") ) ) {
			//return "«"+s+"»";
			return "<<"+s+">>"; // TODO platform-independent french quotation marks
		} else {
			return "";
		}
	}

	public static String normalizeCode(String s) {
		s = noNull(s);
		s = s.trim();
		if (s.length() == 0) {
			s = "\t// TODO";
		}
		if ( ! s.startsWith("<?php\n{") ) {
			s = "<?php\n{\n\t" + s.trim();
		}
		if ( ! s.endsWith("}") ) {
			s = s + "\n}";
		}
		s = s/*.trim()*/ + "\n";
		return s;
	}
	
	public static String noNull(String s) {
		return (s == null) ? "" : s; 
	}
	
	public static String without(String s, String remove) {
		int pos = s.indexOf(remove);
		if (pos != -1) {
			return s.substring(0, pos) + s.substring(pos + remove.length());
		} else {
			return s;
		}
	}
	
	/**
	 * Parses a model signature of either an attribute or an operation.
	 * 
	 * @param o either of type Attribute or Operation
	 * @param signature
	 */
	public static void parseSignature(Object o, String signature) {
		if (signature == null) return;
		String s = signature.trim();
		//s = removeAllBlanks(s);
		if (s.length() == 0) return;
		
		boolean operation = (o instanceof Operation);
		boolean specialOperation = isSpecialOperation(o); //((o instanceof OperationImpl) && (((OperationImpl)o).eC Parent()!=null));
		
		StringTokenizer st = new StringTokenizer(signature, "+#-~:(),=", true);
		String tok = nextToken(st);
		
		String name = "anonymous";
		String type = "String";
		EnumVisibility visibility = EnumVisibility.PUBLIC;
		
		if (! specialOperation ) { // operations inside Actions and Views don't have visibility and derive name from parent
			// visibility
			visibility = EnumVisibility.PUBLIC; // default
			char first = tok.charAt(0);
			switch (first) {
				case '+': visibility = EnumVisibility.PUBLIC;
				          tok = nextToken(st);
						  break;
				case '#': visibility = EnumVisibility.PROTECTED;
		          		  tok = nextToken(st);
	    		  		  break;
				case '~': visibility = EnumVisibility.PACKAGE;
		          		  tok = nextToken(st);
		          		  break;
				case '-': visibility = EnumVisibility.PRIVATE;
		          		  tok = nextToken(st);
	    		  		  break;
			}
			
			// name
			name = tok;
			type = null;
			tok = nextToken(st);
		}
		
		List<Attribute> parameters = new ArrayList<Attribute>();
		if (operation) {
			if ("(".equals(tok)) {
				tok = nextToken(st);
				while ((tok != null) && ( ! ")".equals(tok) ) ) {
					String paramName = tok;
					String paramType = null;
					tok = nextToken(st);
					if (":".equals(tok)) { // type follows
						tok = nextToken(st);
						paramType = tok;
						tok = nextToken(st);
					}
					if (",".equals(tok)) { // ',' expected or ')' 
						tok = nextToken(st);
					}
					Attribute param = WaveFactory.eINSTANCE.createAttribute(); //new AttributeImpl();
					param.setName(paramName);
					if (paramType != null) {
						param.setType(paramType);
					}
					parameters.add(param);
				}
				if (tok != null) { // ')'
					tok = nextToken(st);
				}
			}
		}
		
		if (! specialOperation ) { // operations inside Actions and Views have fix return type String
			
			if (":".equals(tok)) { // type follows
				tok = nextToken(st);
				if (tok != null) {
					type = tok; //getType(tok);
					tok = nextToken(st);
				}
			}
			
		} else {
			//type = "String";
		}
		
		if (operation) { // Operation
			Operation op = (Operation)o;
			op.setName(name);
			op.setVisibility(visibility);
			if (type != null) {
				op.setReturnType(type);
			} else {
				op.setReturnType("void");
			}
			op.getParameters().clear();
			//for (Attribute param : parameters) {
				op.getParameters().addAll(parameters);
			//}
			
		} else { // Attribute
			
			String defaultValue = null;
			if ("=".equals(tok)) { // default value follows
				tok = nextToken(st);
				if (tok != null) {
					defaultValue = tok;
					tok = nextToken(st);
				}
			}
			
			Attribute att = (Attribute)o;
			att.setName(name);
			att.setVisibility(visibility);
			if (type != null) {
				att.setType(type);
			}
			if (defaultValue != null) {
				att.setDefaultValue(defaultValue);
			}
		}
		
//System.out.println("parse: "+signature);		
	}
	
	/**
	 * Creates a signature string for either an attribute or an operation.
	 * @param o either of type Attribute or Operation
	 * @return signature
	 */
	public static String buildSignature(Object o) {
		return buildSignature(o, isSpecialOperation(o));
	}
	
	protected static String buildSignature(Object o, boolean specialOperation) {
		if (o instanceof Operation) { // Operation
			Operation op = (Operation)o;
//System.out.println("buildOperation: "+op.getName());
			String t = op.getReturnType();
			if (t == null) {
				t = "void";
			}
			if (!specialOperation) {
				return visibilityStr(op.getVisibility()) + op.getName() + "(" + parametersStr(op.getParameters()) + ") : "+t;
			} else {
				return "(" + parametersStr(op.getParameters()) + ")";
			}

		} else { // Attribute
			Attribute att = (Attribute)o;
			String t = att.getType();
			if (t == null) {
				t = "";
			} else {
				t = " : "+t;
			}
			String d = att.getDefaultValue();
			if (d == null || d.trim().length() == 0) {		
				d = "";
			} else {
				d = " = "+d;
			}
//System.out.println("buildAttribute: "+att.getName());		
			return visibilityStr(att.getVisibility()) + att.getName() + t + d;

		}
	}
	
	public static String buildSignatureID(Operation op) {
//System.out.println("buildOperation: "+op.getName());
		String t = op.getReturnType();
		if (t == null) {
			t = "void";
		}
		return op.getName() + parameterTypesStr(op.getParameters());
	}
	
	public static boolean isSpecialOperation(Object o) {
		/*if (o instanceof EObject) {
			EObject eo = (EObject)o;
			Object parent = eo.eContainer();
			return (parent instanceof Action || parent instanceof View);
		} else {
			return false;
		}*/
		if (o instanceof Operation) {
			String name = ((Operation)o).getName();
			return (name.startsWith("view_")) || (name.startsWith("action_"));
		}
		return false;
	}
	
	public static String getSourceEditorTitle(EObject o) {
		if (o instanceof OperationImpl) {
			EObject parent = ((OperationImpl)o).eContainer(); 
			if ( ! (parent instanceof View) ) {
				String sig = buildSignature(o, false);
				if (sig.length() != 0) {
					sig = sig.substring(1); // no + # -
				}
				return sig;
			} else { // View
				return null; // will lead to hiding title-label
			}
		} else if (o instanceof Classifier) {
			String typeName = o.getClass().getSimpleName();
			if (typeName.endsWith("Impl")) {
				typeName = typeName.substring(0, typeName.length() - 4);
			}
			return typeName + " " + noNull(((Classifier)o).getName());
		} else if (o instanceof Action) {
			return "Action " + noNull(((Action)o).getName());
		} else if (o instanceof View) {
			return "View " + noNull(((View)o).getName());
		} else {
			return "Source";
		}
	}
	
	public static String getDefaultCode(OperationImpl op) {
		//EObject parent = op.eContainer(); 
		//if (! (parent instanceof View) ) {
			return "<?php\n{\n\t// TODO\n}\n";
		//} else {
		//	return "<?\n\n// TODO\n\n?>\n";
		//}
	}
	
	private static String nextToken(StringTokenizer st) {
		if (st.hasMoreTokens()) {
			String tok = st.nextToken();
			tok = tok.trim();
			if (tok.length() != 0) {
				return tok;
			} else {
				return nextToken(st); // recursion
			}
		} else {
			return null;
		}
	}
	
	private static String visibilityStr(EnumVisibility v) {
		switch (v) {
			case PUBLIC: return "+"; 
			case PROTECTED: return "#"; 
			case PACKAGE: return "~"; 
			case PRIVATE: return "-"; 
		}
		return "+"; // default
	}
	
	private static String parametersStr(EList<Attribute> l) {
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		for (Attribute att : l) {
			if (!first) {
				sb.append(", ");
			}
			sb.append(att.getName());
			String t = att.getType();
			if (t != null) {
				sb.append(':');
				sb.append(t);
			}
			first = false;
		}
		return sb.toString();
	}
	
	private static String parameterTypesStr(EList<Attribute> l) {
		StringBuffer sb = new StringBuffer();
		for (Attribute att : l) {
			sb.append('-');
			sb.append(att.getType());
		}
		return sb.toString();
	}
	
	public static String removeAllBlanks(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (! Character.isSpaceChar(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	
	public static Collection<ModelMember> getAllMembers(Package p) {
		ArrayList<ModelMember> l = new ArrayList<ModelMember>();
		getAllMembers(p, l);
		return l;
	}
	
	protected static void getAllMembers(Package p, ArrayList<ModelMember> l) {
		for (ModelMember m : p.getMembers()) {
			l.add(m);
			if (m instanceof Package) {
				getAllMembers((Package)m, l); // recursion
			}
		}
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Classifier> getExtended(Classifier c) {
		Model model = getModel(c);
		Collection<Classifier> result = new ArrayList<Classifier>(); 
		for (InheritanceRelationship r : new Filter<InheritanceRelationship>(InheritanceRelationship.class, getAllMembers(model))) {
			if (r.getChild() == c) {
				result.add(r.getParent());
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static List<TaggedValue> getAllTaggedValues(ModelMember m) {
		return m.getTaggedValue();
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static List<String> getTaggedValues(ModelMember m, String key) {
		List<String> result = new ArrayList<String>(); 
		for (TaggedValue t : getAllTaggedValues(m)) {
			if (t.getKey().equals(key)) {
				String s = t.getValue();
				// split comma-seperated
				StringTokenizer st = new StringTokenizer(s, ",", false);
				while (st.hasMoreTokens()) {
					result.add(st.nextToken().trim());
				}
			}
		}
		return result;
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static String getTaggedValue(ModelMember m, String key) {
		List<String> result = new ArrayList<String>(); 
		for (TaggedValue t : getAllTaggedValues(m)) {
			if (t.getKey().equals(key)) {
				return t.getValue();
			}
		}
		return null;
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static boolean hasTaggedValue(ModelMember m, String key) {
		List<String> result = new ArrayList<String>(); 
		for (TaggedValue t : getAllTaggedValues(m)) {
			if (t.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<String> getEnumerations(Model model) {
		Collection<String> result = new ArrayList<String>(); 
		for (Enumeration e : new Filter<Enumeration>(Enumeration.class, getAllMembers(model))) {
			result.add(e.getName());
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<StyleSheet> getStyleSheets(Model model) {
		Collection<StyleSheet> result = new ArrayList<StyleSheet>(); 
		for (StyleSheet s : new Filter<StyleSheet>(StyleSheet.class, getAllMembers(model))) {
			result.add(s);
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static Collection<UsecaseSubsystem> getUsecaseSubsystems(Model model) {
		Collection<UsecaseSubsystem> result = new ArrayList<UsecaseSubsystem>(); 
		for (UsecaseSubsystem s : new Filter<UsecaseSubsystem>(UsecaseSubsystem.class, getAllMembers(model))) {
			result.add(s);
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static Include getLayoutTemplateInclude(Controller p) {
		for (Include inc : getIncludes(p)) {
			if ( hasTaggedValue(inc, "layoutTemplate") ) {
				return inc;
			}
		}
		return null;
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static void setTaggedValue(ModelMember m, String key, String value) {
		List<TaggedValue> tt = getAllTaggedValues(m);
		Iterator<TaggedValue> iterator = tt.iterator();
		boolean found = false;
		TaggedValue t = null;
		while ((!found) && (iterator.hasNext())) {
			t = iterator.next();
			found = t.getKey().equals(key);
		}
		if (found) {
			// remove all that follow
			Collection<TaggedValue> rem = new ArrayList<TaggedValue>();
			while (iterator.hasNext()) {
				TaggedValue ttt = iterator.next();
				rem.add(ttt);
			}
			m.getTaggedValue().removeAll(rem);
			t.setValue(value);
		} else {
			t = new TaggedValueImpl(key, value);
			m.getTaggedValue().add(t);
		}
	}

	/**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Classifier> getImplemented(Classifier c) {
		Model model = getModel(c);
		Collection<Classifier> result = new ArrayList<Classifier>(); 
		for (RealizationRelationship r : new Filter<RealizationRelationship>(RealizationRelationship.class, getAllMembers(model))) {
			if (r.getImplementingClass() == c) {
				result.add(r.getParentInterface());
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static Collection<ModelMember> getDepends(ModelMember m) {
		Model model = getModel(m);
		Collection<ModelMember> result = new ArrayList<ModelMember>(); 
		for (DependencyRelationship r : new Filter<DependencyRelationship>(DependencyRelationship.class, getAllMembers(model))) {
			if (r.getClient() == m) {
				result.add(r.getSupplier());
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static Collection<Include> getIncludes(ModelMember m) {
		Model model = getModel(m);
		Collection<Include> result = new ArrayList<Include>(); 
		for (DependencyRelationship r : new Filter<DependencyRelationship>(DependencyRelationship.class, getAllMembers(model))) {
			if ( (r.getClient() == m) && (r.getSupplier() instanceof Include) ) {
				result.add((Include)r.getSupplier());
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAssociations(OOPClassifier c) {
		Model model = getModel(c);
		Collection<AssociationRelationship> result = new ArrayList<AssociationRelationship>(); 
		for (AssociationRelationship r : new Filter<AssociationRelationship>(AssociationRelationship.class, getAllMembers(model))) {
			if ((r.getA() == c) || (r.getB() == c)) {
				result.add(r);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<EObject> getAssociationsWithType(OOPClassifier c, Class type) {
		Collection<EObject> result = new ArrayList<EObject>(); 
		for (AssociationRelationship r : getAssociations(c)) {
			if ((r.getA() == c) && (type.isInstance(r.getB()))) {
				result.add(r.getB());
			} else if ((r.getB() == c) && (type.isInstance(r.getA()))) {
				result.add(r.getA());
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Actor> getAssociatiatedActors(Usecase c) {
		Collection<Actor> result = new ArrayList<Actor>(); 
		for (EObject o : getAssociationsWithType(c, Actor.class)) {
			result.add((Actor)o);
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getInheritedAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		for (Classifier superc : getExtended(c)) {
			if (superc instanceof OOPClassifier) {
				result.addAll(getAllAssociations((OOPClassifier)superc));
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAllAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		result.addAll(getInheritedAssociations(c));
		result.addAll(getAssociations(c));
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getOutgoingSinglevalAssociations(OOPClassifier c) {
		Model model = getModel(c);
		Collection<AssociationRelationship> result = new ArrayList<AssociationRelationship>(); 
		for (AssociationRelationship r : new Filter<AssociationRelationship>(AssociationRelationship.class, getAllMembers(model))) {
			if (/*(r.getDirection()!=EnumDirection.BA) &&*/ (r.getA() == c) && (!isMultiple(r.getMultiplicityB())) 
					|| (/*(r.getDirection()!=EnumDirection.AB) &&*/ (r.getB() == c) && (!isMultiple(r.getMultiplicityA())))
						/*&& ( ! isBidirectional(r) )*/ ) {
				result.add(r);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getInheritedOutgoingSinglevalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		for (Classifier superc : getExtended(c)) {
			if (superc instanceof OOPClassifier) {
				result.addAll(getAllOutgoingSinglevalAssociations((OOPClassifier)superc));
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAllOutgoingSinglevalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		result.addAll(getInheritedOutgoingSinglevalAssociations(c));
		result.addAll(getOutgoingSinglevalAssociations(c));
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getOutgoingMultivalAssociations(OOPClassifier c) {
		Model model = getModel(c);
		Collection<AssociationRelationship> result = new ArrayList<AssociationRelationship>(); 
		for (AssociationRelationship r : new Filter<AssociationRelationship>(AssociationRelationship.class, getAllMembers(model))) {
			if ( ( ( (r.getDirection() != EnumDirection.BA) && (r.getA() == c) && (isMultiple(r.getMultiplicityB()))) 
					|| ( (r.getDirection() != EnumDirection.AB) && (r.getB() == c) && (isMultiple(r.getMultiplicityA()))) ) 
						/*&& ( ! isBidirectional(r) )*/ ) {
				result.add(r);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getBidirectionalNtoMAssociations(OOPClassifier c) {
		Model model = getModel(c);
		Collection<AssociationRelationship> result = new ArrayList<AssociationRelationship>(); 
		for (AssociationRelationship r : new Filter<AssociationRelationship>(AssociationRelationship.class, getAllMembers(model))) {
			if ( isBidirectionalNToM(r) && ((r.getA()==c) || (r.getB()==c)) ) {
				result.add(r);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAllOutgoingAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		result.addAll(getOutgoingSinglevalAssociations(c));
		result.addAll(getOutgoingMultivalAssociations(c));
		result.addAll(getBidirectionalNtoMAssociations(c));
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getInheritedOutgoingMultivalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		for (Classifier superc : getExtended(c)) {
			if (superc instanceof OOPClassifier) {
				result.addAll(getAllOutgoingMultivalAssociations((OOPClassifier)superc));
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAllOutgoingMultivalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		result.addAll(getInheritedOutgoingMultivalAssociations(c));
		result.addAll(getOutgoingMultivalAssociations(c));
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getIngoingMultivalAssociations(OOPClassifier c) {
		Model model = getModel(c);
		Collection<AssociationRelationship> result = new ArrayList<AssociationRelationship>(); 
		for (AssociationRelationship r : new Filter<AssociationRelationship>(AssociationRelationship.class, getAllMembers(model))) {
			if ( ( ((r.getA() == c) && (isMultiple(r.getMultiplicityA()))) || ((r.getB() == c) && (isMultiple(r.getMultiplicityB()))) ) && ( ! isBidirectionalNToM(r) ) ) {
				result.add(r);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getInheritedIngoingMultivalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		for (Classifier superc : getExtended(c)) {
			if (superc instanceof OOPClassifier) {
				result.addAll(getAllIngoingMultivalAssociations((OOPClassifier)superc));
			}
		}
		return result;
	}
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<AssociationRelationship> getAllIngoingMultivalAssociations(OOPClassifier c) {
		ArrayList<AssociationRelationship> result = new ArrayList<AssociationRelationship>();
		result.addAll(getInheritedIngoingMultivalAssociations(c));
		result.addAll(getIngoingMultivalAssociations(c));
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<ViewTransition> getIncomingFlows(ControllerMember cm) {
		Controller page = (Controller)cm.eContainer();
		Collection<ViewTransition> result = new ArrayList<ViewTransition>(); 
		for (ViewTransition t : page.getTransitionsView()) {
			if ( t.getTarget() == cm ) {
				result.add(t);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Attribute> getInheritedAttributes(Classifier c) {
		ArrayList<Attribute> result = new ArrayList<Attribute>();
		for (Classifier superc : getExtended(c)) {
			result.addAll(getAllAttributes(superc));
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Operation> getInheritedOperations(Classifier c) {
		ArrayList<Operation> result = new ArrayList<Operation>();
		for (Classifier superc : getExtended(c)) {
			result.addAll(getAllOperations(superc));
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Attribute> getAllAttributes(Classifier c) {
		ArrayList<Attribute> result = new ArrayList<Attribute>();
		result.addAll(getInheritedAttributes(c));
		result.addAll(c.getAttributes());
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<Operation> getAllOperations(Classifier c) {
		ArrayList<Operation> result = new ArrayList<Operation>();
		result.addAll(getInheritedOperations(c));
		result.addAll(c.getOperations());
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<ActionToViewTransition> getOutgoingTransitions(Action action) {
		ArrayList<ActionToViewTransition> result = new ArrayList<ActionToViewTransition>();
		Controller controller = (Controller)action.eContainer();
		for (ActionToViewTransition trans : controller.getTransitionsActionToView()) {
			if (trans.getSource() == action) {
				result.add(trans);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Collection<ViewTransition> getOutgoingFlows(ControllerMemberExecutable m) {
		ArrayList<ViewTransition> result = new ArrayList<ViewTransition>();
		Controller controller = (Controller)m.eContainer();
		for (ViewTransition trans : controller.getTransitionsView()) {
			if (trans.getSource() == m) {
				result.add(trans);
			}
		}
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	/*public static Collection<ModelMember> getPackageMembers(Package p) {
		Model model = (Model)p.eContainer();
		ArrayList<ModelMember> result = new ArrayList<ModelMember>();
		for (ModelMember m : getAllMembers(model)) {
			if (m.getOwnerPackage() == p) {
				result.add(m);
			}
		}
		return result;
	}*/
	
    /**
     * Used by common.ext.
     * @param r
     * @return
     */
	public static boolean isBidirectionalNToM(AssociationRelationship r) {
		boolean result = 
			isBidirectional(r) 
			&& isMultiple(r.getMultiplicityA()) 
			&& isMultiple(r.getMultiplicityB());
		return result;
	}
	
	public static boolean isBidirectional(AssociationRelationship r) {
		boolean result = (r.getDirection() == EnumDirection.BOTH); 
		return result;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static boolean definesOperation(Classifier c, String name) {
		for (Operation op : getAllOperations(c)) {
			if (op.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
    /**
     * Prepares a block of code to be output inside { } braces.
     * Removes braces if stored there.
     * Used by common.ext.
     * @param c
     * @return
     */
	public static String prepareCode(String code) {
		if (code == null) {
			return "// TODO";
		} else {
			code = code.trim();
			code = code.substring(code.startsWith("<?php\n{") ? 7 : ( code.startsWith("{") ? 1 : 0 ), code.endsWith("}") ? code.length()-1 : code.length() );
			code = code.trim();
			return code;
		}
	}
	
	public static String prepareCode(Operation op) {
		return prepareCode(op.getCode());
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static int countArrayDimensions(String type) {
		if (type.endsWith("[]")) {
			return 1 + countArrayDimensions(type.substring(0, type.length()-2)); 
		} else {
			return 0;
		}
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static boolean has(Collection c) {
		return ! c.isEmpty();
	}
	
    /**
     * Used by common.ext. ???
     * @param c
     * @return
     */
	public static String firstToLower(String s) {
		if (s == null) return null;
		int l = s.length();
		if (l == 0) return s;
		StringBuffer sb = new StringBuffer();
		sb.append(Character.toLowerCase(s.charAt(0)));
		if (l > 1) {
			sb.append(s.substring(1));
		}
		return sb.toString();
	}

	public static String firstToUpper(String s) {
		if (s == null) return null;
		int l = s.length();
		if (l == 0) return s;
		StringBuffer sb = new StringBuffer();
		sb.append(Character.toUpperCase(s.charAt(0)));
		if (l > 1) {
			sb.append(s.substring(1));
		}
		return sb.toString();
	}

    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static boolean contains(String s, String pattern) {
		if ((s == null)||(pattern == null)) return false;
		return s.indexOf(pattern) != -1;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static String removePluralS(String s) {
		if (s == null) return null;
		return ((s.length()>2) && s.endsWith("s")) ? s.substring(0, s.length()-1) : s;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static boolean isMultiple(EnumMultiplicity m) {
		boolean b = (m == EnumMultiplicity.ZERO_OR_MORE) || (m == EnumMultiplicity.ONE_OR_MORE);
		return b;
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static boolean isPersistent(AssociationRelationship r) {
		return ((r.getA() instanceof de.gulden.modeling.wave.Class) && (r.getDirection() != EnumDirection.BA) && (((de.gulden.modeling.wave.Class)r.getA()).isIsPersistent()))
		    || ((r.getB() instanceof de.gulden.modeling.wave.Class) && (r.getDirection() != EnumDirection.AB) && (((de.gulden.modeling.wave.Class)r.getB()).isIsPersistent()));
	}

    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static String relUrl(String s) {
		if ((s == null) || (s.trim().length()== 0)) return "";
		int pos = s.indexOf('.');
		if (pos != -1) {
			return "../" + relUrl( s.substring(pos+1) );
		} else {
			return "..";
		}
	}
	
    /**
     * Returns a code-fragment, not a constant string. Thus, constant strings
     * are returned quoted.
     * Used by common.ext.
     * @param m
     * @return
     */
	public static String labelCode(ModelMember m) {
		Label t = m.getLabel();
		if (t != null) {
			boolean iconAndText = (t.getMode() == EnumLabelMode.ICON_AND_TEXT);
			String icon = t.getIcon();
			if (is(icon)) {
				Model model = getModel(m);
				icon = (model.getBaseUrl() != null ? model.getBaseUrl() : "" ) + model.getIconPrefix() + icon;
			}
			return "Wave::msg(" + labelIndex(t) 
								+ ( (icon != null) ? (", '"+icon+"'") : ", null" ) 
								+ ( iconAndText ? (", true") : "" ) 
								+/*"+t.getText()+"*/")";
		} else {
			return "\""+firstToUpper(unCamelCase(guessName(m)))+"\"";
		}
	}
	
    /**
     * Returns a code-fragment, not a constant string. Thus, constant strings
     * are returned quoted.
     * Or null if no description is specified.
     * Used by common.ext.
     * @param m
     * @return
     */
	public static String descriptionCode(ModelMember m) {
		Label t = m.getDescription();
		if (t != null) {
			return "Wave::msg("+labelIndex(t)+")/*"+t.getText()+"*/";
		} else {
			return null;
		}
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static int labelIndex(Label t) {
		if (t == null) return 0;
		Dictionary d = (Dictionary)t.eContainer();
		List<Label> l = d.getLabel();
		int i = l.indexOf(t);
		return i;
		/*ArrayList<Text> l = textsByDictionaries.get(dt);
		if (l == null) { // lazy init
			l = new ArrayList<Text>();
			textsByDictionaries.put(dt, l);
		}
		int i = l.indexOf(t);
		if (i == -1) {
			i = l.size();
			l.add(t);
		}
		return i;*/
	}
	
    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static String guessName(Object o) {
		try {
			Method getter = o.getClass().getMethod("getName", new java.lang.Class[0]);
			return (String)getter.invoke(o, new java.lang.Object[0]);
		} catch (Throwable th) {
			//fallthrough
		}
		// fallback
		return o.getClass().getName()+"["+o.toString()+"]";
	}

    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static Object guessValue(Object o) {
		try {
			Method getter = o.getClass().getMethod("getValue", new java.lang.Class[0]);
			return getter.invoke(o, new java.lang.Object[0]);
		} catch (Throwable th) {
			//fallthrough
		}
		return null;
	}

    /**
     * Used by common.ext.
     * @param c
     * @return
     */
	public static List join(List a, List b) {
		List l = new ArrayList();
		if (a != null) {
			l.addAll(a);
		}
		if (b != null) {
			l.addAll(b);
		}
		return l;
	}
	
    /**
     * Used by common.ext.
     * @param l
     * @return
     */
	public static List<ModelMember> sort(List<ModelMember> l) {
		List<ModelMember> ll = new ArrayList<ModelMember>(l);
		Collections.sort(ll, new Comparator<ModelMember>(){
			public int compare(ModelMember a, ModelMember b) {
				
				int aPrio = getPriorityFromTaggedValue(a); // returns INTEGER_MIN if no tagged value found
				int bPrio = getPriorityFromTaggedValue(b);
				
				if (aPrio != bPrio) {
					return aPrio > bPrio ? 1 : -1;
				} else { // may both be Integer.MIN_VALUE
					return compareByPositionInContainmentFeature(a, b);
				}
			}
		});
		return ll;
	}
	
	protected static int getPriorityFromTaggedValue(ModelMember m) {
		String prioStr = getTaggedValue(m, "priority");
		if (prioStr != null) {
			try {
				int prio = Integer.parseInt(prioStr);
				return prio;
			} catch (NumberFormatException nfe) {
				//fallthrough
			}
		}
		return Integer.MIN_VALUE;
	}
	
	private static int compareByPositionInContainmentFeature(EObject a, EObject b) {			
		EObject aCont = a.eContainmentFeature();
		EObject bCont = b.eContainmentFeature();
		if (aCont == bCont) {
			int aIndex = aCont.eContents().indexOf(a);
			int bIndex = aCont.eContents().indexOf(b);
			if (aIndex > bIndex) {
				return -1; // index is reverse priority
			} else if (aIndex < bIndex) {
				return 1;
			} else {
				//assert false; // 2 elements from same list must have different indices
				//return 0;
				//fallthrough
			}
		}
		return aCont.toString().compareTo(bCont.toString()); // fallback
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static List<Object> listEnumConstants(String classname) {
		try {
			Class enumClass = Class.forName(classname);
			return Arrays.asList( enumClass.getEnumConstants() );
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return null;
		}
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static String getClassname(Object o) {
		return (o != null) ? o.getClass().getName() : null;
	}

    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static List<ActionToViewTransition> actionTransitions(Controller page, Action action) {
		ArrayList<ActionToViewTransition> l = new ArrayList<ActionToViewTransition>();
		// find Action "start"
		for (ActionToViewTransition t : page.getTransitionsActionToView()) {
			if (t.getSource() == action) {
				l.add(t);
			}
		}
		return l;
	}
	
    /**
     * Used by common.ext.
     * @param m
     * @return
     */
	public static View defaultView(Controller page) {
		// find Action "start"
		for (Action a : page.getActions()) {
			if (a.getName().equals("start")) { // TODO: constant
				// find 
				List<ActionToViewTransition> l = actionTransitions(page, a);
				if (!l.isEmpty()) {
					ActionToViewTransition t = l.get(0);
					return t.getTarget();
				}
			}
		}
		// use first available View as fallback
		if ( ! page.getViews().isEmpty()) {
			return page.getViews().get(0);
		} else {
			return null;
		}
	}
	
	public static String unCamelCase(String s) {
		if (s.length() > 1) {
			int i = 1;
			while (i < s.length() && ( ! Character.isUpperCase(s.charAt(i) ) ) ) {
				i++;
			}
			if (i < s.length()) {
				return s.substring(0, i) + " " + unCamelCase(s.substring(i));
			}
		}
		return s;
	}
	
	public static String untilFirstBlank(String s) {
		int pos = s.indexOf(' ');
		if (pos != -1) {
			s = s.substring(0, pos);
		}
		return s;
	}
	
	public static String camelCaseToDashSeperated(String s) {
		int len = s.length();
		int pos = 1;
		while (pos < len) {
			if (Character.isUpperCase(s.charAt(pos))) {
				String firstword = s.substring(0, pos).toLowerCase();
				String rest = camelCaseToDashSeperated(s.substring(pos)); // recursion
				return firstword+"-"+rest;
			}
			pos++;
		}
		return s.toLowerCase();
	}
	
	public static boolean hasView (Controller p, String name )
	{
		for (View v : p.getViews() ) {
			if (v.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public static Widget findWidget(de.gulden.modeling.wave.Class cls, Attribute attr, String formName) {
		//de.gulden.modeling.wave.Class cls = (de.gulden.modeling.wave.Class)attr.eContainer();
//log("a: "+((ClassImpl)attr.eContainer()).getName()+"."+attr.getName() + "("+formName+")" );								
//log("aaa: "+cls.getName()+"."+attr.getName() + "("+formName+")" );								
		if (cls.getForms() != null) {
			for (Form form : cls.getForms()) {
				if (form.getName().equalsIgnoreCase(formName)) {
					if (form.getWidgets() != null) {
						for (Widget widget : form.getWidgets()) {
							if (widget instanceof WidgetAttribute) {
//log("AAA: "+formName + " : " + ((WidgetAttribute)widget).getAttribute().getName() + " ... " + attr.getName() );								
								if (((WidgetAttribute)widget).getAttribute() == attr) {
									return widget;
								}
							}
						}
					}
				}
			}
		}
		return null;
		/*
		Widget w = null;
		for (Widget widget : attr.getWidgets()) {
			Collection<String> modes = commaSeperatedStringToList(widget.getDisplayMode());
			for (String m : modes) {
				if ( mode.equalsIgnoreCase(m) ) { // matching mode name
					w = widget;
					break;
				}
			}
		}
		if (w == null) { // not found
			for (Widget widget : attr.getWidgets()) {
				if ( !is(widget.getDisplayMode()) ) { // empty mode: user-specified default
					w = widget;
				}
			}
		}
		return w;
		*/
	}
	
	public static Widget findAssocWidget(AssociationRelationship assoc, de.gulden.modeling.wave.Class cls, String formName) {
		//de.gulden.modeling.wave.Class cls = assoc.;
		if (cls.getForms() != null) {
			for (Form form : cls.getForms()) {
				if (form.getName().equalsIgnoreCase(formName)) {
					if (form.getWidgets() != null) {
						for (Widget widget : form.getWidgets()) {
							if (widget instanceof WidgetAssociation) {
								if (((WidgetAssociation)widget).getAssociation() == assoc) {
									return widget;
								}
							}
						}
					}
				}
			}
		}
		return null;
		/*
		Widget w = null;
		for (Widget widget : assoc.getWidgets()) {
			Collection<String> modes = commaSeperatedStringToList(widget.getDisplayMode());
			for (String m : modes) {
				if ( mode.equalsIgnoreCase(m) ) { // matching mode name
					if ( ( (cls == assoc.getA()) && (widget.getSide() != EnumDirection.BA) )
				    || ( (cls == assoc.getB()) && (widget.getSide() != EnumDirection.AB) ) ) {
						w = widget;
						break;
					}
				}
			}
		}
		if (w == null) { // not found
			for (Widget widget : assoc.getWidgets()) {
				if ( !is(widget.getDisplayMode()) ) { // empty mode: user-specified default
					if ( ( (cls == assoc.getA()) && (widget.getSide() != EnumDirection.BA) )
						    || ( (cls == assoc.getB()) && (widget.getSide() != EnumDirection.AB) ) ) {
								w = widget;
								break;
							}
				}
			}
		}
		return w;
		*/
	}
	
	/*public static String signature(Operation op) {
		StringBuffer sb = new StringBuffer();
		sb.append(op.getName());
		sb.append('(');
		boolean first = true;
		for (Attribute param : op.getParameters()) {
			if (!first) {
				sb.append(',');
			} else {
				first = false;
			}
			sb.append(param.getType());
		}
		sb.append(')');
		sb.append('[');
		sb.append(op.getReturnType());
		sb.append(']');
		//return Integer.toHexString(sb.toString().hashCode());
		return sb.toString();
	}*/

	private static boolean workaroundMissingWriteTransactionHasBeenPrinted = false;
	
	public static void warnWorkaroundMissingWriteTransaction() {
		if (!workaroundMissingWriteTransactionHasBeenPrinted) {
			System.err.println("WORKAROUND: missing write transaction"); // TODO
			workaroundMissingWriteTransactionHasBeenPrinted = true;
		}
	}
	
	public static void roundtripCode(Operation op) {
		String code = prepareCode(op.getCode());
		//String code = op.getCode();
		Map<String, String> map = (Map<String, String>)GlobalVarExtensions.getGlobalVar("roundtrip");
		if (map != null) {
			String sig = buildSignatureID(op);
			String roundtrip = map.get(sig);
			if (roundtrip != null) {
				if (((code == null) || (! code.trim().equals(roundtrip.trim()))) && (!roundtrip.trim().equals("// TODO")) ) {
if (code != null) System.out.println("ROUNDTRIP "+sig+" : "+roundtrip); // TODO confirm dialog					
					//code = roundtrip;
					code = "<?php\n{\n\t"+roundtrip+"\n}\n";
// TODO - WRITE TRANSACTION
try {
	
						op.setCode(code);
						
} catch (IllegalStateException ise) {
// nop
warnWorkaroundMissingWriteTransaction();
}
				}
			}
		}
	}
	
	public static void roundtripInclude(Include inc, String filename) {
		String roundtrip = load(filename);
		if (roundtrip != null) {
			String code = inc.getCode();
//System.out.println("RT "+filename);					
			if ((code == null) || (! code.trim().equals(roundtrip.trim()))) {
if (code != null) System.out.println("ROUNDTRIP INCLUDE "+filename); // TODO confirm dialog					
//TODO - WRITE TRANSACTION
try {
	
					inc.setCode(roundtrip);
					
} catch (IllegalStateException ise) {
// nop
if (!workaroundMissingWriteTransactionHasBeenPrinted) {
System.err.println("WORKAROUND: missing write transaction"); // TODO
workaroundMissingWriteTransactionHasBeenPrinted = true;
}
}
			}
		}
	}
	
	public static void parseCodeBlocks(String filename) {
		String content = load(filename);
//System.out.println("RT "+filename+ " ... " + content);					
		if (content == null) {
			return;
		}
		Map<String, String> map = new HashMap<String, String>();
		final int len =  MAGIC_BEGIN.length();
		// look for "/*begin XYZ*/"
		int startpos = content.indexOf(MAGIC_BEGIN);
		while (startpos != -1) {
			// maybe a " XYZ*/" follows?
			int p = content.indexOf("*/", startpos + len+1);
			if (p != -1) {
				String sig = content.substring(startpos + len, p);
				// make sure no blanks, if ok assume it's a signature
				if ( ! containsWhitespace(sig) ) {
					// found begin, now find end
					int endpos = content.indexOf(MAGIC_END + sig + "*/", p+2);
					if (endpos != -1) {
						// FOUND, extract code in between
//System.out.println("roundtrip mark found: "+sig);							
						String code = content.substring(p+2, endpos);
						code = prepareCode(code); // normalize, remove { } around
						//code = code.trim() + '\n';
						map.put(sig, code);
					}
				}
			}
			startpos = content.indexOf(MAGIC_BEGIN, startpos + len);
		}
		GlobalVarExtensions.storeGlobalVar("roundtrip", map);
	}
	
	protected static String load(String filename) {
		try {
			FileReader f = new FileReader(filename);
			char[] buf = new char[10*1024];
			StringBuffer s = new StringBuffer();
			int hasread = f.read(buf);
			while (hasread != -1) {
				s.append(buf, 0, hasread);
				hasread = f.read(buf);
			}
			f.close();
			return s.toString();
		} catch (IOException ioe) {
			return null;
		}
	}
	
	protected static boolean containsWhitespace(String s) {
		for (char c : s.toCharArray()) {
			if (Character.isWhitespace(c)) {
				return true;
			}
		}
		return false;
	}
	
	protected static List<String> commaSeperatedStringToList(String s) {
		ArrayList<String> r = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(s, ",", false);
		while (st.hasMoreTokens()) {
			r.add(st.nextToken().trim());
		}
		return r;
	}
	
	protected static boolean is(Object o) {
		return ((o != null) && (o.toString().trim().length()>0));
	}
	
	public static void log(String s) /*throws IOException*/ {
		//FileWriter f = new FileWriter("d:/tmp/log.txt", true);
		//f.write(s);
		//f.write("\n");
		//f.close();
		System.out.println(s);
	}

	public static boolean fileExists(String filename) {
		File f = new File(filename);
		boolean b = f.exists();
		return b;
	}
	
	public static void updateFace(AssociationRelationshipEditPart p, AssociationRelationshipFigureBase f) {
		Object e = ((Edge)p.getModel()).getElement();
		AssociationRelationship assoc = (AssociationRelationship) e;
		f.getSourceDecoration().setVisible(
				assoc.getDirection() == EnumDirection.BA);
		f.getTargetDecoration().setVisible(
				assoc.getDirection() == EnumDirection.AB);
	}

	public static void updateNameLabel(Class2EditPart p) {
		Object n = ((Node) p.getModel()).getElement();
		de.gulden.modeling.wave.Class cl = (de.gulden.modeling.wave.Class) n;
		WrappingLabel nameFigure = p.getPrimaryShape()
				.getFigureClassNameFigure();
		if (nameFigure != null) {
			Font font = nameFigure.getFont();
			FontData[] fds = font.getFontData();
			for (FontData fd : fds) {
				fd.setStyle(cl.isIsAbstract() ? SWT.ITALIC : SWT.NONE);
			}
			Font newFont = new Font(font.getDevice(), fds);
			nameFigure.setFont(newFont);
		}
	}

	public static String getAttributeLabel(Attribute attr) {
		Object parent = attr.eContainer();
		String name = null;
		if (parent instanceof Classifier) {
			name = ((Classifier)parent).getName();
		} else if (parent instanceof ClassifierMember) {
			name = ((ClassifierMember)parent).getName();
		}
		return ( name != null ? name + "." : "" ) + attr.getName();
	}
	
	public static Collection flip(Collection c) {
		ArrayList l = new ArrayList();
		for (Object o : c) {
			l.add(0, o);
		}
		return l;
	}

}