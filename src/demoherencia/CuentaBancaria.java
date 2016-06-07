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
    private Cliente cliente;
    private double saldo;
    
    public CuentaBancaria (int numeroDeCuenta, String nombre, String apellido) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = new Cliente (nombre, apellido);
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
    return saldo;
    }
    
    private void getNumeroDeCuenta (int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    private void getCliente (String cliente) {
        //this.cliente = cliente;
    }
    
    public boolean Depositar (double cantidad) {
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
    
    public boolean Retirar (double cantidad) {
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