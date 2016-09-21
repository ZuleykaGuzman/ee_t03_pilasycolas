
package ee_t03_pilasycolas;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Esta clase lee un archivo que se le pasa como parametro al metodo main de la clase
 * e implementa una pila o una cola segun los datos del archivo
 * @author Zuleyka Guzman
 */
public class Test<T>{
    /**
     * Esta variable es una bandera que se pone en true si el primer dato del archivo es 0 y se instancia una pila
     * y se pone en false si el primer dato del archivo es un 1 y se instancia una cola
     */
    private static boolean ban;
    /**
     * En esta linea se declara una variable de tipo pila para poder utilizarla en el metodo main de la clase
     * y hacer operaciones con la pila segun los datos del archivo
     */
    private static Pila<Integer> p;
    /**
     * En esta linea se declara una variable de tipo cola para poder utilizarla en el metodo main de la clase
     * y hacer operaciones con la la misma segun los datos del archivo
     */
    private static Cola<Integer> c;
    /**
     * Este metodo lee un archivo y segun el primer elemento del archivo crea una pila o una cola
     * Las siguientes lineas del archivo son instrucciones para la pila y la cola
     * en la pila hace un push, peek  o pop segun los datos de la linea
     * y en la cola inserta o elimina segun los datos de la linea
     * @param args es el archivo a leer
     */
    public static void main(String[] args){
      for(int i=0; i<args.length; i++){  
        try{
            
            String archivo = args[i];

            File f = new File(archivo);   
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
                
            String linea;
            
            int cont=0;
            Integer opcion;
            while(sc.hasNext()){
                
                linea = sc.nextLine();

                opcion = Integer.parseInt(String.valueOf(linea.charAt(0)));

               if(cont==0){
                   switch(opcion){
                       case 0:
                           p = new Pila<Integer>();
                           ban=true;
                           break;
                           
                       case 1:
                           c = new Cola<Integer>();
                           ban=false;
                   }
                
               }    
               else{
                   if(ban==true){
                        switch(opcion){
                            case 0:
                                Integer dato = Integer.parseInt(String.valueOf(linea.charAt(1)));
                                
                                p.push(dato);
                                break;
                                
                            case 1:
                                System.out.println(p.pop());
                                break;
                                
                            case 2:  
                                System.out.println(p.peek());
                                break;
                        }
                   }
                   else{
                       switch(opcion){
                            case 0:
                                Integer dato = Integer.parseInt(String.valueOf(linea.charAt(1)));
                                c.insertar(dato);
                                break;
                                
                            case 1:
                                System.out.println(c.eliminar());
                                break;
                        }
                   }
                }
            cont++;
               
        }
            fr.close();
            sc.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
             System.out.println(exc.toString());
        }
    }

    }
}
