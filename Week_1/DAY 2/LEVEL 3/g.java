import java.util.Scanner; 
public class g { 
	public static void main(String[] args) { 
    Scanner s = new Scanner(System.in); 
	double weight = s.nextDouble(); 
	double eight = s.nextDouble(); 
	double height = eight/100; 
	double BMI = weight/(height*height); 
	if (BMI<=18.4){ 
		System.out.println("underweight"); 
	} 
	else if (BMI>18.5 && BMI<24.9){ 
		System.out.println("normal"); 
	} 
	else{ 
		System.out.println("not normal"); } 
    } 
}