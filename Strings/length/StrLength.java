import java.util.*;
public class StrLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totalLength = 0;
        System.out.println("Enter the strings:");

        for(int i = 0; i < size; i++) {
            array[i] = sc.next();
            totalLength += array[i].length();
        }
        System.out.println("Total length of all strings: " + totalLength);
    }
}
