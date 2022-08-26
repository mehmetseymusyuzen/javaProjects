import java.util.Scanner;

public class Main {

    static int f(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println(f(n));

        /*
          Fibonacci series :
          1 1 2 3 5 8 13 21 34 55 89 ...

          The rule of the fibonacci series :
          f(1) = 1
          f(2) = 1
          f(3) --> 1 + 1 = 2
          f(4) --> 2 + 1 = 3
          f(5) --> 3 + 2 = 5
          f(6) --> 5 + 3 = 8
          f(7) --> 8 + 5 = 13

         */

    }
}