import java.util.Scanner;

public class switchx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for c&d");
        System.out.println("press 2 for linear in equation");

        int number = sc.nextInt();
        switch(number)
        {
            case 1:
            int a,b,c , d , e ;
            a=8;
            b=5;
            d=9;
            e=7;
            c= (a+b+a-b)/(a+b-a+b) + (d+e+d-e)/(d+e-d+e);

            System.out.println(c);

        }

        case 2:
        {
            int x,y;
            y= x-3=3*x+8;
            System.out.println(y);
        }


    }

}
