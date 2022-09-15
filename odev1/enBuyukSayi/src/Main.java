public class Main {
    public static void main(String[] args) {
        int number1 = 9;
        int number2 = 10 ;
        int number3 = 99;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1+" en büyük sayıdır");
        }
        else if (number2 > number1 && number2 >number3) {
            System.out.println(number2+" en büyük sayıdır");
        }
        else {
            System.out.println(number3+" en büyük sayıdır");
        }
    }
}

