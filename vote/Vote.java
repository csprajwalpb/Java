import java.util.*;
public class Vote {
    public static float eligibility(int age){
        if(age>18){
            System.out.println("The person is eligible to vote");
            
        }else{
            System.out.println("The person is not eligible to vote");
        }
        return age;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println(eligibility(age));
    }
}
