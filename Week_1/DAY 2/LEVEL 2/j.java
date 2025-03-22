import java.util.Scanner; 
public class j { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		int grFa = 1; 
		int i = n-1 
		while(i>=1){ 
			if (n%i == 0){ 
				grFa = i; 
				break; 
			} 
			i-- 
		} 
		System.out.println(grFa);
	}
}