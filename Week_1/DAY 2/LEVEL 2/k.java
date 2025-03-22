import java.util.Scanner; 
public class k { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		if (n>0 && n<100){ 
			for(int i = n; i>1; i--){ 
				if (n%i == 0){ 
					System.out.println(i); 
				} 
			} 
		} 
	} 
}