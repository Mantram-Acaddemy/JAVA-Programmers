public class language_in_java {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                int o = j * j;
                System.out.println(o);

            }
        }
    }
}
