import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if(a == b && b == c)
            a = 10000 + a * 1000;
        else if((a == b && a != c) || (a == c && a != b))
            a = 1000 + a * 100;
        else if((b == c && a != b))
            a = 1000 + b * 100;
        else {
            a = (a > b ? a > c ? a : c : b > c ? b : c) * 100;
        }
        System.out.println(a);
    }
}