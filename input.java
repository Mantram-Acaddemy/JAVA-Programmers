import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the integer: ");
        int age = sc.nextInt();

        System.out.println("Enter the double: ");
        double marks = sc.nextDouble();

        System.out.println("Enter the name: ");
        sc.nextLine();
        String name = sc.nextLine();

        sc.close();
    }
}
