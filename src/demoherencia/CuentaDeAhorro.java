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
public class CuentaDeAhorro {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
    public CuentaDeAhorro (int numeroDeCuenta, String cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.tasaDeInteres = 0.25;
        this.comisionPorSaldo = 50.0;
    }
    
    private void NumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    private void Cliente (String cliente) {
        this.cliente = cliente;
    }
    
    public boolean seRealizoDeposito (double cantidad) {
        boolean siDepositar = false;
        if (cantidad < this.saldo) {
            siDepositar = true;
        }
        return siDepositar;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public boolean seRealizoRetiro(double cantidad) {
        boolean siRetirar = false;
        if (cantidad < this.saldo) {
            siRetirar = true;
        }
        return siRetirar;
    }
    
    public double comisionPorSaldo() {
        double comisionPorSaldo = 0;
        if (saldo < 1000.0) {
            comisionPorSaldo = 50;
        }
        else {
            comisionPorSaldo = 0.0;
        }
        return comisionPorSaldo;
    }
    
    public double tasaDeInteres() {
        double interes = 0;
        interes = (saldo * this.tasaDeInteres) / 100.0;
        return interes;
    }
    
    public void corteMensual() {
        this.saldo = (saldo + this.tasaDeInteres()) - this.comisionPorSaldo();
    }
}    
    /*
    
    public boolean depositar(double cantidad) {
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
    
    public boolean retirar(double cantidad) {
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
    
    /*
    public double calcularInteres() {
        
    }
    
    public double calcularComisionPorSaldo() {
    
    }
    
    public void corteMensual() {
        
    }
    */
    