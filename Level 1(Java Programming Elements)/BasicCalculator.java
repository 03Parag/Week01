import java.util.Scanner;
// Create BasicCalculator class to calculate the arithmetic operations  
public class BasicCalculator {
    public static void main(String[] args) {
        // Enter the value for variable in number1 and number2
        double number1 , number2;
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Enter two numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        // Display results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " +  addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        // Close the scanner object
        input.close();
    }
}
