public class Main {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int e = 1; e < number1; e++) {
            if (number1 % e == 0) {
                toplam1 += e;
            }
        }

        for (int f = 1; f < number2; f++) {
            if (number2 % f == 0) {
                toplam2 += f;
            }
        }

        if (number1 == toplam2 && number2 == toplam1) {
            System.out.println("Bu iki sayi arkadaştır");
        } else {
            System.out.println("Bu iki sayi arkadaş değildir");
        }
    }
}
