public class Method {
    int p=3000,r=5,t=4;
    void SimpleInterest(int p,int r,int t)
    {
        double SI=(p*r*t)/100;
        System.out.println("Interest="+SI);
    }
    public static void main(String[] args) {
        Method ob=new Method();
        ob.SimpleInterest(2000,10,2);
        ob.SimpleInterest(ob.p, ob.r, ob.t);
    }
}

