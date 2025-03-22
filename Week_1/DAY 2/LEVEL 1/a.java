import java.util.Scanner; 
public class a{ 
 public static void main (String arg[]){ 
  Scanner s = new Scanner(System.in); 
  int num = s.nextInt(); 
  if (num%5 == 0){ 
   System.out.println("yes"); 
  } 
  else{ 
   System.out.println("no"); 
  } 
 } 
}