package linkelist.tarea;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class metodos {

    LinkedList listaN = new LinkedList();

    public void AgregarFinal(String lista) {
        listaN.add(lista);
    }

    public void AgregarFinal2(String lista) {
        listaN.addLast(lista);
    }

    public boolean EstáVacio() {
        boolean bandera;
        if (listaN.isEmpty()) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    public void BusquedaEnLinkedList(String lista) {
        if (listaN.contains(lista) == true) {
            JOptionPane.showMessageDialog(null, "EL ELEMENTO SI SE ENCUENTRA EN LA LISTA");
        } else {
            JOptionPane.showMessageDialog(null, "EL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
        }
    }

    public void imprmirLinkedList() {
        if (!listaN.isEmpty()) {
            // EL METODO size() DUVUELVE EL TAMAÑO DE LA LISTA
            for (int i = 0; i < listaN.size(); ++i) {
                // EL METODO get() RECIBE UN PARAMETRO DE POSICION E IMPRIME SU VALOR
                princioarl.TXTimprimir.setText(princioarl.TXTimprimir.getText() + listaN.get(i) + "|");
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY ELEMENTO EN LA LISTA...");
        }
    }
}
