import java.util.Scanner; 
public class g{ 
 public static void main (String arg[]){ 
  Scanner s = new Scanner(System.in); 
  int month = s.nextInt(); 
  int day = s.nextInt(); 
 if ((month >= 3 && month <= 6) || (month == 6 && day <=20) ||  (month 
== 3 && day >=20)){ 
   
   System.out.println("It is spring season"); 
  } 
  else{ 
 
   System.out.println("it's not"); 
  } 
 } 
}