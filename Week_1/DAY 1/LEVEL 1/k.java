import java.util.Scanner; 
public class k{ 
 public static void main(String arg[]){ 
  Scanner scanner = new Scanner(System.in); 
  int a = scanner.nextInt(); 
  int b = scanner.nextInt(); 
  float sum = a+b; 
  float sub = a-b; 
  float mul = a*b; 
  float div = a/b; 
  System.out.println("The addition, subtraction, multiplication 
  and division value of 2 numbers "+a+ " and " + b + "is" + sum + sub + mul 
  +" and " + div); 
 } 
}