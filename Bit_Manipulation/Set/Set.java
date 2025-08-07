public class Set {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bit = 1 << pos;

        int newNumber = bit | n;
        System.out.println("New number after setting bit at position " + pos + ": " + newNumber);
    }
}
