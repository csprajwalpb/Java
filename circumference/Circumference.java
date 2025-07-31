import java.util.*;
public class Circumference {
    public static float circumference(float radius){
        float result = radius * 2 * 3.14f;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius = sc.nextFloat();
        System.out.println("Circumference of circle is: " + circumference(radius));
    }
}
