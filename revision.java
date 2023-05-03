import java.net.SocketTimeoutException;
import java.util.Scanner;

public class revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for diamond pattern");
        System.out.println("press 2 for number pattern");
        System.out.println("press 3 for getting factorial of a number");
        System.out.println("press 4 for reversing the number");
        System.out.println("press 5 for checking the palindrome number");
        System.out.println();
        System.out.println("enter your choice");
        int c;
        c = sc.nextInt();
        switch (c) {
            case 1: {
                for (int i = 1; i <= 4; i++) {
                    for (int j = 4; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for (int i = 3; i >= 1; i--) {
                    for (int j = 4; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2: {
                int count = 0;
                for (int i = 1; i <= 4; i++) {
                    for (int j = 4; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        count++;
                        System.out.print(count + " ");
                    }
                    System.out.println();

                }
                break;

            }
            case 3: {
                int count = 1;
                int f = 1;
                for (int i = 1; i <= 4; i++) {
                    for (int j = 4; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        count++;
                        f = f * i;
                        System.out.print(f + " ");
                    }
                    System.out.println();

                }
                break;

            }
            case 4: {
                int number, temp, y;
                System.out.println("enter the number");
                number = sc.nextInt();
                temp = 0;
                while (number != 0) {
                    y = number % 10;
                    temp = temp * 10 + y;
                    number = number / 10;
                }
                System.out.println("reverse number =" + temp);
                break;

            }
            case 5: {
                int r, num, tem = 0;
                System.out.println("enter the number");
                num = sc.nextInt();
                int u = num;
                while (num > 0) {
                    r = num % 10;
                    tem = (tem * 10) + r;
                    num = num / 10;
                }
                if (tem == u) {
                    System.out.println("answer=" + tem);
                    System.out.println("It is a palindrome number");
                } else {
                    System.out.println("answer=" + tem);
                    System.out.println("It is not a palindrome number");
                }
                break;
            }
            default: {
                System.out.println("wrong Input");
                break;
            }
        }
    }

}
