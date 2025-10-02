package Entidades;

public class ConversorTemperatura {

    public float Celsius_a_Farenheit(float celsius){
        float f = (celsius *9/5) + 32;
        System.out.println(  celsius + " grados celsius son " + f +" grados Farenheit"+ " \n");
        return f;
    }

    public float Fahrenheit_a_Celsius(float faren){
        float c = (faren - 32 ) * 9/5;
        System.out.println( faren + " grados Farenheit son "+ c + " grados Celsius"+ " \n" );
        return c;

    }
}
