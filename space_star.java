public class space_star {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                if((j==i && j < 6) || j==1 || (i == 6 && j <=4)){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }   
            }
            System.out.println();
        }    
    }
}
