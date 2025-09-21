import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < a; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        int num = 0;
        for (int i = 0; i < a; i++)
            if(key == arr[i])   num++;

        System.out.println(num);

    }
}