
package pilasmaquinaexpenderora;

/**
 *
 * @author Didier Cauich
 */
public class Pila {
    
    private Nodo tope;
    
 public Pila(){
     tope = null;
     
 }   
    /*se crea un método
 para insertar los datos en la pila*/
 
 public void insertar(Object elemento){
     Nodo nuevo;
     nuevo = new Nodo(elemento);
     nuevo.siguiente = tope;
     tope = nuevo;
     
 }
 
 /*se ingresa un boolean, ya que nos
 indica si tendra datos o estara vacia*/
 
 public boolean pilaVacia(){
     return tope==null;
     
 }
    /*Se ingresa un método para quitar
 datos de la pila*/
 
 public Object quitar(){
     Object aux = null;
     if(!pilaVacia()){
         aux = tope.dato;
         tope = tope.siguiente;
         
     }
     return aux;
 }
 /*Método para convertir una pila en una cadena*/
 
 public String toString(){
     Nodo aux;
     aux = tope;
     String cadena;
     cadena = "";
     while(aux!=null){
         cadena = cadena + aux.dato.toString()+"";
         aux = aux.siguiente;
     }
     return cadena;
 }
 //Una vez hecho lo anterior, se puede crear el Jframe//
}
