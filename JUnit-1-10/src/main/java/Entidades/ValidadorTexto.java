package Entidades;

public class ValidadorTexto {
    
    public String procesarTexto(String texto) throws IllegalArgumentException {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        return texto.toUpperCase();
    }
    
    public int obtenerLongitud(String texto) throws NullPointerException {
        if (texto == null) {
            throw new NullPointerException("No se puede calcular la longitud de un texto nulo");
        }
        return texto.length();
    }
    
    public boolean esPositivo(Integer numero) throws IllegalArgumentException {
        if (numero == null) {
            throw new IllegalArgumentException("El número no puede ser nulo");
        }
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser positivo");
        }
        return true;
    }
}
