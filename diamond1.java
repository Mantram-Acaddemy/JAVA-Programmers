public class diamond1 {
   public static void main(String[] args) {
    for(int i= 1;i<=4;i++){
         for(int j=4;j>i;j--){
            System.out.print(" ");
        }
          for (int k =1;k<=i;k++){
            if(k==i|| k==1)
             System.out.print("* ");
             else 
              System.out.print("  ");
        }
         System.out.println();
      }
      for( int i=1;i<=3;i--){
         for(int j=i;j>=i;j--){
            System.out.print("  ");
         }
         for(int j=3;j>=i;j--){
           if(j==3 || j==1)
           System.out.print("* ");
           else
           System.out.print("  ");
         }
         System.out.println(" ");
      }
   } 
}
