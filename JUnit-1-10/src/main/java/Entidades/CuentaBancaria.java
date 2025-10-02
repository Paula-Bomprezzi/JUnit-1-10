package Entidades;

import lombok.Data;

@Data
public class CuentaBancaria {
    public float dinero;


    public float depositar( float deposit){
        dinero = deposit;
        System.out.println("Se ha depositado $" + deposit + " en su cuenta bancaria. Su saldo es de $"+ dinero + " \n");
    return dinero;
    }


    public float extraer(float extr){
        if(dinero > extr){
            dinero -= extr;
            System.out.println( "Se han extraido $" + extr + " de su cuenta bancaria. Su saldo es de $"+ dinero + " \n");
        }else {
            System.out.println("No tiene dinero suficiente para retirar el monto solicitado ($"+extr+"). Su saldo actual es de $" + dinero+ " \n");
        }
        return dinero;
    }

}
