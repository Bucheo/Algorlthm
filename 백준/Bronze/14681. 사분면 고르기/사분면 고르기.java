import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();

        if(x > 0 && y > 0)      x = 1;
        else if(x < 0 && y > 0) x = 2;
        else if(x < 0 && y < 0) x = 3;
        else                    x = 4;

        System.out.println(x);

    }
}