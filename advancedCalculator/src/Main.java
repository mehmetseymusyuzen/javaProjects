import java.util.Scanner;

public class Main {

    static void sum() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int result = x + y;
        System.out.println("Addition result : " + result);
    }

    static void minus() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int result = x - y;
        System.out.println("Subtraction result : " + result);
    }

    static void times() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int result = x * y;
        System.out.println("Multiplication result : " + result);

    }

    static void divide() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        if (y == 0) {
            System.out.println("A number cannot be divided by zero");
            return;
        }
        int result = x / y;
        System.out.println("Division result : " + result);
    }

    static void power() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println("Exponent reuslt : " + result);
    }

    static void factorial() {
        int x;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number : ");
        x = number.nextInt();

        int result = 1;
        if (x == 0) {
            System.out.println("factorial result : 1");
        } else {
            while (x > 0) {
                result *= x;
                x--;
            }
            System.out.println("factorial result : " + result);
        }
    }

    static void modding() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int result = x % y;
        System.out.println("Modding result : " + result);
    }

    static void rectangularAreaAndPerimeter() {
        int x, y;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        x = number.nextInt();
        System.out.print("Enter a second number : ");
        y = number.nextInt();

        int perimeter = 2 * (x + y);
        int area = x * y;

        System.out.println("Rectangular perimeter calculation result : " + perimeter);
        System.out.println("Rectangular area calculation result : " + area);

    }


    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction process\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Mode Retrieval\n"
                + "8- Rectangular Area and Perimeter Calculation\n"
                + "9- Exit";

        System.out.println(menu);

        while (true) {
            System.out.print("Choose a process : ");
            select = number.nextInt();
            if (select == 9)
                break;

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modding();
                    break;
                case 8:
                    rectangularAreaAndPerimeter();
                    break;
            }
        }
    }
}