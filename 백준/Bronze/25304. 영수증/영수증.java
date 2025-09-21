import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt(), a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int price = sc.nextInt(), num = sc.nextInt();
            sum += (price * num);
        }

        System.out.println(total == sum ? "Yes" : "No");
    }
}