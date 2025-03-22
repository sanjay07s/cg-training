import java.util.Scanner; 
public class n { 
	public static void main(String[] args) { 
	Scanner s = new Scanner(System.in); 
	int a = s.nextInt(); 
	int b = s.nextInt(); 
	int result = 1; 
	int i=1; 
	while(i<=b){ 
		result = result*a; 
	    System.out.println(result); 
		i++ 
		} 
		System.out.println(result); 
	}
	
}