import java.util.Scanner; 
public class d { 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		if (n>0){ 
			for(int i = 1; i<=n; i++){ 
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
			}
		}
	}
}