public class factorial {
    public static void main(String[] args) {
        int count=1,fact=1;
        for(int i=1;i<=4;i++){
            
            for(int j = 4;j>=i;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                fact=count*fact;
                System.out.print(fact+" ");
                count++;
            }
            System.out.println();
            

        }
    }


}
