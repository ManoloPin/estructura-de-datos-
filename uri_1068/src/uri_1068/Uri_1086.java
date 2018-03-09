package uri_1068;

import java.util.Scanner;

public class Uri_1086 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
	
		try
		{
			String input;
			input = tec.nextLine();
			
			while(!input.equals(""))
			{
				int counter = 0;
			     
				for(int i = 0; i < input.length(); i++)
				{
					if(input.charAt(i) == '(')
						counter += 1;
					
					if(input.charAt(i) == ')')
						if(counter > 0)
							counter -= 1;
						else
						{
							counter = -1;
							break;
						}	
				}
				if(counter == 0) {
					System.out.println("correct");
				}	
				else {
					System.out.println("incorrect");
				}
				input = tec.nextLine();
			}
		}
		catch(Exception ex) {}
	}
}
