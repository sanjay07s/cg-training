import java.util.Scanner; 
public class r{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		for (int i = 6; i<= 9; i++){ 
			int table = n * i;  
			System.out.println(n + " * " + i + " = " + table); 
		} 
	} 
}