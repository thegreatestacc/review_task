package jusctComments;

/**
 * 1. Модификаторы доступа у полей дожны быть указаны явно.
 * 2. Модификатор доступа у конструктора должен быть указан явно.
 * 3. Наиминование принимаемых значений конструктора должно совпадать с объявленным наименованием полей класса.
 * 4. Инициализация полей в конструкторе указана не корректно (нехватает ключевого слова this).
 * 5. У метода convert должен быть явно указан модификатор доступа.
 * 6. В методе convert использовать конструкцию switch-case.
 * 7. Не выполняется single responsibility principle.
 */

public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    Converter(double usd, double eur, double jpy) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + rubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
