package org.tzi.use.gui.views.selection;

import java.util.Comparator;

import org.tzi.use.gui.views.diagrams.AssociationName;
import org.tzi.use.gui.views.diagrams.classdiagram.ClassNode;
import org.tzi.use.gui.views.diagrams.objectdiagram.ObjectNode;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.sys.MObject;

/** 
 * SelectionComparator serves sorting different object
 *
 * @author   Jun Zhang 
 * @author   Jie Xu
 */

public class SelectionComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		if(o1 instanceof MObject){
			return ((MObject)o1).name().compareTo(((MObject)o2).name());
		}
		if(o1 instanceof MClass){
			return ((MClass)o1).name().compareTo(((MClass)o2).name());
		}
		else if(o1 instanceof ClassNode){
			return ((ClassNode)o1).name().compareTo(((ClassNode)o2).name());
		}
		else if(o1 instanceof AssociationName){
			return ((AssociationName)o1).name().compareTo(((AssociationName)o2).name());
		}
		else
			return ((ObjectNode)o1).name().compareTo(((ObjectNode)o2).name());
	}
}
	