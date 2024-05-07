public class Main {
    public static void main(String[] args) {

        int start = 100; // Начальная сумма на счету клиента
        int amount = 1100; // Сумма пополнения счета
        int porog = 1000; // Пороговая сумма для начисления бонуса
        int bonus = 0; // Инициализируем переменную bonus как 0

        if (amount > porog) {
            bonus = amount/100; // Рассчитываем количество бонусных рублей
        }

        int finish = start + amount + bonus; // Итоговая сумма на счету клиента

        System.out.println("Итоговый счет: " + finish); // Выводим результаты на экран

    }
}