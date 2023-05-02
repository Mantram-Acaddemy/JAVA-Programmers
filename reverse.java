public class reverse {
    public static void main(String[] args) {
        int num = 8976532;
        int temp = 0;
        while (num != 0) {
            temp = temp * 10;
            temp = num % 10 + temp;
            num = num / 10;
        }
        System.out.println(temp);
    }
}
