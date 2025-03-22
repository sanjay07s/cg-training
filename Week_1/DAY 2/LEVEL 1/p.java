import java.util.Scanner; 
public class p{ 
	public static void main (String arg[]){ 
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt(); 
		for(int i = 1; i<=n; i++){ 
			if (i%2 == 0){ 
				System.out.println(i + "its even"); 
			} 
		else{ 
        System.out.println(i + "its odd"); 
		} 
	} 
   }
}