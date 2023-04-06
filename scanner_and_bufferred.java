import java.util.Scanner;

public class scanner_and_bufferred {
    public static void main(String[] args) {
        Scanner lele = new Scanner(System.in);

        String name = lele.nextLine();

        System.out.println("My name is:" + name);

        int kg = lele.nextInt();
        double marks = lele.nextDouble();

        System.out.println("Kg =" + kg);
        System.out.println("Marks="+marks);
    
        lele.close();
    }
}
