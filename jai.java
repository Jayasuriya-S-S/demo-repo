public class jai { 
    public static void main(String[] args) {
        int n = 2; // Change this value for different sizes

        // Upper half (including the middle row)
         for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= n+i; j++) {
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}






