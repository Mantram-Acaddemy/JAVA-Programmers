import java.util.Scanner;
public class MPractice2 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String word;
        System.out.print("Enter the Alphabet-");
        word=scr.nextLine();
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            if(isVowel(word.charAt(i)))
            {
                count ++;
            }          
        } 
        System.out.println("Number of vowels="+count);
        scr.close();
    }
    public static boolean isVowel(char alphabet)
    {
        switch(alphabet)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            return true;
            default:
            return false; 
        }
    }
}
