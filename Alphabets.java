# Alphabets
import java.util.Scanner;
public class Alphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char : ");
		char ch=sc.nextLine().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
        System.out.println("It is an alphabet");	
        }
        else
        {
        	System.out.println("It is not an alphabet");
        }
	}

}
