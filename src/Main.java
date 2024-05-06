public class Main {
    public static void main(String[] args) {

        int start = 100; // Начальная сумма на счету клиента
        int amount = 1100; // Сумма пополнения счета
        int bonus = 1000; // Пороговая сумма для начисления бонуса


        if (amount > bonus) {
            bonus = (amount - bonus) / 100; // Рассчитываем количество бонусных рублей
        }
        int finish = start + amount + bonus; // Итоговая сумма на счету клиента
        System.out.println("Итоговый счет: " + finish); // Выводим результаты на экран

    }
}