import java.util.Scanner; 
public class m{ 
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
	for (int i=1;i<=n;i++) { 
		total = i+total; 
	} 
	System.out.println(total); 