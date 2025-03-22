import java.util.Scanner; 
public class j{ 
 public static void main(String arg[]){ 
  Scanner scanner = new Scanner(System.in); 
  int height = scanner.nextInt(); 
  double inch = height/2.54; 
  double feet = inch/12; 
  System.out.println("Your Height in cm is " + height + " while 
in feet is " + feet + "and inches is " + inch); 
 } 
} 