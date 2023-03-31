public class pattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 5; i >= 0; i--) {
            k = 5;
            for (j = i; j > 0; j--) {
                System.out.println("" + k);
                k--;
            }
        }

    }
}
