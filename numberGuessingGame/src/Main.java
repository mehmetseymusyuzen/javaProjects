import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100);

        int right = 0;
        int selected;
        boolean isWin = false;
        boolean isFalse = false;

        while (right < 5) {
            System.out.print("Enter a number : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Please enter a number between 0-100 ! ");

                if (isFalse) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining trial : " + (5 - right));
                } else {
                    isFalse = true;
                    System.out.println("If you enter a number outside the definition " +
                            "range again, your remaining right will be reduced.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, you guessed " +
                        "correctly, the number you guessed : " + number);
                isWin = true;
                break;

            } else {
                System.out.println("You entered an incorrect number");
                if (selected > number) {
                    System.out.println("The number you " + selected +
                            " is greater than the number you guessed");
                } else {
                    System.out.println("The number you " + selected +
                            " is smaller than the number you guessed");
                }
                right++;
                System.out.println("Remaining trial : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost ! ");
        }
    }
}