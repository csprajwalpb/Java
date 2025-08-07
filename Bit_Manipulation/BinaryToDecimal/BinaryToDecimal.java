
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryString = "1101"; 
        int decimalValue = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(binaryString.length() - 1 - i);
            if (bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }

        System.out.println("Decimal representation: " + decimalValue);
    }
}
