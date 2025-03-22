import java.util.Scanner; 
public class c { 
public static void main (String arg[]){ 	
	Scanner s = new Scanner(System.in); 
	int numOne = s.nextInt(); 
	int numTwo = s.nextInt(); 
	int numThree = s.nextInt(); 
	if (numOne>numTwo && numOne>numThree){ 
		System.out.println("First if the largest"); 
	} 
	else if (numTwo>numOne && numTwo>numThree){ 
		System.out.println("Second is the largest"); 
	} 
	else{ 
		System.out.println(" third is the largest "); 
		} 
	} 
} 