import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int money = sc.nextInt();
        if (money > 5000) {
            System.out.println("Go shopping with parents");
            System.out.println("Huhuhhuhhu");
        } else if (money < 5000 && money >= 2000)
            System.out.println("Go dinner with Parents");
        else if (money < 2000 && money > 0)
            System.out.println("Go party with friends");
        else
            System.out.println("Langar");

            sc.close();
    }
}
