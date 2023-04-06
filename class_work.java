import java.util.Scanner;

public class class_work {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        System.out.println("Enter the int =");

        int num = test.nextInt();

        System.out.println("Enter the double=");

        double decimal = test.nextDouble();

        test.nextLine();

        System.out.println("Enter the string=");

        String word = test.nextLine();

        test.close();

    }
}
