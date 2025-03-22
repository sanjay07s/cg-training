import java.util.Scanner; 
public class l{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		double num = s.nextDouble(); 
		if (num>=0){ 
			num = num*(num+1)/2; 
			System.out.println(num); 
		} 
		System.out.print("Enter a number n: "); 
		int n = s.nextInt(); 
		int total = 0;  
		int i = 1;   
		while (i <= n) { 
			total += i;  
			i++;   
		} 
		System.out.println("The sum of the first " + n + " natural numbers 
		is: " + total); 
}