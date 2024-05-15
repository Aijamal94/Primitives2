public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; // Начальная сумма на счету клиента
        int addend = 1100; // Сумма пополнения счета

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        //int bonus=addend>1000?addend/100:0;
        int finalAccount = initialAccount + addend + bonus;

        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус:" + bonus);

    }
}
