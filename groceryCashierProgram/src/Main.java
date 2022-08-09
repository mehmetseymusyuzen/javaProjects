import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomatoes = 1.11,
                banana = 0.95, aubergine = 5.0, total,
                pearKg, appleKg, tomatoesKg, bananaKg,
                aubergineKg;

        Scanner input = new Scanner(System.in);
        System.out.print("How many kilograms of pears did you buy ? : ");
        pearKg = input.nextDouble();

        System.out.print("How many kilograms of apples did you buy ? : ");
        appleKg = input.nextDouble();

        System.out.print("How many kilograms of tomatoes did you buy ? : ");
        tomatoesKg = input.nextDouble();

        System.out.print("How many kilograms of banana did you buy ? : ");
        bananaKg = input.nextDouble();

        System.out.print("How many kilograms of banana did you buy ? aubergine: ");
        aubergineKg = input.nextDouble();

        total = ((pear*pearKg)+(apple*appleKg)+(tomatoes*tomatoesKg)+
                (banana*bananaKg)+(aubergine*aubergineKg));

        System.out.println("Total price : " + total);

    }
}