import java.util.Scanner;
public class encodedecode {
	public static void main(String[] args) {
		String firststring;
                String string;
                string = sc.next();
                int encntr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter encounter Value: ");
		encntr = scan.nextInt();
		for(int x=0 ; x<string.length(); x++)
		{
			int a = string.charAt(x);
			a = a+encntr;
			if(a>122)
			{
				a = a - 122;
				a = a+96;
			}
			char a1 = (char)a;
			System.out.println("Updated String: "+a1);
		}
	}
}
