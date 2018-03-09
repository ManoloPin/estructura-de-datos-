package uri_1069;

import java.util.Scanner;

public class Uri_1069 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try
		{
			int cases = Integer.parseInt(tec.nextLine());
			String input;
			int counter, temp;
			
			for(int i = 0; i < cases; i++)
			{
				input = tec.nextLine();
				temp = 0; counter = 0;
				
				for(int j = 0; j < input.length(); j++)
				{
					if(input.charAt(j) == '<')
						temp += 1;
					
					if(input.charAt(j) == '>')
						if(temp > 0)
						{
							temp -= 1;
							counter += 1;
						}
				}
				
				System.out.println(counter);
			}
		}
		catch(Exception ex) {}
	}

}
