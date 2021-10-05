import java.util.Scanner;

/** Основной класс программы для взаимодействия с пользователем, получения значений. */
public class Main {
    /**
     * Основной метод программы для вывода результатов.<br>
     * Выводит переведённые значения в формате: "Result: число градусов в заданной
     * единице измерения = переведённое число градусов с единицей измерения =
     * переведённое число градусов с единицей измерения". <br>
     * Пользователь вводит единицу измерения, из которой нужно перевести,
     * а затем число градусов.<br> Далее с помощью конструкции switch-case
     * производится перевод на основе заданной единицы измерения с помощью
     * методов класса Converter. <br>
     * @see Converter#kelvinConversion(double)
     * @see Converter#fahrenheitConversion(double)
     * @see Converter#celsiusConversion(double)
     * @param conFrom единица измерения, из которой нужно перевести (первая буква).
     * @param temp число градусов.
     * @param args не используется. <br>
     * В случае неправильного ввода вызывается:
     * @exception IllegalStateException Неверное значение: значение. <br>
     * Использует методы класса Converter.
     */
    public static void main(String[] args) {

        String conFrom;
        double temp;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the measurement value from which u want to convert " +
                "(C - Celsius/F - Fahrenheit/K - Kelvin)");
        conFrom = reader.nextLine();
        System.out.println("Enter the temperature");
        temp = reader.nextDouble();
        switch (conFrom) {
            case "C":
                System.out.println("Result: " + new Converter().celsiusConversion(temp));
                break;
            case "F":
                System.out.println("Result: " + new Converter().fahrenheitConversion(temp));
                break;
            case "K":
                System.out.println("Result: " + new Converter().kelvinConversion(temp));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + conFrom);
        }
    }
}
