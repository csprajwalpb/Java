import java.util.Scanner;

public class Odd {
    public static int odd(int n){
        int sum = 0;
        for(int i=1; i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + odd(n));
    }
}
