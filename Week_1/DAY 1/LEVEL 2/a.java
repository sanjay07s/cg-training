import java.util.Scanner; 
public class a
{ 
  public static void main(String[] args) { 
   Scanner s = new Scanner(System.in); 
   int a = s.nextInt(); 
   int b = s.nextInt(); 
   int qou = a/b; 
   int rem = a%b; 
   System.out.println("The Quotient is " + qou + " and Remainder is 
   "+rem); 
  } 
} 