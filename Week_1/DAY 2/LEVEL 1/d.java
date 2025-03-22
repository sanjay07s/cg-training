import java.util.Scanner; 
public class d {  
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		if (n>0){ 
			System.out.println(n*(n+1)/2); 
		} 
	} 
}