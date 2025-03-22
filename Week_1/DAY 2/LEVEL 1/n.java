import java.util.Scanner; 
public class n{ 
	public static void main (String arg[]){  		
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int factorial = 1; 
		while(n>=1){ 
			factorial = factorial*n; 
			n--; 
		} 
		System.out.println(factorial);
	}
}