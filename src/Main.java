public class Main {
        public static void main(String[] args) {
            // Начальная сумма на счету клиента
            int initialBalance = 100;

            // Сумма пополнения счета
            int topUpAmount = 1100;

            // Пороговая сумма для начисления бонуса
            int bonusThreshold = 1000;

            // Переменная для хранения количества бонусных рублей
            int bonusAmount = 0;

            // Проверка, превысила ли сумма пополнения порог для начисления бонуса
            if (topUpAmount > bonusThreshold) {
                // Рассчитываем количество бонусных рублей
                bonusAmount = (topUpAmount - bonusThreshold) / 100;
            }

            // Итоговая сумма на счету клиента
            int finalBalance = initialBalance + topUpAmount + bonusAmount;

            // Выводим результаты на экран
            System.out.println("Итоговый счет: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + bonusAmount);
        }
}