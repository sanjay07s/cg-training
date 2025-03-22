import java.util.Scanner; 
public class p{ 
  public static void main(String arg[]){ 
    Scanner scanner = new Scanner(System.in); 
    int n = scanner.nextInt(); 
    double maxNum = (n*(n-1))/2; 
    System.out.println("the number of possible handshakes is " + 
    maxNum); 
  } 
}