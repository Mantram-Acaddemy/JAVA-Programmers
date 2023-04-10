import java.util.Scanner;

public class scanner_and_buffered_reader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer");
        int in = sc.nextInt();
        System.out.println("interger =" + in);
        System.out.println("enter the double digit");
        double d = sc.nextDouble();
        System.out.println("Double digit =" + d);
        System.out.println("enter the string");
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String =" + s);
        sc.close();
    }
}
