import java.util.*;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Menu:");
        System.out.println("Enter a Number, either 1 or 0: ");
        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }
            else if(marks>=60&&marks<=89){
                System.out.println("This is Also Good");
            }
            else if(marks>=0&&marks<=59){
                System.out.println("This is Good as well!!!");
            }
            
        }else if(choice==0){
            System.out.println("Exiting the program.");
            break;
        }else{
            System.out.println("Invalid Choice. Please enter either 1 or 0.");
        }
        }
        sc.close();
    }
}
