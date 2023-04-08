class test 
{
    int area_rectangle(int l,int b)
    {
        int ar = l*b;
        return ar;
    }
    public static void main(String[] args) {
        test ob = new test();
        int ar = ob.area_rectangle(15,8);
        System.out.println("area of rectangle=" +ar);
    }
}
