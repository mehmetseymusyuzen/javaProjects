public class Main {

    static boolean isPrime(int number, int i) {

        if (number <= 1)
            return false;
        if (i * i > number)
            return true;
        if (number % i == 0)
            return false;

        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {

        System.out.println(isPrime(2, 2));

    }
}