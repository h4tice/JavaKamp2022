import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayı: ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        boolean isPrime = true;

        for (int c = 2; c < number; c++) {
            if (number % c == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " Sayisi asal sayidir");
        } else {
            System.out.println(number + " Sayisi asal sayi değildir");
        }
    }
}
