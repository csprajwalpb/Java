public class Clear {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bit = 1 << pos;

        int notBit = ~bit;
        int newNumber = notBit & n;
        System.out.println("New number after clearing bit at position " + pos + ": " + newNumber);
    }
}
