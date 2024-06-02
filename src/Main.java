public class Main {
    public static void main(String[] args) {

        int account = 100; //сумма на счете
        int payment = 50000; // сумма поплнения

        int gift;
        if (payment >= 1000) {

            gift = payment / 100 + account + payment;
        } else {
            gift = payment + account;

        }
        System.out.println("Итоговая сумма на счете, " + gift + ".");
    }
}