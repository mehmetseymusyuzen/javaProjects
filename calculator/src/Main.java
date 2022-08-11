import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        number1 = input.nextInt();
        System.out.print("Enter second number : ");
        number2 = input.nextInt();

        System.out.println(" 1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division");
        System.out.print("Your select : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication : " + (number1 * number2));
                break;
            case 4:
                switch (number2) {
                    case 0:
                        System.out.println("A number cannot be divided by 0");
                        break;
                    default:
                        System.out.println("Division : " + (number1 / number2));
                }
                break;
            default:
                System.out.println("You made an invalid choice !!!");
        }
    }
}