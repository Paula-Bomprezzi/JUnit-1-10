package Entidades;

public class Main {
    public static void main(String[] args) {

        System.out.println( "====MOVIMIENTOS CUENTA BANCARIA====");

        CuentaBancaria c1 = new CuentaBancaria();
        c1.depositar(500);
        c1.extraer(1000);
        c1.extraer(20);

        System.out.println( "====CONVERSIONES DE TEMPERATURA====");
        ConversorTemperatura conver1 = new ConversorTemperatura();
        conver1.Celsius_a_Farenheit(33);
        conver1.Fahrenheit_a_Celsius(152);

        System.out.println( "====PRUEBAS VALIDADOR TEXTO (EJERCICIO 3)====");
        ValidadorTexto validador = new ValidadorTexto();
        
        // Prueba 1: Procesar texto válido
        System.out.println("Prueba 1 - Texto válido:");
        try {
            String resultado = validador.procesarTexto("hola mundo");
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Prueba 2: Procesar texto nulo (debe lanzar excepción)
        System.out.println("\nPrueba 2 - Texto nulo:");
        try {
            String resultado = validador.procesarTexto(null);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }
        
        // Prueba 3: Obtener longitud de texto válido
        System.out.println("\nPrueba 3 - Longitud de texto válido:");
        try {
            int longitud = validador.obtenerLongitud("prueba");
            System.out.println("Longitud: " + longitud);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Prueba 4: Obtener longitud de texto nulo (debe lanzar excepción)
        System.out.println("\nPrueba 4 - Longitud de texto nulo:");
        try {
            int longitud = validador.obtenerLongitud(null);
            System.out.println("Longitud: " + longitud);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }
        
        // Prueba 5: Validar número positivo
        System.out.println("\nPrueba 5 - Número positivo:");
        try {
            boolean esPositivo = validador.esPositivo(5);
            System.out.println("Es positivo: " + esPositivo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Prueba 6: Validar número nulo (debe lanzar excepción)
        System.out.println("\nPrueba 6 - Número nulo:");
        try {
            boolean esPositivo = validador.esPositivo(null);
            System.out.println("Es positivo: " + esPositivo);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }
        
        // Prueba 7: Validar número negativo (debe lanzar excepción)
        System.out.println("\nPrueba 7 - Número negativo:");
        try {
            boolean esPositivo = validador.esPositivo(-5);
            System.out.println("Es positivo: " + esPositivo);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}