public class factorial {
    public static void main(String[] args) {
        int f = 1;
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                f = f * count;
                System.out.print(f + " ");
                count++;
            }
            System.out.println();

        }
    }
}
