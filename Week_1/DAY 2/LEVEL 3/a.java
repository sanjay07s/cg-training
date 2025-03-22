import java.util.Scanner; 
public class a
{ 
 public static void main(String[] args) 
 { 
  Scanner s = new Scanner(System.in); 
  int year = s.nextInt(); 
  if (year>=1582){ 
   if (year%4==0){ 
    System.out.println("its a leap year"); 
   } 
   else{ 
    System.out.println("its not a leap year"); 
   } 
  } 
  else{ 
   System.out.println("not applicable"); 
  } 
 } 
} 