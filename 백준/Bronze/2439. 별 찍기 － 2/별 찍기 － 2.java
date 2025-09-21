import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - (i + 1); j++)
                System.out.printf(" ");
            for (int k = 0; k < i+1; k++)
                System.out.printf("*");
            System.out.println();
        }
    }
}