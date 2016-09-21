
package ee_t03_pilasycolas;
/**
 * Esta clase implementa una lista ligada la cual sera utiliza para crear una pila y una cola
 * @author Zuleyka Guzman
 */
public class Ee_t03_pilasycolas<T>{
     /**
     * Este es el constructor de la clase
     * Inicializa la varible inicio en null
     */
    public Ee_t03_pilasycolas(){
        inicio=null;
    }
    /**
     * Esta variable res es un auxiliar para almacenar un dato a retornarlo en los 
     * metodos eliminaInicio y eliminaFinal utilizados en la clase Cola y Pila respectivamente.
     */
    private T res;
    /**
     * Esta es una variable auxiliar utilizada en el metodo elimina final
     */
    private Nodo<T> a;
    /**
     * Este es el inicio de la lista
     */
    private Nodo<T> inicio;
    /**
     * Este es el get de inicio
     * @return un dato de tipo Nodo
     */
    public Nodo<T> getInicio() {
        return inicio;
    }
    /**
     * Este es el set de inicio
     * @param inicio 
     */
    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }
    /**
     * Este metodo elimina el primer nodo de la lista.
     * Este metodo sera utilizado en la clase Cola para eliminar datos en la cola
     * @return el dato que se elimino de la lista
     */
    public T eliminaInicio(){
        Nodo<T> aux=inicio;
        
        if(inicio.getSiguiente()==null){
            res = inicio.getDato();
            inicio=null;
        }
        else{
            res = aux.getDato();
            aux=inicio.getSiguiente();
        }
        inicio=null;
        inicio=aux;
        return res;
    }

    /**
     * Este metodo agrega un nodo al final de la lista,
     * sera utilizado en el metodo push() de la clase Pila 
     * y en el meodo insertar de la clase Cola
     * @param dato 
     */
    public void insertaFinal(T dato){
        if(inicio == null){
            Nodo<T> var = new Nodo<T>(dato); 
            var.setSiguiente(inicio);
            inicio = var;
        }
        else{
            Nodo<T> aux=inicio;
        
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            Nodo<T> a = new Nodo<T>(dato); 
            aux.setSiguiente(a);
        }
    }
    /**
     * Este metodo elimina el nodo que se encuentra al final de la lista,
     * sera utilizado en el metodo pop() de la clase Pila 
     * @return el dato que se elimino de la lista
     */
    public T eliminaFinal(){
        Nodo<T> aux = inicio;
        
        if(inicio.getSiguiente()==null){
            res=inicio.getDato();
            inicio=null;
        }
        else{
            while(aux.getSiguiente() != null){
                a = aux;
                aux = aux.getSiguiente();
                res = aux.getDato();
            }
            a.setSiguiente(null);
        }
        aux=null;
        return res;
    }
    /**
     * Este metodo muestra el elemento final de la lista,
     * es utilizado en el metodo peek de la clase pila
     * @return el dato que se encuentra al final de la lista
     */
      public T mostrarFin(){
        Nodo<T> aux = inicio;
        
        if(inicio.getSiguiente()==null){
            return inicio.getDato();
        }
        else{
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
                res = aux.getDato();
            }
        }
        return res;
      }
}
