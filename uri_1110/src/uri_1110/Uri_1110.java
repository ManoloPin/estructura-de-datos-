package uri_1110;
import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class Uri_1110 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		
		try
		{
			int number = Integer.parseInt(tec.nextLine());
			
			while(number != 0)
			{
				Vector<Integer> deck = new Vector<Integer>();
				;
				for(int i = 0; i < number; i++) {
					deck.add(i + 1);
				}	
				System.out.println("Discarded cards: ");
				
				while(deck.size() >= 2)
				{
					System.out.println( deck.get(0)+" ");
					deck.remove(0);
					deck.add( deck.get(0) );
					deck.remove(0);
				}
				System.out.println("Remaining card: ");
				
				
				//bw.flush();
				
				number = Integer.parseInt(tec.nextLine());
			}
			
		}
		catch(Exception ex) {}
	}

}
