import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        double balance = 2000;
        double price;

        while (right > 0) {
            System.out.print("Enter your username : ");
            userName = input.nextLine();
            System.out.print("Enter your password : ");
            password = input.nextLine();

            if (userName.equals("Mehmet") && password.equals("Mehmet123")) {
                System.out.println("Hello, Welcome to Mehmet Bank!");
                do {
                    System.out.println(" 1-Deposit\n " + "2-Withdrawal\n " + "3-Balance Inquiry\n " + "4-Exit");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Money amount : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Money amount : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient account balance !");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Total balance : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("logging out of account, please wait");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again !");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank !");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
        }
    }
}