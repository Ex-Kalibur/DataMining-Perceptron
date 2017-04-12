package utils;

import java.util.Vector;

/**
 * This class includes several functions for operations on Vectors.
 * @author Christopher Collins
 */
public class Utils {

	/**
	 * Get the dot product of two vectors.
	 * @param v1 The first Vector.
	 * @param v2 The second Vector.
	 * @return The dot product of the two vectors.
	 */
	public static int getDotProduct(Vector<Integer> v1, Vector<Integer> v2){
		int acc = 0;
		
		for(int i = 0; i < v1.size(); i++){
			acc += v1.get(i) * v2.get(i);
		}
		
		return acc;
	}
	
	/**
	 * Get the sum of the two Vectors.
	 * @param v1 The first Vector.
	 * @param v2 The second Vector.
	 * @return The sum of the two Vectors.
	 */
	public static Vector<Integer> addVectors(Vector<Integer> v1, Vector<Integer> v2){
		Vector<Integer> v3 = new Vector<>();
		for(int i = 0; i < v1.size(); i++){
			v3.add(v1.get(i) + v2.get(i));
		}
		
		return v3;
	}
	
	/**
	 * Get the difference between the two Vectors.
	 * @param v1 The first Vector.
	 * @param v2 The second Vector.
	 * @return The difference between the two Vectors.
	 */
	public static Vector<Integer> subtractVectors(Vector<Integer> v1, Vector<Integer> v2){
		Vector<Integer> v3 = new Vector<>();
		for(int i = 0; i < v1.size(); i++){
			v3.add(v1.get(i) - v2.get(i));
		}
		
		return v3;
	}
}
