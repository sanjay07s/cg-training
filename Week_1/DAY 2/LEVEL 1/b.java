import java.util.Scanner; 
public class b{ 
 public static void main (String arg[]){ 
  Scanner s = new Scanner(System.in); 
  int numOne = s.nextInt(); 
  int numTwo = s.nextInt(); 
  int numThree = s.nextInt(); 
  if (numOne<numTwo && numOne<numThree){ 
   System.out.println("yes"); 
  } 
  else{ 
   System.out.println("no"); 
  } 
 }