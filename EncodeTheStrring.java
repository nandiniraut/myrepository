// Java implementation of the above approach:
public class EncodeDecode {

	static final int MAX = 26;

	// Function to return the encrypted string
	static String encryptStr(String str, int n, int x)
	{

		// Reduce x because rotation of
		// length 26 is unnecessary
		x = x % MAX;
		char arr[] = str.toCharArray();


	// Driver code
	public static void main(String[] args)
	{
		String s = "abcda";
		int n = s.length();
		int x = 3;
		System.out.println(encryptStr(s, n, x));
	}
}
