public class g{ 
 public static void main(String arg[]){ 
  int rKm = 6378; 
  double rMi = 6378/1.6; 
  double volKm = (4/3)*3.14*Math.pow(rKm, 3); 
  double volMi = (4/3)*3.14*Math.pow(rMi, 3); 
  System.out.println("The volume of earth in cubic kilometers is 
  "+ volKm + " and cubic miles is " + volMi); 
 } 
}