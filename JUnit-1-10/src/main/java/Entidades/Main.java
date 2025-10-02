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
    }
}