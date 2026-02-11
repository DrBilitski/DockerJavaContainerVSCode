import java.util.Scanner;
public class Demo
{
	public static void main(String [] args)
	{
		int num;
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("I love Pep 9.");
		System.out.println("Enter favorite int");
		num = scanner.nextInt();
		System.out.println("You would not believe it.  But my faviorite number is " + (num+1) );
		scanner.close();
		
	}
}
