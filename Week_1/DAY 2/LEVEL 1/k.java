import java.util.Scanner; 
public class k{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		double total = 0; 
		while (true){ 
            double num = s.nextInt(); 
			if (num == 0){ 
				break; 
			} 
			else{ 
				total = num+total; 
				} 
			System.out.println("The total is" + total); 
		} 
	} 
} 