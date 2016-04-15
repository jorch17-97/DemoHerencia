/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        System.out.println("Hola bien venido, que accion desea realizar");
            System.out.println("1 = Cuenta Bancaria");
            System.out.println("2 = Cuenta de Ahorro");
            System.out.println("3 = Cuenta de Cheques");
            int cuenta = entrada.nextInt();
           
        if (cuenta == 1){
            
        }
        
        CuentaBancaria misAhorros = new CuentaBancaria(1, "Jorge");
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.retirar(200.0);
        System.out.println("Saldo: " + misAhorros.getSaldo());
        misAhorros.depositar(300.0);
        misAhorros.depositar(400.0);
        misAhorros.retirar(500.0);
    }
    
}
