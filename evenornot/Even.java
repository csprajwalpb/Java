import java.util.Scanner;

public class Even {

    public static int calculateEven(int n){
        if(n%2==0){
            System.out.println("Even Number: " + n);
        }else{
            System.out.println("Odd Number: " + n);
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        calculateEven(n);
    }
}
