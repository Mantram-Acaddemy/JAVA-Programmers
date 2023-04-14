public class loops {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;

        int c = a++ + b-- - ++a;

        int d = ++b - c++ + --c - ++a + a++;

        int e = 10 + ++a - b-- + c++ + a++ + --d;

        int f = ++d - --e + a++ - --b + c - e++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f++);
    }
}
