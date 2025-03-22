import java.util.Scanner; 
public class f { 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		int num = s.nextInt(); 
		int count = 0; 
		while(num!=0){ 
			count = count+1; 
			num = num/10; 
		} 
		System.out.println(count); 
	} 
}