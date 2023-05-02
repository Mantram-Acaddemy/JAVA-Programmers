public class pattern123 {
    public static void main(String[] args) {
        int no = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                no++;
                System.out.print(no + " ");
            }
            System.out.println();
        }

    }
}
