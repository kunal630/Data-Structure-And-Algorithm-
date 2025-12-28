public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = i + 1; j > 0; j--) {
                System.out.print((char)(ch + j-1)); // cast back to char
            }
            System.out.println();
        }
    }
}