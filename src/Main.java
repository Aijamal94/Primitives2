public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // Начальная сумма на счету клиента
        int topUpAmount = 1100; // Сумма пополнения счета
        int bonusThreshold = 1000; // Пороговая сумма для начисления бонуса
        int bonusAmount = 0; // Переменная для хранения количества бонусных рублей

        if (topUpAmount > bonusThreshold) {
            // Рассчитываем количество бонусных рублей
            bonusAmount = (topUpAmount - bonusThreshold) / 100; // Рассчитываем количество бонусных рублей
        }

        int finalBalance = initialBalance + topUpAmount + bonusAmount; // Итоговая сумма на счету клиента

        System.out.println("Итоговый счет: " + finalBalance + " рублей");
    }
}
