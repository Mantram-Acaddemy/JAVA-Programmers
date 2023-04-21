import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String x=ob.readLine();
        System.out.println("Text = "+x);
    }
}
