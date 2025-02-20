package effigo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("program is started...");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("................");
		}
		System.out.println("program is completed...");
		System.out.println("program is exited...");
	}
}
