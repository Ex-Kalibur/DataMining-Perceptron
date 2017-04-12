package modules;

import java.util.ArrayList;
import java.util.Vector;

import data.Instance;
import utils.Utils;

/**
 * This class implements the Perceptron learning algorithm to learn the separating
 * hyperplane of the given instances.
 * @author Christopher Collins
 */
public class Perceptron {
	public static final int MAX_ITERATIONS = 1000;
	
	private ArrayList<Instance> instances;
	private int numAttributes;
	
	/**
	 * Constructs the Perceptron using the specified set of instances to train on.
	 * @param instances An ArrayList of Instances used to train the perceptron on.
	 * @param numAttributes The number of attributes present in each Instance.
	 */
	public Perceptron(ArrayList<Instance> instances, int numAttributes){
		this.instances = instances;
		this.numAttributes = numAttributes;
	}
	
	/**
	 * Runs the Perceptron. At each iteration, the program will print the current
	 * weight vector to stdout.
	 */
	public void run(){
		//Init
		int iterations = 0;
		int numCorrect = 0;
		Vector<Integer> weightVector = new Vector<>();
		for(int i = 0; i < numAttributes + 1; i++){
			weightVector.add(0);
		}
		
		//Repeat while some instances are incorrectly classified
		while(iterations < MAX_ITERATIONS && numCorrect != instances.size()){
			
			System.out.println(weightVector);
			Instance instance = instances.get(iterations % instances.size());
			
			//Calculate i (dot) w
			int dotProduct = Utils.getDotProduct(instance.getAttributes(), weightVector);
			
			//Predict class
			int pClass = 0;
			if(dotProduct > 0) pClass = 1;
			else pClass = -1;
			
			//Update weight vector
			if(pClass == instance.getiClass()){
				numCorrect++;
			} else if(instance.getiClass() > 0){
				numCorrect = 0;
				weightVector = Utils.addVectors(weightVector, instance.getAttributes());
			} else {
				numCorrect = 0;
				weightVector = Utils.subtractVectors(weightVector, instance.getAttributes());
			}
			
			iterations++;
		}
		
		System.out.println("DONE");
	}
}
