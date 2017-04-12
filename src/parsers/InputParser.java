package parsers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import data.Instance;

/**
 * This class implements a parser that parses an input file and returns a set of
 * Instances for use in the Perceptron algorithm.
 * @author Christopher Collins
 */
public class InputParser {
	
	/**
	 * Parses the specified input file into an ArrayList of Instances.
	 * @param inputFile The filename of the input file to parse
	 * @param numAttributes The number of attributes that each Instance has.
	 * @return An ArrayList of the parsed Instances.
	 */
	public static ArrayList<Instance> parse(String inputFile, int numAttributes){
		
		ArrayList<Instance> instances = new ArrayList<>();
		
		try {
			File file = new File(inputFile);
			Scanner scanner = new Scanner(file);
			
			//For each line
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				String[] split = line.split(" ");
				
				if(split.length == numAttributes + 1){
					int colNum = 0;
					
					//Get attributes
					Vector<Integer> attributes = new Vector<Integer>(numAttributes);
					attributes.add(1);
					for(int i = 0; i < numAttributes; i++){
						attributes.add(Integer.parseInt(split[colNum++]));
					}
					
					//Get class
					int iClass = Integer.parseInt(split[colNum++]);
					
					//Create instance
					instances.add(new Instance(attributes, iClass));
					
				} else {
					System.err.println("Illegal number of attributes: " + split.length);
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println("InputFile not found: " + inputFile);
		}
		
		return instances;
	}
}
