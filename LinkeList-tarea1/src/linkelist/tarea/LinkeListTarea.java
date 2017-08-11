
package linkelist.tarea;

import java.util.LinkedList;


public class LinkeListTarea {

   
    public static void main(String[] args)
    {
//        //Creamos la Lista 
        LinkedList lista = new LinkedList();
//         
//         //Metodo addLast() llamado AgregarFinal
//         lista.addLast("2");
//         lista.addLast("3");
//         lista.addLast("4");
//         
//         //Método add() llamado AgragarFinal
//          
//         lista.add("1");
//         lista.add("0");
//         
//         //Método isEmpty() llamado EstáVacio
//         
//         if(!lista.isEmpty()){
//                // EL METODO size() DUVUELVE EL TAMAÑO DE LA LISTA
//            for (int i = 0; i < lista.size(); ++i) {
//                // EL METODO get() RECIBE UN PARAMETRO DE POSICION E IMPRIME SU VALOR
//                System.out.println("MI POSICION ES [" + i + "] " + lista.get(i)); 
//            }
//        }else{
//            System.out.println("NO HAY ELEMENTO EN LA LISTA...");
//        }
//
//         
//         //Método contains() llamado BusquedaenLinkdList
//         
//         if(lista.contains("0") == true)
//            System.out.println("EL ELEMENTO SI SE ENCUENTRA EN LA LISTA");
//        else
//             System.out.println("EL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
//        
        metodos l = new metodos();
        
        l.AgregarFinal("AAA");
        l.AgregarFinal2("BBB");
        if(l.EstáVacio() == true){
            System.out.println("si esta");
        }else
        {
            System.out.println("no esta");
        }
        l.BusquedaEnLinkedList("AAA");
        

        l.imprmirLinkedList();
        
        
       
    }
    
}
