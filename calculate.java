import java.util.Scanner;

class calculate
{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter first no.");
        int a= scr.nextInt();
        System.out.println("enter the second no.");
        int b=scr.nextInt();
        int c = a*b;
        System.out.println("result = " +c);
        scr.close();
    }
}