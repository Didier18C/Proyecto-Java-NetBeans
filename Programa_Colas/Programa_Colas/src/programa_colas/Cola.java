
package programa_colas;

/**
 *
 * @author Didier Cauich
 */
public class Cola {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public Cola(){
        primero = null;
        ultimo = null;
        
    }
    
    /*Método para comprobar si la cola esta vacia*/
    
    public boolean ColaVacia(){
    return  primero == null;
    
}
    public void insertar(Object elemento){
        Nodo nuevo;
        nuevo = new Nodo (elemento);
        if (primero == null){
            primero = nuevo;
            ultimo = nuevo;
            
            
        }
        else{
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            
        }
       
    }
     /*Método para quitar un dato de una cola*/
        
        public Object quitar(){
            Object aux = null;
            if(!ColaVacia()){
                aux = primero.dato;
                primero = (Nodo) primero.siguiente;
                if(primero ==null){
                    ultimo = null;
                    
                }
            }
            return aux;
            
        }
        public String toString(){
           Nodo aux;
           aux = primero;
           String cadena;
           cadena = "";
           while(aux != null){
            cadena = cadena + aux.dato.toString()+"\n";
            aux = (Nodo) aux.siguiente;
            
        }
           return cadena;
    }
}
        
        
            

