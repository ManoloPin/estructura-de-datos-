package list_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Administrador
 */
public class Node {

    public String name;
    public int age;
    public int ID;

    public void List() {
        List students = new ArrayList();

        students.insertAtBegin(new Node("Paula", 22, 565));
        students.insertAtBegin(new Node("Raul", 22, 565));
        students.insertAtBegin(new Node("Paula", 22, 565));
        students.insertAtBegin(new Node("Paula", 22, 565));
        students.insertAtBegin(new Node("Paula", 22, 565));

        //students.print;
        pre.next = null;
        temp = null;
        System.gc();
    }

    public void deleteAtIndex(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp = temp.next;
        Node toDelete = temp.next;
        temp.next = toDelete.next;
        toDelete = null;
        System.gc();
    }

    public void reverse() {
        Stack tempList = new Stack();
        Node temp = head;

        while (temp != null) {

            System.out.println(temp.toString());
            tempList.push((Node) temp.clone());
            temp = temp.next;
        }
        while (!tempList.isEmpty()) {
            System.out.println(tempList.pop());
        }
        head = tempList.head;
    }

    public void print() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public String toString() {
        return "Name " + this.name + "\tAge " + this.age + "\tID " + this.ID + "\n";
    }

    public Node QuickSort() {
      List leftSet = new List();
      List rightSet = new List();
      
      Node temp = head;
      Node pivot = temp;
      
      leftSet.inserAtEnd(pivod);
      leftSet.inserAtEnd(rightSet.head);
      return null;
    }

    public static void main(String[] args) {

    }
}
