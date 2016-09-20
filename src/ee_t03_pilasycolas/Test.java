
package ee_t03_pilasycolas;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Zuleyka Guzman
 */
public class Test<T>{
    /**
     * 
     */
    private static boolean ban;
    /**
     * 
     */
    private static Pila<Integer> p;
    /**
     * 
     */
    private static Cola<Integer> c;
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        try{
            String archivo = args[0];

            File f = new File(archivo);   
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
                
            String linea;
            
            int cont=0;
            Integer opcion;
            while(sc.hasNext()){
                
                linea = sc.nextLine();
                
                opcion = Integer.parseInt(String.valueOf(linea.charAt(0)));

                System.out.println(opcion);
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
             System.out.println(exc.toString());
        }

    }
}
