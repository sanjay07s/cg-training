import java.util.Scanner; 
public class i { 
 public static void main(String[] args) { 
  Scanner s = new Scanner(System.in); 
  int n = s.nextInt(); 
  int grFa = 1; 
  for( int i = n-1; i>=1 ;i--){ 
	if (n%i == 0){ 
	grFa = i; 
	break; 
	} 
	} 
	System.out.println(grFa);
 }
}