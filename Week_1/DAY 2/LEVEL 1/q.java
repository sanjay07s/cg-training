import java.util.Scanner; 
public class q { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		double sal = sc.nextDouble(); 
		int yos = sc.nextInt(); 
		double bon = 0.05; 
		double bonA = bon*sal; 
		if(yos>=5) 
		System.out.println("Bonus amount is " + bonA); 
		else  
		System.out.println("No Bonus"); 
	} 
} 