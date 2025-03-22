import java.util.Scanner; 
public class i{ 
 public static void main(String arg[]){ 
  Scanner scanner = new Scanner(System.in); 
  int studentFee = scanner.nextInt(); 
  int dis = scanner.nextInt(); 
  double disAmt = studentFee*dis/100; 
  double disPrc = studentFee - disAmt; 
  System.out.println("The discount amount is INR " + disAmt + " 
and the final discounted fee in INR is " + disPrc); 
 } 
}