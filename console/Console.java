/*
 * Produced 2019
 * By https://github.com/amattu2
 * Copy Alec M.
 * License GNU Affero General Public License v3.0
 */

package console;

// Imports
import java.util.ArrayList;

// Console Class
public class Console {
	/*
	 * Stringify a array of strings
	 * @param String[]
	 */
	public static void log(String[] array) {
		// Variables
		String string = "";
		
		// Loops
		for (int i = 0; i < array.length; i++) {
			string += array[i] + " ";
		}
		
		// Output
		Console.output(string.trim());			
	}
	
	/*
	 * Stringify a array of doubles
	 * @param double[]
	 */	
	public static void log(double[] array) {
		// Variables
		String string = "";
		
		// Loops
		for (int i = 0; i < array.length; i++) {
			string += array[i] + " ";
		}
		
		// Output
		Console.output(string.trim());			
	}
	
	/*
	 * Stringify a array of integers
	 * @param int[]
	 */
	public static void log(int[] array) {
		// Variables
		String string = "";
		
		// Loops
		for (int i = 0; i < array.length; i++) {
			string += array[i] + " ";
		}
		
		// Output
		Console.output(string.trim());		
	}
	
	/*
	 * Stringify a arraylist of strings
	 * @param ArrayList<String>
	 */
	public static void log(ArrayList<String> array) {
		// Variables
		String string = "";
		
		// Loops
		for (int i = 0; i < array.size(); i++) {
			string += array.get(i) + " ";
		}
		
		// Output
		Console.output(string.trim());
	}
	
	/*
	 * Stringify a string variable
	 * @param String
	 */
	public static void log(String string) {
		Console.output(string.trim());
	}
	
	/*
	 * Stringify a double variable
	 * @param Double
	 */
	public static void log(double d) {
		Console.output(Double.toString(d));
	}
	
	/*
	 * Stringify a integer variable
	 * @param Integer
	 */
	public static void log(int i) {
		Console.output(Integer.toString(i));
	}
		
	/*
	 * Output a string
	 * @param String
	 */
	private static void output(String string) {
		System.out.println(string);
	}

}
