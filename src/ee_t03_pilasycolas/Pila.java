
package ee_t03_pilasycolas;

/**
 * Esta clase implementa una pila utilizando una lista ligada.
 * @author Zuleyka Guzman
 */
public class Pila<T>{
    /**
     * Este es el constructor de la clase
     * instancia la lista en la que se guardaran los datos de la pila
     */
    public Pila(){
        pila = new Ee_t03_pilasycolas<T>();
    }
    /**
     * Esta es la pila declarada como una lista
     */
    private Ee_t03_pilasycolas<T> pila;
    /**
     * Este es el get de la pila
     * @return pila
     */
    public Ee_t03_pilasycolas getPila() {
        return pila;
    }
    /**
     * Este es el set de la pila
     * @param pila 
     */
    public void setPila(Ee_t03_pilasycolas pila) {
        this.pila = pila;
    }
    /**
     * Este metodo inserta un dato en la pila 
     * @param dato a insertar en la pila 
     */
    public void push(T dato){
        pila.insertaFinal(dato);
    }
    /**
     * Este metodo elimina el ultimo dato de la pila
     * @return el dato que se elimino
     */
    public T pop(){
        return pila.eliminaFinal();
    }
    /**
     * Este metodo muestra el ultimo dato de la pila
     * @return el ultimo dato de la pila 
     */
    public T peek(){
        return pila.mostrarFin();
    }
}

