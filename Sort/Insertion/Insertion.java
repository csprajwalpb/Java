import java.util.*;
public class Insertion{
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                }
            arr[j+1] = current;
            }
            printArray(arr);
        }
    }
    
