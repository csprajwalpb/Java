import java.util.*;
public class Power {

    public static double power(int x, int n){
        double result = Math.pow(x, n);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int x = sc.nextInt();
        System.out.println("Enter the exponent number:");
        int n = sc.nextInt();
        power(x, n);
        System.out.println("The result of " + x + " raised to the power of "+ n + " is: " + power(x, n));
        sc.close();
    }
}
