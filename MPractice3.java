public class MPractice3 {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
