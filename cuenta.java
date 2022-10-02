import java.util.Scanner;

public class cuenta {
private double cantidad;
private int numeroCuenta;
private persona cliente;

public int getNumeroCuenta() {
    return this.numeroCuenta;
}

public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}

public persona getCliente() {
    return this.cliente;
}

public void setCliente(persona cliente) {
    this.cliente = cliente;
}

public void setCantidad(double cantidad){
 this.cantidad = cantidad;
}

public cuenta(int numeroCuenta,persona cliente){
setCliente(cliente);
setNumeroCuenta(numeroCuenta);
}

public cuenta(int numeroCuenta,persona cliente,double cantidad){
    setCliente(cliente);
    setNumeroCuenta(numeroCuenta);
    setCantidad(cantidad);
}



public double getCantidad() {
    return cantidad;
}


public void ingresar(double cantidad){
    if(cantidad > 0){
        this.cantidad += cantidad;
    }
}

public double retirar(double cantidad){
    if(this.cantidad-cantidad<0){
     return 0;
    }else{
     this.cantidad -= cantidad;
     return this.cantidad; 
    }
}

public String actualizarSaldo(){
    return "el saldo actual es: " + this.cantidad;
}



}
