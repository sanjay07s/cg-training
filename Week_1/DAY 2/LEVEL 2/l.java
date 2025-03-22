import java.util.Scanner; 
public class l { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int a = s.nextInt(); 
		int b = s.nextInt(); 
		int result = 1; 
		for(int i=1; i<=b; i++){ 
			result = result*a; 
		    System.out.println(result); 
		} 
		System.out.println(result); 
	} 
}