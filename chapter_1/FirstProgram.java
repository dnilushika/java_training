import java.util.Arrays;

class FirstProgram {
	public static void main(String[] hoppers){
		System.out.println("Hello World");
		if(hoppers.length > 0){
			int arrayLenght = hoppers.length;
			System.out.println("Array lenght : " + arrayLenght);
			System.out.println(Arrays.toString(hoppers));
		}
		
	}
}


/**

-- Classes
	* Classes have thier own properties for thier unique representation
	* We can identify them as its attribute and its behaviours.
	* Technically we call them fields(variables) and methods

-- Main Method
	* void -  No return type 
	* static - this method should be vailable in the memopry to call by JVM before it is being called.
	* public - this method should be visible to JVMto call it.
	* String[] args - list of string argumnets which can be passed to the main method when its being called. this arguments can be accessed 
  	  with args array
		
  */

