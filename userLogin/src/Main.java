import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Entry your username : ");
        userName = input.nextLine();

        System.out.print("Entry your password : ");
        password = input.nextLine();

        if (userName.equals("java") && password.equals("java1234")) {
            System.out.println("Login successful !");
        } else {
            System.out.println("login failed !");
            System.out.println("Do you want to reset your password ? ");
            System.out.println(" 1-Yes\n 2-No");
            System.out.print("Your select : ");
            select = input.nextLine();
            if (select.equals("1")) {
                System.out.println("Your new password must be different " + "from your old password and the wrong password !!!");
                System.out.print("Entry your new password : ");
                newPassword = input.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java1234")) {
                    System.out.println("Your password has not been changed because it does not meet the requirements.");
                } else {
                    System.out.println("Your password has been changed");
                }
            } else {
                System.out.println("Your password is left by default");
            }
        }
    }
}