import java.util.*;
public class Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        System.out.println("Enter names: ");
        String names[] = new String[n];

        for(int i=0; i<n; i++){
            names[i] = sc.next();
        }

        for(int i=0; i<names.length; i++){
            System.out.println("Name " + (i+1) + ": " + names[i]);
        }
    }
}
