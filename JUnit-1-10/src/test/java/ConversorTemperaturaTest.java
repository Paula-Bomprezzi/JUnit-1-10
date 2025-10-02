import Entidades.ConversorTemperatura;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {


    @Test
    public void TemperaturaTest(){
        ConversorTemperatura conver1 = new ConversorTemperatura();
        float res1 = conver1.Celsius_a_Farenheit(33);
        assertEquals(91.4000015258789, res1);
        float res2 =conver1.Fahrenheit_a_Celsius(152);
        assertEquals(216, res2);
    }
}


