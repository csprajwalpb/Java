import java.util.*;
public class Average {

    public static float average(float a, float b, float c){
        float sum = a+b+c;
        System.out.println("Sum of " + a + " " + b + " " + c + " = " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");  
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        average(a, b, c);
    }
}
