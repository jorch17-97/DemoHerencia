/*
 * Jorge AntonioNicolas Morales
 * 15470297
 * 15 de abril de 2016
 * Programacion Orientada a Objetos
 */
package demoherencia;
import java.util.Scanner;

/**
 *
 * @author Jorge Antonio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        CuentaBancaria misAhorros = new CuentaBancaria(1, "Jorge", "Morales");
        //CuentaBancaria fechaDeNacimiento = new cliente ("17 de Agosto de 1997");
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.Depositar(1000.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.Retirar(200.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.Depositar(300.0);
        misAhorros.Depositar(400.0);
        misAhorros.Retirar(500.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
    }
    
}
