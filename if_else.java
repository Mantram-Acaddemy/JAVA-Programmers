import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount");
        int amount = sc.nextInt();
        if (amount > 5000)
            System.out.println("buy a keyboard and mouse");
        else if (amount < 5000 && amount >= 2000)
            System.out.println("buy a headphone");
        else if (amount > 2000 && amount < 0)
            System.out.println("buy a earphone");
        else if (amount <= 0)
            System.out.println("buy nothing");

    }
}
