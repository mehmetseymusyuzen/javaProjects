import java.util.Scanner;

public class Main {

    static int exp(int base, int pow) {
        if (pow == 0)
            return 1;
        return base * exp(base, pow - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number : ");
        int base = input.nextInt();
        System.out.print("Enter a power number : ");
        int pow = input.nextInt();

        System.out.println("Result : " + exp(base, pow));

    }
}