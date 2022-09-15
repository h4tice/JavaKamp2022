public class Main {
    public static void main(String[] args) {
        int number = 28;
        int totall = 0;

        for (int d = 1; d < number; d++) {
            if (number % d == 0) {
                totall += d;
            }
        }

        if (totall == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}
