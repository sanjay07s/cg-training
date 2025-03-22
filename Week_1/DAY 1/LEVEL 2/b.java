import java.util.Scanner; 
public class b
{ 	
	public static void main(String[] args) { 
	   Scanner s = new Scanner(System.in); 
       int a = s.nextInt(); 
	   int b = s.nextInt(); 
       int c = s.nextInt(); 
       double resOne = a+b*c; 
       double resTwo = a*b+c; 
       double resThre = c+a/b; 
       double resFo = a%b+c; 
       System.out.println(resONe+resTwo+resThree+resFo); 
  } 
}