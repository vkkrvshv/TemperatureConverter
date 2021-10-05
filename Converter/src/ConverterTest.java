import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void celsiusConversion() {
        String s_actual = new Converter().celsiusConversion(23);

        String s_expected = "23.0°C = 73.4°F = 296.15K";

        Assert.assertEquals(s_expected, s_actual);
        System.out.println(s_actual);
        System.out.println(s_expected);
    }

    @Test
    public void fahrenheitConversion() {
        String s_actual = new Converter().fahrenheitConversion(23.5);

        String s_expected = "23.5°F = -4.722222222222222°C = 268.42777777777775K";

        Assert.assertEquals(s_expected, s_actual);
        System.out.println(s_actual);
        System.out.println(s_expected);
    }

    @Test
    public void kelvinConversion() {
        String s_actual = new Converter().kelvinConversion(23);

        String s_expected = "23.0K = -250.14999999999998°C = -418.27000000000004°F";

        Assert.assertEquals(s_expected, s_actual);
        System.out.println(s_actual);
        System.out.println(s_expected);
    }

    @Test
    public void kelvinConversion1() {
        String s_actual = new Converter().kelvinConversion(17.99);

        String s_expected = "23.0K = -250.14999999999998°C = -418.27000000000004°F";

        Assert.assertEquals(s_expected, s_actual);
        System.out.println(s_actual);
        System.out.println(s_expected);
    }

    @Test
    public void fahrenheitConversion1() {
        String s_actual = new Converter().fahrenheitConversion(3256.1);

        String s_expected = "No";

        Assert.assertEquals(s_expected, s_actual);
        System.out.println(s_actual);
        System.out.println(s_expected);
    }
}