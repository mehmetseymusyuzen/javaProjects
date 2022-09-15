import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Minesweeper game ! \n" +
                "enter the size of the field, for example: (5 4) : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
        mineSweeper.run();
        scanner.close();
    }

}