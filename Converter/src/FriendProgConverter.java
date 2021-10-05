/**
 * Класс конвертера.
 * Свойства класса: <b>convertedUnit1</b>, <b>convertedUnit2</b>.
 */

public class FriendProgConverter {
    /** Поле двух переведённых величин */
    private double convertedUnit1, convertedUnit2;

    /**
     * Метод для перевода из градусов Цельсия.
     * @param temp число градусов.
     * @return String - Возвращает строку с заданным числом градусов Цельсия и
     * переведённое число градусов через знак =.
     */
    public String celsiusConversion(double temp) {
        convertedUnit1 = temp * 9 / 5 + 32;
        convertedUnit2 = temp + 273.15;
        return temp + "°C" + " = " + convertedUnit1 + "°F" + " = " + convertedUnit2 + "K";
    }

    /**
     * Метод для перевода из Фаренгейтов.
     * @param temp число градусов.
     * @return String - Возвращает строку с заданным числом Фаренгейтов и переведённое
     * число градусов через знак =.
     */
    public String fahrenheitConversion(double temp) {
        convertedUnit1 = (temp - 32) * 5 / 9;
        convertedUnit2 = (temp + 459.67) * 5 / 9;
        return temp + "°F" + " = " + convertedUnit1 + "°C" + " = " + convertedUnit2 + "K";
    }

    /**
     * Метод для перевода из Кельвинов.
     * @param temp число градусов.
     * @return String - Возвращает строку с заданным числом Кельвинов и переведённое
     * число градусов через знак =.
     */
    public String kelvinConversion(double temp) {
        convertedUnit1 = temp - 273.15;
        convertedUnit2 = temp * 9 / 5 - 459.67;
        return temp + "K" + " = " + convertedUnit1 + "°C" + " = " + convertedUnit2 + "°F";
    }
}
