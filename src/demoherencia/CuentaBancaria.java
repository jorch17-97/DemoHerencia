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
public class CuentaBancaria {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, String cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
    return saldo;
    }
    
    private void NumeroDeCuenta (int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    private void clinete (String cliente) {
        this.cliente = cliente;
    }
    
    
    public boolean depositar (double cantidad) {
        boolean seRealizoDeposito;
        if (cantidad > 0.0) {
            saldo = saldo + cantidad;
            seRealizoDeposito = true;
        }
        else {
            seRealizoDeposito = false;
        }
        return seRealizoDeposito;
    }
    
    public boolean retirar (double cantidad) {
        boolean seRealizoRetiro;
        if (cantidad <= getSaldo()) {
            saldo = saldo - cantidad;
            seRealizoRetiro = true;
        }
        else {
            seRealizoRetiro = false;
        }
        return seRealizoRetiro;
    }
    
}
