package modules;

import java.util.ArrayList;

import data.Instance;
import parsers.InputParser;

/**
 *
 * This class tests the Perceptron class using the desired input file and number
 * of attributes. The program expects the first parameter must be the input file
 * name and the second parameter to be the number of parameters in integers.
 * @author Christopher Collins
 */
public class PerceptronTester {
	
	public static void main(String[] args) {
		//Check arguments
		if(args.length == 2){
			//Initialize
			String inputFile = args[0];
			int numAttributes = Integer.parseInt(args[1]);
			ArrayList<Instance> instances = InputParser.parse(inputFile, numAttributes);
			Perceptron p = new Perceptron(instances, numAttributes);
			
			//Run perceptron
			p.run();
		} else {
			System.err.println("Invalid parameters");
			System.err.println("Usage: java -jar Perceptron.jar filename numAttributes");
		}
	}

}
