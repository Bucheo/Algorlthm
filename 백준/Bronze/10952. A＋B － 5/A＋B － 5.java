import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(a + b == 0)
                return;
            System.out.println(a + b);
        }
    }
}