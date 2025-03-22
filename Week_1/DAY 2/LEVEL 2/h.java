import java.util.Scanner; 
public class h { 
 public static void main (String arg[]){ 
  Scanner s = new Scanner(System.in); 
  int n = s.nextInt(); 
  int i = 1; 
  if (n>0){ 
   while(i<=n){ 
    if (n%i == 0){ 
     System.out.println(i); 
    } 
    i++; 
   } 
  } 
 } 
}