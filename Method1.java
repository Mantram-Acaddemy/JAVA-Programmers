public class Method1 {
    int simpleI(int r , int p, int t){
        int a= (p*r*t)/100;
        return a;

        
}
public static void main(String[] args) {
    Method1 ob1= new Method1();
    int x= ob1.simpleI(2000,25,1);
    System.out.println(x);
}
}