import java.util.Scanner;
public class MPractice4 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=scr.nextInt();

        if(isPalindrome(num))
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
        scr.close();
    }
    public static boolean isPalindrome(int number){
        int temp=number;
        int remainder;
        int reverse=0;

        while(temp>0)
        {
            remainder=temp%10;
            temp=temp/10;
            reverse=reverse*10+remainder;
        }
        return reverse==number;
    }
}
