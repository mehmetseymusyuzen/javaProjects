import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math , physics , chemistry , geography , history;

        Scanner inp = new Scanner(System.in);

        System.out.print("Math grade: ");
        math = inp.nextInt();

        System.out.print("Physics grade: ");
        physics = inp.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Geography grade: ");
        geography= inp.nextInt();

        System.out.print("History grade: ");
        history = inp.nextInt();

        int total = (math + physics + chemistry + geography + history);
        double average = total / 5.0;
        System.out.println("Average "+ average);

        String results = average>=60 ? "you passed the class" : "you failed the class";
        System.out.println(results);
    }
}