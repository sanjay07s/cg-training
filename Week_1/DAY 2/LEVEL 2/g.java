import java.util.Scanner; 
public class g{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		if (n>0){ 
			for(int i = 1; i<=n; i++){ 
				if (n%i == 0){ 
					System.out.println(i); 
				} 
			} 
		} 
	} 
}