public class pattern12345 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
