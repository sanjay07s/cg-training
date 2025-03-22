import java.util.Scanner; 
public class o{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int f = 1; 
		for(int i = 1;i<=n;i++){ 
			f = f*i; 
		} 
		System.out.println(f); 
	} 
} 