import java.util.*;
public class Greater {

    public static int great(int a, int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Greater of two numbers is: " + great(a, b)); 
    }
}
