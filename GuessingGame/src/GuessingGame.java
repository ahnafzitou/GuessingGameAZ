import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you" + " " + s);
		//System.out.println("How old are you bud?");
		boolean isNumber = false;
		while(!isNumber)
		{	
			try
			{
				System.out.println("How old are you bud?");
				input.nextInt();
				isNumber = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("That is not a number");
			}
		}
		//System.out.println("Cool, I'm also" + " " + x + " years old." );
	}
	// Hi
}
