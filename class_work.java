import java.util.Scanner;

public class class_work {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        System.out.println("Enter the int =");

        int num = test.nextInt();
        System.out.println("integer="+num);

        System.out.println("Enter the double=");

        double decimal = test.nextDouble();
        System.out.println("double="+decimal);

        System.out.println("Enter the string=");

        test.nextLine();
        String word = test.nextLine();
        System.out.println("string="+word);

        test.close();

    }
}
