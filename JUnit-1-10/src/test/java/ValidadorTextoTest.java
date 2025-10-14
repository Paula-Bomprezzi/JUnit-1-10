import Entidades.ValidadorTexto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTextoTest {
    
    private ValidadorTexto validador = new ValidadorTexto();
    
    @Test
    public void testProcesarTextoConValorNulo() {
        // Verificar que se lanza IllegalArgumentException cuando se pasa null
        assertThrows(IllegalArgumentException.class, () -> {
            validador.procesarTexto(null);
        });
        
        // Verificar el mensaje de la excepción
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validador.procesarTexto(null);
        });
        assertEquals("El texto no puede ser nulo", exception.getMessage());
    }
    
    @Test
    public void testProcesarTextoConValorValido() {
        // Verificar que funciona correctamente con un valor válido
        String resultado = validador.procesarTexto("hola mundo");
        assertEquals("HOLA MUNDO", resultado);
    }
    
    @Test
    public void testObtenerLongitudConValorNulo() {
        // Verificar que se lanza NullPointerException cuando se pasa null
        assertThrows(NullPointerException.class, () -> {
            validador.obtenerLongitud(null);
        });
        
        // Verificar el mensaje de la excepción
        Exception exception = assertThrows(NullPointerException.class, () -> {
            validador.obtenerLongitud(null);
        });
        assertEquals("No se puede calcular la longitud de un texto nulo", exception.getMessage());
    }
    
    @Test
    public void testObtenerLongitudConValorValido() {
        // Verificar que funciona correctamente con un valor válido
        int longitud = validador.obtenerLongitud("prueba");
        assertEquals(6, longitud);
    }
    
    @Test
    public void testEsPositivoConValorNulo() {
        // Verificar que se lanza IllegalArgumentException cuando se pasa null
        assertThrows(IllegalArgumentException.class, () -> {
            validador.esPositivo(null);
        });
        
        // Verificar el mensaje de la excepción
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validador.esPositivo(null);
        });
        assertEquals("El número no puede ser nulo", exception.getMessage());
    }
    
    @Test
    public void testEsPositivoConValorValido() {
        // Verificar que funciona correctamente con un valor válido
        boolean resultado = validador.esPositivo(5);
        assertTrue(resultado);
    }
    
    @Test
    public void testEsPositivoConValorNegativo() {
        // Verificar que se lanza excepción con valor negativo
        assertThrows(IllegalArgumentException.class, () -> {
            validador.esPositivo(-5);
        });
    }
}
