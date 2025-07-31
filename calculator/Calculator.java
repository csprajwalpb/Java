package calculator;
import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Choose an operation: +, -, *, /, %");
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));   
                break;
            case '*':
                System.out.println("Result: " + (a * b));   
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            case '%':
                System.out.println("Result: " + (a % b));
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, /, or %.");
        }
        sc.close();
    }
}