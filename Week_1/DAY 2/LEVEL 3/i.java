import java.util.Scanner; 
public class i { 
	public static void main(String[] args) { 
      Scanner s = new Scanner(System.in); 
	  int num = s.nextInt(); 
      int sum = 0; 
	  int i = 1; 
      while(i<num){ 
         if(num%i==0){ 
            sum = sum+i; 
        }i++; 
    } 
    if (sum>num){ 
        System.out.println("its a abundant number"); 
      } 
   } 
}