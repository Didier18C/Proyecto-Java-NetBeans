
package pilasmaquinaexpenderora;

/**
 *
 * @author Didier Cauich
 */
public class Nodo {
    
    //Se declara los nodos//
    
    Object dato;
    Nodo siguiente;
    
    //Se hace un método constructor//
    public Nodo (Object x){
        
        // y se insertan los datos//
        
        dato = x;
        siguiente = null;
    }
}
