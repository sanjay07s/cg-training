import java.util.Scanner; 
public class e  { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int num = s.nextInt(); 
		int sum = 0; 
		int orgNum = num;  
		while(num!=0){ 
			int digit = num%10; 
			int cube = (int)Math.pow(digit,3); 
			sum = sum+cube; 
			num = num/10; } 
		if (orgNum == sum){ 
			System.out.println("its a armstrong number"); 
		} 
	} 
}