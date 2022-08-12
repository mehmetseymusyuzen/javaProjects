import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math , physics , chemistry , geography , history;

        Scanner input = new Scanner(System.in);

        System.out.print("Math grade: ");
        math = input.nextInt();
        if (math<0 || math>100) {
            System.out.println("You entered the wrong course grade !");
            math = 0;
        }

        System.out.print("Physics grade: ");
        physics = input.nextInt();
        if (physics<0 || physics>100) {
            System.out.println("You entered the wrong course grade !");
            physics = 0;
        }

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();
        if (chemistry<0 || chemistry>100) {
            System.out.println("You entered the wrong course grade !");
            chemistry = 0;
        }

        System.out.print("Geography grade: ");
        geography= input.nextInt();
        if (geography<0 || geography>100) {
            System.out.println("You entered the wrong course grade !");
            geography = 0;
        }

        System.out.print("History grade: ");
        history = input.nextInt();
        if (history<0 || history>100) {
            System.out.println("You entered the wrong course grade !");
            history = 0;
        }

        int total = (math + physics + chemistry + geography + history);
        double average = total / 5.0;

        System.out.println("Average : " + average);

        if (average <= 55) {
            System.out.println("You missed the class, hope to do better for next year !");
        } else {
            System.out.println("Congratulations you passed the class !");
        }
    }
}