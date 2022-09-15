public class Main {
    public static void main(String[] args) {
        // Java da degisken tipleri
        /*
         * byte ---> sayi , 1 byte
         * short ---> sayi , 2 byte
         * int ---> sayi , 4 byte
         * long ---> sayi , 8 byte
         * float ---> ondalikli sayi , 4 byte
         * double ---> ondalikli sayi , 8 byte
         * char ---> karakter , 2 byte
         * boolean ---> true ya da false , 1 byte
         */
        byte a = 1;
        System.out.println(a);

        short b = 25;
        System.out.println(b);
        int c = 365;
        System.out.println(c);

        long d = 86799;
        System.out.println(d);

        double e = 0.24;
        System.out.println(e);

        char f = 70;
        System.out.println(f);

        char karakter = 'c';
        System.out.println((int) karakter);

        boolean g = false;
        System.out.println(g);

        String z = "Hatice";
        System.out.println(z);
        System.out.println("Benim adim " + z);

        String mesaj = "Merhaba ";

        String mesaj2 = "ben hatice. ";

        String mesaj3 = "Java 2022 kampına dün başladık.";

        System.out.println(mesaj + mesaj2 + mesaj3);
    }
}
