/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Jorge Antonio
 */
public class CuentaDeCheque {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private int contador;
    
    public CuentaDeCheque (int numeroDeCuenta, String cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = 2000.0;
        this.contador = 0;
    }
    
    public double getSaldo() {
    return saldo;
    }
    
    public boolean depositar(double cantidad) {
        boolean siDepositar = false;
        if (cantidad > 0.0) {
            siDepositar = true;
        }
        return siDepositar;
    }
    
    public boolean Retirar(double cantidad) {
        boolean siRetirar = false;
        if (cantidad < this.saldo) {
            siRetirar = true;
        }
        return siRetirar;
    }
    
}
