import java.util.Scanner;

public class MPractice1 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int num;
        System.out.println("Enter the integer-");
        num=scr.nextInt();

        if(isEven(num))
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is not even");
        }
        scr.close();
    }
    public static boolean isEven(int number)
    {
        if(number % 2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
