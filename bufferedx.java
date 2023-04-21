import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedx {
    public static void main(String[] args)throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int x= Integer.parseInt(sc.readLine());
        System.out.println("Integer="+x);
    }
}
