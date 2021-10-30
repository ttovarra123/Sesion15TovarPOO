
package pojos;

import javax.swing.JOptionPane;

public class VariablesObjetoPrimitivas {//inicia clase
    
          public static void main(String[] args) {//inicia main
        
              //variable Objeto para capturar primitivas entero int,byte,long
              String ventanaEntero=JOptionPane.showInputDialog("Captura entero :");
              
              int enteroInt=Integer.parseInt(ventanaEntero);//guarda variable entero regular int
              byte enteroByte=Byte.parseByte(ventanaEntero);//guarda variable entero corto byte
              long enteroLargo=Long.parseLong(ventanaEntero);//guarda variable entero largo long
              
               //variable Objeto para capturar primitivas float,double
              String ventanaDecimal=JOptionPane.showInputDialog("Captura Decimal :");
              float decimalFloat=Float.parseFloat(ventanaDecimal);//guarda variable decimal punto flotante
              double decimalDouble=Double.parseDouble(ventanaDecimal);//guarda variable decimal doble presicion
              
               //variable Objeto para capturar primitivas float,double
              String ventanaChar=JOptionPane.showInputDialog("Captura UN caracter :");
              char caracter=ventanaChar.charAt(0);//guarda un solo caracter
              
              //salida
              JOptionPane.showMessageDialog(null, "\nEjercicio variables Objeto-Primivivas Tovar\n"
                                                  +"\nEntero regular int:"+enteroInt
                                                  +"\nEntero corto byte:"+enteroByte
                                                  +"\nEntero largo long:"+enteroLargo 
                                                  +"\n------------------------------"
                                                  +"\ndecimal punto flotante:"+decimalFloat
                                                  +"\ndecimal doble presicion:"+decimalDouble
                                                  +"\n------------------------------"
                                                  +"\nVariable  caracter: "+caracter
                                                  +"\n------------------------------"
                                                  +"\nAutor: Hildeberto Tovar Fecha: 26-03-2021"
                                                  );
          }//termina main
}//termina clase
