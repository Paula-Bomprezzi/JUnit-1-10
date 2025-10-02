package EntidadesTest;
import org.junit.jupiter.api.Test;
import Entidades.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void testDepositos() {
        CuentaBancaria c1 = new CuentaBancaria();
        float resultado = c1.depositar(600);
        assertEquals(600, resultado);
        float resultado2 = c1.extraer(1000);
        assertEquals(600, resultado2);
        float resultado3 = c1.extraer(326.58F);
        assertEquals(273.42F, resultado3);
    }
}


