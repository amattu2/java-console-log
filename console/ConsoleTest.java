package console;

import java.util.ArrayList;

// Imports
import org.junit.jupiter.api.Test;

class ConsoleTest {
	@Test
	void testStringArray() {
		// Variables
		String[] array = new String[10];
		
		// Add Values
		array[0] = "string 1";
		array[1] = "string 2";
		array[3] = "string 4";
		array[6] = "string 7";
		array[9] = "string 10";
		
		// Test output
		Console.log(array);
	}

	@Test
	void testDoubleArray() {
		// Variables
		double[] array = new double[10];
		
		// Add Values
		array[0] = 1;
		array[1] = 2.2;
		array[3] = 3.03;
		array[6] = 4.004;
		array[9] = 5.0005;
		
		// Test output
		Console.log(array);		
	}
	
	@Test
	void testIntegerArray() {
		// Variables
		int[] array = new int[10];
		
		// Add Values
		array[0] = 1;
		array[1] = 2;
		array[3] = 3;
		array[6] = 4;
		array[9] = 5;
		
		// Test output
		Console.log(array);		
	}
	
	@Test
	void testStringArrayList() {
		// Variables
		ArrayList<String> array = new ArrayList<String>();
		
		// Add Values
		array.add("Hey");
		array.add("Bye");
		array.add("Hello again");
		array.add("Bye again");
		array.add("Ok final message.. Bye");
		
		// Test output
		Console.log(array);
	}
}
