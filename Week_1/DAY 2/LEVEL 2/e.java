import java.util.Scanner; 
public class e{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int i = 1; 
		int n = s.nextInt(); 
		if (n>0){ 
			while(i<=n){ 
				if (i%3 == 0 && i%5 == 0){ 
					System.out.println("Fizzbuzz"); 
				} 
				else if ( i%3 == 0){ 
					System.out.println("Fizz"); 
				} 
				else if (i%5==0){ 
					System.out.println("buzz"); 
				} 
				else{ 
					System.out.println(i); 
				} 
				i++; 
			} 
		} 
	} 
}