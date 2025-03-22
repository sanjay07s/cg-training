import java.util.Scanner; 
public class e{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int age = s.nextInt(); 
		if (age >=18){ 
			System.out.println("The person's age is " + age + " and 
			can vote"); 
		} 
		else{ 
			System.out.println("The person's age is " + age + " and 
			cannot vote"); 
		} 
	} 
}