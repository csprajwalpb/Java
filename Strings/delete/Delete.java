import java.util.*;
public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: ");
        String str = sc.nextLine();
        String userName = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '@'){
                break; 
            } else {
                userName += str.charAt(i);
            }
        }
        System.out.println("The username is: " + userName);
    }
}
