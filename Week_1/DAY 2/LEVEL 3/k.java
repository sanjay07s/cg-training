import java.util.Scanner; 
public class k { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int m = s.nextInt(); 
		int d = s.nextInt(); 
		int y = s.nextInt(); 
		int a = y-(14-m)/12; 
		int x = a + (a/4) - (a/100)+(a/400); 
		int b = m+12*((14-m)/12)-2; 
		int c = (d+x+31*a/12)%7; 
		System.out.println(c); 
	} 
}