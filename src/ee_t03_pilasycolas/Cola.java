
package ee_t03_pilasycolas;
/**
 * Esta clase implementa una cola utilizando una lista ligada.
 * @author Zuleyka Guzman
 */
public class Cola<T>{
    /**
     * Este es el constructor de la clase
     * instancia una lista en la que se guardaran los datos de la cola
     */
    public Cola(){
        cola = new Ee_t03_pilasycolas<T>();
    }
    /**
     * Esta es la cola declarada como una lista
     */
    private Ee_t03_pilasycolas<T> cola;
    /**
     * Este es el get de la cola
     * @return una cola
     */
    public Ee_t03_pilasycolas getCola() {
        return cola;
    }
    /**
     * Este es el set de la cola
     * @param cola 
     */
    public void setCola(Ee_t03_pilasycolas cola) {
        this.cola = cola;
    }
    /**
     * Este metodo inserta un dato en la cola
     * @param dato 
     */
    public void insertar(T dato){
        cola.insertaFinal(dato);
    }
    /**
     * Este metodo elimina el primer dato de la cola
     * @return el dato que se eliminó
     */
    public T eliminar(){
        return cola.eliminaInicio();
    }
}
