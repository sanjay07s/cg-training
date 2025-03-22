public class f{ 
 public static void main(String args[]){ 
  int fee = 125000; 
  int discount = 10; 
  int disPrc = 125000*10/100; 
  int disAmt = fee - disPrc; 
  System.out.println("The discouont amount is INR " + disPrc + " 
  and final discounted fee is INR " + disAmt); 
 } 
}