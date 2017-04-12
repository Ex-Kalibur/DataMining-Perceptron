package data;

import java.util.Vector;

/**
 * This class implements an Instance within a dataset for use within
 * the Perceptron algorithm. The instance includes the set of attributes
 * as Integers, and the class as an Integer.
 * @author Christopher Collins
 */
public class Instance {
	Vector<Integer> attributes;
	int iClass;
	
	/**
	 * Constructs an Instance with the specified Vector of attributes and
	 * class.
	 * @param attributes The list of attribute values as Integers.
	 * @param iClass The class of the Instance. The class must be either 1
	 * or -1.
	 */
	public Instance(Vector<Integer> attributes, int iClass) {
		this.attributes = attributes;
		this.iClass = iClass;
	}

	/**
	 * Gets a Vector of the Instance's attributes.
	 * @return A Vector containing the Instance's attributes.
	 */
	public Vector<Integer> getAttributes() {
		return attributes;
	}

	/**
	 * Gets the class of the Instance.
	 * @return The class of the Instance. The class is either 1 or -1.
	 */
	public int getiClass() {
		return iClass;
	}

	@Override
	public String toString() {
		return "Instance [attributes=" + attributes + ", iClass=" + iClass + "]";
	}
}
