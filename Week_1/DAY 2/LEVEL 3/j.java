import java.util.Scanner; 
public class j { 
	public static void main(String[] args) { 
       Scanner s = new Scanner(System.in); 
       double first, second; 
       string op; 
       int number; 
	   System.out.print("Enter the first number: "); 
       first = s.nextDouble(); 
       System.out.print("Enter the second number: "); 
       second = s.nextDouble(); 
       System.out.print("Enter the operator (+, -, *, /): "); 
       op = s.next(); 
       System.out.print("Enter the number of times to repeat the 
       operation: "); 
       number = s.nextInt(); 
	   for (int i = 1; i < number; i++) { 
             switch (op) { 
                case "+": 
                    System.out.println("Result of " + i + ": " + (first + 
                    second)); 
                    break; 
                case "-": 
                    System.out.println("Result of " + i + ": " + (first - 
                    second)); 
                    break; 
                case "*": 
                    System.out.println("Result of " + i + ": " + (first * 
                    second)); 
                    break; 
                case "/": 
                    if (second != 0) { 
                        System.out.println("Result of " + i + ": " + (first 
                    / second)); 
                    } else { 
                        System.out.println("Cannot divide by zero!"); 
                    } 
                    break; 
                default: 
                    System.out.println("Invalid Operator"); 
                    return;  
            } 
        } 