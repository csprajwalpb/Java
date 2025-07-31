import java.util.*;
public class EvenPrinter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n<1){
            System.out.println("Please enter a positive number");
        }else{
            System.out.println("Even Numbers till " + n + ":");
            for(int i=0; i<=n; i++){
                if(i%2==0){
                    System.out.print(i + " ");
                }
            }
        }
        
    }
}