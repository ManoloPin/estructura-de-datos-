
package lists;

/**
 *
 * @author Administrador
 */
public class Nodo {
    public String name;
	public int age;
	public int id;
	
	public Nodo() {
		
	}
	public Nodo siguiente; ///EL PUNTERO!!!!!!
	//ESTE ES EL BERRACO NODO!!!!!!!!!
	public Nodo(String name, int age, int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	
	public String pasarAString() {
		return "\nName "+this.name+" \nAge"+this.age+"\nid "+this.id;
	}
}
