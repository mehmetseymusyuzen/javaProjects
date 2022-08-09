import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double amount, vatAmount, totalAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Write the fee amount : ");
        amount = input.nextDouble();
        double condition = amount>=0 && amount<=1000 ? 0.18 : 0.08;

        vatAmount = amount * condition;
        totalAmount =  amount + vatAmount;
        System.out.println("Amount with vat : " + totalAmount);

        vatAmount = totalAmount - amount;
        System.out.println("Vat amount : " + vatAmount);

        System.out.println("Vat rate : " + condition);



    }
}