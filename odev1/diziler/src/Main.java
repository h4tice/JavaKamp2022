public class Main {
    public static void main(String[] args) {
        System.out.println("Recap Demo2");

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam =" + total);
        System.out.println("En Büyük =" + max);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Çok Boyutlu Diziler");

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int a = 0; a <= 2; a++) {
            System.out.println("-----------------------");
            for (int b = 0; b <= 2; b++) {
                System.out.println(sehirler[a][b]);
            }
        }
    }
}
