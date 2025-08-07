

public class DecimalToBinary {
    public static void main(String[] args) {
        int n =8;
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }
        System.out.println("Binary representation: " + binary.toString());
    }
}
