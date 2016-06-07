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
public class CuentaDeCheque extends CuentaBancaria {
    private int chequesEmitidos;
    private int chequesRebotados;
    
    public CuentaDeCheque (int numeroDeCuenta, String nombre, String apellido) {
        super(numeroDeCuenta, nombre, apellido);
        super.Depositar(2000.0);
        chequesEmitidos = 0;
        chequesRebotados = 0;
    }
    
    
    
    public boolean Retirar(double cantidad) {
        boolean seEfectuoRetiro = super.Retirar(cantidad);
        if (seEfectuoRetiro == true) {
            chequesEmitidos = chequesEmitidos + 1;
        }
        else {
            chequesRebotados ++;
        }
        return seEfectuoRetiro;
    }
    public double calcularInteresPorChequesEmitidos() {
        double comision = (chequesEmitidos - 5.0) * 5.0;
        return comision;
    }
    
    public double calcularComisionPorChequesRebotados() {
        return chequesRebotados * 100.0;
    }
    /*
    public void realizarCorteMensual() {
        super.retirar(calcularComisionPorChequesEmitidos());
        super.retirar(calcualarComisionPorChequesRebotados());
        chequesEmitidos = 0;
        chequesRebotados = 0;
    }
    */
}
