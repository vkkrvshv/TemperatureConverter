import java.util.Scanner;

/** Основной класс программы. */
public class FriendProgMain {

    /**
     * Основной метод программы.
     * @param conFrom единица измерения, из которой нужно перевести (первая буква).
     * @param temp число градусов.
     * @param args не используется.
     * @exception IllegalStateException - Неверное значение: значение.
     */
    public static void main(String[] args) {
        String conFrom;
        double temp;
        Scanner scanner = new Scanner(System.in);
        conFrom = scanner.nextLine();
        temp = scanner.nextDouble();
        if (conFrom=="C") {
            System.out.println("Result: " + new Converter().celsiusConversion(temp));
        }
        if (conFrom=="F") {
            System.out.println("Result: " + new Converter().fahrenheitConversion(temp));
        }
        if (conFrom=="K") {
            System.out.println("Result: " + new Converter().kelvinConversion(temp));
        }
        else throw new IllegalStateException("Unexpected value: " + conFrom);
    }
}
