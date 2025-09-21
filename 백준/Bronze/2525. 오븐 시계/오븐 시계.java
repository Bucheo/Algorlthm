import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), m1 = sc.nextInt();

        int min = h * 60 + m + m1;
        h = (min / 60) % 24;
        m = min % 60;

        System.out.println(h + " " + m);
    }
}