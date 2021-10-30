/*
Clase padre
 */
package pojos;
public class Maskotas {//inicia clase
    //atributos
    int edad;
    String nombreMaskota;
    //Constructor
    public Maskotas(int edad, String nombreMaskota) {
        this.edad = edad;
        this.nombreMaskota = nombreMaskota;
    }//termina constructor 
    //metodos de acceso get, set
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombreMaskota() {
        return nombreMaskota;
    }
    public void setNombreMaskota(String nombreMaskota) {
        this.nombreMaskota = nombreMaskota;
    }
}//termina clase
