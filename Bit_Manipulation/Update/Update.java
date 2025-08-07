import java.util.*;
public class Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the position to update:");
        int pos = sc.nextInt();
        System.out.println("Enter the operation (0 or 1):");
        int operation = sc.nextInt();

        int bit = 1 << pos;

        if(operation==0){
            int notBit = ~bit;
            int newNumber = notBit & n;
            System.out.println("New number after clearing bit at position " + pos + ": " + newNumber);
        } else {
            int newNumber = bit | n;
            System.out.println("New number after setting bit at position " + pos + ": " + newNumber);
        }
    }

}
