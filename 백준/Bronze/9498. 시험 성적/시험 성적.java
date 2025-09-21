import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b;

        if(a >= 90)         b = 'A';
        else if(a >= 80)    b = 'B';
        else if(a >= 70)    b = 'C';
        else if(a >= 60)    b = 'D';
        else                b = 'F';

        System.out.println(b);
    }
}