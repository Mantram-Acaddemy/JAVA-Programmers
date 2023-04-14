import java.util.Scanner;

public class switchx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the button: ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Light1");
            case 2:
                System.out.println("Fan");
            case 3:
                System.out.println("Exhaust");
            case 4:
                System.out.println("Light2");
            default:
                System.out.println("Button Error");
                break;

        }
    }
}
