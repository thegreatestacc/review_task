package jusctComments;

/**
 * 1. У класса Advice должен быть явно указан модификатор доступа.
 * 2. Названия методов должно отвечать за их конкретные действия, если метод должен давать совет по выбору ужина,
 * то название должно быть соответствующее (getAdviceAboutDinner).
 * 3. Тоже самое косается метода по приобретению валюты (getAdviceAboutCurrency).
 * 4. У методов должны быть явно указаны модификаторы доступа.
 * 5. В методах необходимо использовать конструкцию switch-case.
 * 6. Вынести ответы в константы.
 * 7. Не выполняется  single responsibility principle.
 */

class Advice {

    void getAdvice(double moneyBeforeSalary, int daysBeforeSalary) {
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Отлично! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            }
        }
    }

    void getAdvice2(double moneyBeforeSalary) {
        if (moneyBeforeSalary < 5000) {
            System.out.println("Пока рано копить.");
        } else if (moneyBeforeSalary < 10000) {
            System.out.println("Купите доллары!");
        } else if (moneyBeforeSalary < 30000) {
            System.out.println("Советуем купить в равных долях доллары, евро и отложить рубли.");
        } else {
            System.out.println("С каждой зарплаты покупайте валюту и начните изучать инвестиции.");
        }
    }
}
