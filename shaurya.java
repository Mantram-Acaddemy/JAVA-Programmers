import java.util.Scanner;

public class shaurya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double p, r, t, SI, CI;
        System.out.println("press 1 for SI");
        System.out.println("press 2 for CI");
        System.out.println("enter your choice");
        a = sc.nextInt();
        System.out.println("enter the principal");
        p = sc.nextDouble();
        System.out.println("enter the rate");
        r = sc.nextDouble();
        System.out.println("enter the time");
        t = sc.nextDouble();
        switch (a) {
            case 1: {
                SI = (p * r * t) / 100;
                System.out.println("SI =" + SI);
                break;
            }
            case 2: {
                CI = p * Math.pow((1 + r / 100), t);
                System.out.println("CI =" + CI);
                break;
            }
            default: {
                System.out.println("wrong choice");
                break;
            }
        }

    }
}
