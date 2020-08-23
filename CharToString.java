import java.lang.*;
import java.util.Scanner;
class CharToString 
{
	public void method1(char ch)
	{
		String str1 =Character.toString(ch);
		System.out.println(str1.getClass().getSimpleName()+ " = "+ str1);


	}
	public void method2(char ch)
	{
		String str2 = String.valueOf(ch);
		System.out.println(str2.getClass().getSimpleName()+ " = "+str2);

	}
	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Hello convert your char to string ");

		System.out.println("Enter a character :");
		char c = scan.next().charAt(0);
		

		CharToString cts = new CharToString();
		cts.method1(c);
		cts.method2(c);

	}
}
