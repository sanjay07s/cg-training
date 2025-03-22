import java.util.Scanner; 
public class l{ 
 public static void main(String arg[]){ 
  Scanner scanner = new Scanner(System.in); 
  int base = scanner.nextInt(); 
  int height = scanner.nextInt(); 
  double area = (1.0/2)*base*height; 
  double iArea = area/2.54; 
  double fArea = iArea/12; 
  System.out.println("Your height in cm is " + area + "while in 
  feet is" + fArea+ " and inches is " + iArea); 
 } 
}