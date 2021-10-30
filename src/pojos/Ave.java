/*
Clase Hija
 */
package pojos;
import javax.swing.JOptionPane;

public class Ave  extends Maskotas{//inicia clase
    //atributo
    String color;
    //constructor

    public Ave(int edad, String nombreMaskota,String color) {
        super(edad, nombreMaskota);
        this.color=color;
    }//termina cosntructor
    
    //metodos de acceso get y set

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    //Metodo por aplicacion personalizado
    public void imprimirDatosAve(){
        JOptionPane.showMessageDialog(null, "*****TIENDA MASKOTAS*****"
                                           +"\n-----------------------"
                                           +"\nEDAD MASKOTA AVE :"+getEdad()
                                           +"\nNOMBRE MASKOTA AVE:"+getNombreMaskota()
                                           +"\nCOLOR MASKOTA AVE :"+getColor()
                                           +"\n-----------------------"
                                           +"\nAutor: Hildeberto Tovar");
    }//termina metodo 
    
}//termina clase
