import java.util.Scanner; 
public class d { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		boolean isPrime = true; 
		for(int i = 2; i<=n; i++){ 
			if (n%i==0){ 
				isPrime = false; 
				break; 
			} 
		} 
		if (isPrime){ 
				System.out.println("its a prime number"); } 
            else{ 
				System.out.println("its not a prime number"); }
	}
}