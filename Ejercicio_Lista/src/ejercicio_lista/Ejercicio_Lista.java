package ejercicio_lista;

import java.io.*;
import java.util.Stack;

/**
 *
 * @author Administrador
 */
public class Ejercicio_Lista {

    Nodo head = null;///PRIMERA LINEA VACIA

    public void insertarAlInicio(Nodo nuevo) {
        nuevo.siguiente = head;
        head = nuevo;
    }

    public boolean IsEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
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
        if (IsEmpty()) {
            head = nuevo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
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

    public void borrarEspecifico(int indice) {

    }

    public void QuickSort() throws IOException {
        if (!IsEmpty()) {
            List izq = new List();
            List der = new List();
            Nodo pivot = head;
            Nodo temp = head.siguiente;

            while (temp != null) {
                if (temp.age < pivot.age) {
                    izq.insertarAlFinal(temp.clon());
                } else {
                    der.insertarAlFinal(temp.clon());
                }
                temp = temp.siguiente;
            }
            izq.QuickSort();
            der.QuickSort();
            pivot.siguiente = der.head;
            izq.insertarAlFinal(pivot);
            head = izq.head;
        }
    }

    public int size() {
        int cont = 0;
        Nodo temp = head;
        while (temp != null) {
            cont += 1;
            temp = temp.siguiente;
        }
        return cont;
    }

    public Nodo BusquedaBinaria(int dato) {
        Nodo temp = ;
        int mayor = listSize()-1;
        int menor = 0;
        while (menor <= mayor && menor != dato) {
            int medio = (mayor + menor) / 2;
            if ();
        }
    }

    public Nodo getNode(int indice) {
        if (size() < indice) {
            return null;
        } else {
            Nodo temp = head;
            for (int i = 0; i < indice; i++) {
                temp = temp.siguiente;
            }
            return temp;
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
        List estudiantes = new List();
        //PRIMER NODO
        estudiantes.insertarAlInicio(new Nodo("Diego", 18, 11234));
        //NODO SIGUIENTE
        estudiantes.insertarAlInicio(new Nodo("Andres", 17, 176452));
        estudiantes.insertarAlInicio(new Nodo("asda", 15, 2345));
        estudiantes.insertarAlInicio(new Nodo("asdjk", 45, 46542));
        estudiantes.insertarAlInicio(new Nodo("mhjdgrr", 13, 8973));
        estudiantes.insertarAlInicio(new Nodo("jkrebg", 35, 23452));
        estudiantes.insertarAlInicio(new Nodo("Andres", 23, 98767));
        //NODO AL FINAL
        estudiantes.insertarAlFinal(new Nodo("Damniel", 31, 133732));
        estudiantes.Imprimir();
        System.out.println("");
        System.out.println("Se Borra dato al Inicio");
        estudiantes.borrarAlInicio();
        estudiantes.Imprimir();
        System.out.println("");
        System.out.println("Se Borra Dato al Final");
        estudiantes.borrarAlFinal();
        estudiantes.Imprimir();
        System.out.println("");
        System.out.println("Quick Sort por edad:");
        estudiantes.QuickSort();
        estudiantes.Imprimir();
        System.out.println(estudiantes.size());

    }

}
