package lists;

import java.io.*;
import java.util.Stack;

/**
 *
 * @author Administrador
 */
public class Lists {

    Nodo head = null;///PRIMERA LINEA VACIA

    public void insertarAlInicio(Nodo nuevo) {
        nuevo.siguiente = head;
        head = nuevo;
    }

    public boolean IsEmpty() {
        return head == null;//OPERADOR TERNARIO
    }

    public void Imprimir() throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        Nodo temp = head;
        while (temp != null) {
            b.write(temp.pasarAString());
            temp = temp.siguiente;
        }
        b.flush();

    }

    public void insertarAlFinal(Nodo nuevo) {
        Nodo temp = head;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente = nuevo;
    }

    public void borrarAlInicio() {
        Nodo temp = head;
        head = head.siguiente;
        temp = null;
        System.gc();
    }

    public void borrarAlFinal() {
        Nodo pre = head;
        Nodo temp;
        while (pre.siguiente.siguiente != null) {
            pre = pre.siguiente;
        }
        temp = pre.siguiente;
        pre.siguiente = null;
        temp = null;
        System.gc();
    }

    public void deleteAtIndex(int index) {
        Nodo temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.siguiente;
        }
        temp = temp.siguiente;
        Nodo toDelete = temp.siguiente;
        temp.siguiente = toDelete.siguiente;
        toDelete = null;
        System.gc();
    }

    public void reverse() {
        Stack tempList = new Stack();
        Nodo temp = head;

        while (temp != null) {

            System.out.println(temp.toString());
            tempList.push((Nodo) temp.clone());
            temp = temp.siguiente;
        }
        while (!tempList.isEmpty()) {
            System.out.println(tempList.pop());
        }
        head = tempList.head;
    }

    public void QuickSort() {
        Lists leftList = new Lists();
        Lists rightList = new Lists();

        Nodo pivot = head;
        Nodo temp = head.siguiente;

        while (temp != null) {
            if (temp.value < pivot.value) {
                leftList.insertarAlFinal(temp.clone());
            } else {
                rightList.insertarAlFinal(temp.clone());
            }
            temp = temp.siguiente;
        }
        leftList.QuickSort();
        System.out.println();
        leftList.QuickSort();
        pivot.siguiente = rightList.head;
        leftList.insertarAlFinal(pivot);
        head = leftList.head;
    }

    public Nodo getInfo(int index) {

        if (listSize() < index) {
            return null;
        } else {
            Nodo temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.siguiente;
            }
            return temp;
        }
    }
public Nodo binarySearch(){
    int max = listSize()-1, min = 0;
    int modulo = (max + min)/2;
    
    while(){
        
    }
}
    public int listSize() {

        int counter = 0;
        Nodo temp = head;

        while (temp != null) {
            counter += 1;
            temp = temp.siguiente;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        Lists estudiantes = new Lists();
        //PRIMER NODO
        estudiantes.insertarAlInicio(new Nodo("Diego", 18, 11234));
        //NODO SIGUIENTE
        estudiantes.insertarAlInicio(new Nodo("Andres", 17, 176452));
        estudiantes.insertarAlInicio(new Nodo("Alegandro", 15, 2345));
        estudiantes.insertarAlInicio(new Nodo("Michael", 45, 46542));
        estudiantes.insertarAlInicio(new Nodo("Jorge", 13, 8973));
        estudiantes.insertarAlInicio(new Nodo("Esteban", 35, 23452));
        estudiantes.insertarAlInicio(new Nodo("Julio", 23, 98767));
        //NODO AL FINAL
        estudiantes.insertarAlFinal(new Nodo("Damniel", 31, 133732));
        estudiantes.Imprimir();
        System.out.print("");
        estudiantes.borrarAlInicio();
        estudiantes.Imprimir();
        System.out.print("");
        estudiantes.borrarAlFinal();
        estudiantes.Imprimir();
        System.out.print("");
    }
}
