/*
Clase Hija
 */
package pojos;
import javax.swing.JOptionPane;
public class Canino extends Maskotas{//inicia clase
    //atributos
    String razaCanino;
    //constructor
    public Canino(int edad, String nombreMaskota,String razaCanino) {
        super(edad, nombreMaskota);
        this.razaCanino=razaCanino;
    }//termina constructor
    //metodos de acceso get y set
    public String getRazaCanino() {
        return razaCanino;
    }
    public void setRazaCanino(String razaCanino) {
        this.razaCanino = razaCanino;
    }
    //Metodo por aplicacion personalizado
    public void imprimirDatosCanino(){
        JOptionPane.showMessageDialog(null, "*****TIENDA MASKOTAS*****"
                                           +"\n-----------------------"
                                           +"\nEDAD MASKOTA CANINO :"+getEdad()
                                           +"\nNOMBRE MASKOTA CANINO :"+getNombreMaskota()
                                           +"\nRAZA MASKOTA CANINO:"+getRazaCanino()
                                           +"\n-----------------------"
                                           +"\nAutor: Hildeberto Tovar");
    }//termina metodo
}//termina clase
