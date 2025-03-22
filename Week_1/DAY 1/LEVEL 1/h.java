import java.util.Scanner; 
public class h{ 
 public static void main(String arg[]){ 
  Scanner scanner = new Scanner(System.in); 
  double km = scanner.nextDouble(); 
  double miles = km/1.6; 
  System.out.println("The total miles is " + miles + "for the 
  given" + km); 
 } 
}