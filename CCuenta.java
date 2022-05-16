/**
* @author Rafael Burón Castro
* @version 1.0
* 
*/

package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public void asignarNombre(String nom) {
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double estado() {
        return saldo;
    }
	
	public String obtenerCuenta() {
        return cuenta;
    }
/**
* Devuelve el saldo de la cuenta una vez ingresado el dinero ingresado y
  en el caso de intentar ingresar una cantidad negativa lanza una excepción.
* @param cantidad dinero a ingresar en la cuenta.
* @throws java.lang.Exception
*/
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }
/**
* Devuelve el saldo de la cuenta una vez retirado el dinero y en el caso
  de intentar retirar una cantidad negativa o una cantidad superior al saldo
  disponible de la cuenta lanza sus correspondientes excepciónes.
* @param cantidad dinero a retirar de la cuenta.
* @throws java.lang.Exception
*/
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
   /**
* Getter.
* @return nombre: nombre del titular de la cuenta.
*/
    public String getNombre() {
        return nombre;
    }
/**
* Setter.Asigna el nombre del titular de la cuenta al atributo nombre.
* @param nombre
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
* Getter.
* @return cuenta: número de la cuenta.
*/
    public String getCuenta() {
        return cuenta;
    }
/**
* Setter.Asigna el número de cuenta de la cuenta al atributo cuenta.
* @param cuenta
*/
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/**
* Getter.
* @return saldo: saldo de la cuenta.
*/
    public double getSaldo() {
        return saldo;
    }
/**
* Setter.Asigna el saldo de la cuenta al atributo saldo.
* @param saldo
*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
* Getter.
* @return tipoInteres: tipo de interés.
*/
    public double getTipoInterés() {
        return tipoInterés;
    }
/**
* Setter.Asigna el tipo de interes al atributo tipoInteres.
* @param tipoInterés
*/
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
