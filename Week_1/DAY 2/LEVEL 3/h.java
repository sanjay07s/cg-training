import java.util.Scanner; 
public class h { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int num = s.nextInt(); 
		int sum = 0; 
		while(num!=0){ 
			int digit = num%10; 
			sum = sum+digit; 
			num = num/10; 
			} 
			if (num%sum==0){ 
				System.out.println("its a harshad number"); 
			} 
		} 
}