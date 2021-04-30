import java.util.Scanner;

public class encodedecode {
	public static void main(String[] args) {
		
              System.out.println("Code by Nandini Raut, roll number R171219019");
		String str;
		Scanner sc = new Scanner(System.in);
		String string;
		System.out.println("Enter the string: ");
		string = sc.next();
		Scanner e = new Scanner(System.in);
		int Encounter;
		System.out.println("Enter the encounter value ");
		Encounter = e.nextInt();
		//For changing the string using encounter value
		for(int i=0 ; i<string.length(); i++)
		{
			int ascii = string.charAt(i);
			ascii = ascii+Encounter;
			if(ascii>122)
			{
				ascii = ascii - 122;
				ascii = ascii+96;
			}
			char ascii1 = (char)ascii;
			System.out.println("Updated String: "+ascii1);
		}
	}
}
