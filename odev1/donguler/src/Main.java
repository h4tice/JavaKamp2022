public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While Döngüsü Bitti");

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("Do-While Döngüsü Bitti");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Selin";
        ogrenciler[3] = "Ahmet";

        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[k]);
        }
    }
}
