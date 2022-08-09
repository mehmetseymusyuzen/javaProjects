import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many kilometers you will travel? : ");
        km = input.nextDouble();

        total = startPrice + (perKm * km);
        total = ( total < 20) ? 20 : total;

        System.out.println("Toplam price : " + total );


    }
}