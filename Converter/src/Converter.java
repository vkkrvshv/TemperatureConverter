/**
 * Класс конвертера для перевода из одной единицы измерения в другую. <br>
 * Свойства класса: <b>unitsOfMeasurement</b> - массив единиц измерения типа String,<br>
 *     <b>convertedUnit1</b>, <b>convertedUnit2</b> - переменные типа double.
 */
public class Converter {
    /** Поле единиц измерения */
    private String[] unitsOfMeasurement = {"°C","°F", "K"};
    /** Поле 1ой и 2ой переведённых величин */
    private double convertedUnit1, convertedUnit2;

    /**
     * Метод для перевода из градусов Цельсия в Фаренгейты/Кельвины.
     * @param temp параметр, содержащий число градусов, типа double.
     * @return String - Возвращает строку с заданным числом градусов
     * Цельсия и переведённое число в Фаренгейтах и Кельвинах через знак = с единицами измерения.
     */
    public String celsiusConversion(double temp)
    {
        convertedUnit1 = temp*9/5+32;
        convertedUnit2 = temp+273.15;
        return temp + unitsOfMeasurement[0] + " = " + convertedUnit1 + unitsOfMeasurement[1]
                + " = " + convertedUnit2 + unitsOfMeasurement[2];
    }

    /**
     * Метод для перевода из Фаренгейтов в градусы Цельсия/Кельвины.
     * @param temp параметр, содержащий число градусов, типа double.
     * @return String - Возвращает строку с заданным числом Фаренгейтов и переведённое
     * число в градусах Цельсия и Кельвинах через знак = с единицами измерения.
     */
    public String fahrenheitConversion(double temp)
    {
        convertedUnit1 = (temp-32)*5/9;
        convertedUnit2 = (temp+459.67)*5/9;
        return temp + unitsOfMeasurement[1] + " = " + convertedUnit1 + unitsOfMeasurement[0]
                + " = " + convertedUnit2 + unitsOfMeasurement[2];
    }

    /**
     * Метод для перевода из Кельвинов в градусы Цельсия/Фаренгейты.
     * @param temp параметр, содержащий число градусов, типа double.
     * @return String - Возвращает строку с заданным числом Кельвинов и переведённое
     * число в градусах Цельсия и Фаренгейтах через знак = с единицами измерения.
     */
    public String kelvinConversion(double temp)
    {
        convertedUnit1 = temp-273.15;
        convertedUnit2 = temp*9/5-459.67;
        return temp + unitsOfMeasurement[2] + " = " + convertedUnit1 + unitsOfMeasurement[0]
                + " = " + convertedUnit2 + unitsOfMeasurement[1];
    }
}
