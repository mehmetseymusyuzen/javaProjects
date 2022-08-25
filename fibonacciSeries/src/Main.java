import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println(1);
        System.out.println(1);
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}