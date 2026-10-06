package Daywise_Assignments.Day2;

// Demonstrate pre-increment and post-increment and explain the output.
public class Pre_increment_Post_increment {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		
		System.out.println("Pre_Increment Example: "+(++num1)); 
		// In Pre-Increment, the value will get increment and then used/printed, so in the above code, the output will be 3
		System.out.println("Post_Increment Example: "+(num2++)); 
		// In Post-Increment, the value will be used/printed then it will get incremented, in the above code the output will be still 3. 
		System.out.println("After Post_Increment Example: "+num2); 
		// After Post-Increment, the output will be still 4.
	}

}
