public class Main {
    public static void main(String[] args) {
                  //REFERENCE TYPE
      //  CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager1;
        CustomerManager customerManager2 = new CustomerManager();

        customerManager1 = customerManager2;
        customerManager1.add();
        customerManager1.delete();
        customerManager1.update();

        System.out.println("-----------------------------------------------");
                // VALUE
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        System.out.println("----------------------------------------------");
        int [] sayilar1={1,2,3};
        int [] sayilar2={4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]); //DİZİLER REFERANS TİPTİR!!!


    }
}
