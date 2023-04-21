import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Press the button-");
        int button=sc.nextInt();

        switch(button){
        case 1:
           System.out.println("Light 1");
           break;
        case 2:
           System.out.println("Fan");
           break;
        case 3:
           System.out.println("Exhaust");
           break;
        case 4:
           System.out.println("Light 2");
           break;
        default:System.out.println("Button error");
           sc.close();
        }

    }
}
