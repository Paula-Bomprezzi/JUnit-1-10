package EntidadesTest;
import Entidades.ConversorTemperatura;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConversorTemperaturaTest {


    @Test
    public void TemperaturaTest(){
        ConversorTemperatura conver1 = new ConversorTemperatura();
        float res1 = conver1.Celsius_a_Farenheit(33);
        float res2 =conver1.Fahrenheit_a_Celsius(152);
    }
}


