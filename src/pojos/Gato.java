/*
Clase Hija
 */
package pojos;

import javax.swing.JOptionPane;
public class Gato extends Maskotas{
    
    //atributos
    String alimento;
    
    //constructor
    public Gato(int edad, String nombreMaskota,String alimento) {
        super(edad, nombreMaskota);
        this.alimento=alimento;
    }//termina constructor   
    //metodos de acceso get y set
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
     //Metodo por aplicacion personalizado
    public void imprimirDatosGato(){
        JOptionPane.showMessageDialog(null, "*****TIENDA MASKOTAS*****"
                                           +"\n-----------------------"
                                           +"\nEDAD MASKOTA GATO :"+getEdad()
                                           +"\nNOMBRE MASKOTA GATO:"+getNombreMaskota()
                                           +"\nALIMENTO MASKOTA GATO :"+getAlimento()
                                           +"\n-----------------------"
                                           +"\nAutor: Hildeberto Tovar");
    }//termina metodo 
}
