public class Main {
    public static void main(String[] args) {
        int balance = 25; // текущий баланс счёта
        int payment = 1200; // сумма пополнения счёта
        int bonus = 0;
        if (payment > 1000) {
            bonus = payment / 100;
        }

        int newbalance = balance + payment + bonus;

        System.out.println("Баланс счёта: " + newbalance);
        System.out.println("Начислено бонусов: " + bonus);

    }
}