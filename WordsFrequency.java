import java.util.*;
public class WordsFrequency
{
    public static void main(String args[]) {
        System.out.println("Program by Nandini Raut, roll number R171219019");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String word= in.nextLine();
        word= word.toUpperCase();
        int len = word.length();
        
        StringTokenizer string = new StringTokenizer(word.substring(0, len - 1));
        int countofwords = string.countTokens();
        String wordArr[] = new String[countofwords];

        for (int x = 0; x < countofwords; x++) {
            wordArr[x] = string.nextToken();
       }
        for (int x = 0; x < countofwords - 1; x++) {
            for (int y = 0; y < countofwords - x - 1; y++) {
                if (wordArr[y].compareTo(wordArr[y+1]) > 0) {
                    String a = wordArr[y];
                    wordArr[y] = wordArr[y+1];
                    wordArr[y+1] = a;
                }
            }
        }
        System.out.println(); 
        System.out.println("Word\t\tWord Count");
        int count = 0;
        for (int x = 0; x < wordCount - 1; x++) {
            count++;
            if (!wordArr[x].equals(wordArr[x + 1])) {
                System.out.println(wordArr[x] + "\a\a" + count);
                count = 0;
            }
        }
        count++;
        System.out.println(wordArr[countofwords - 1] + "\a\a" + count);
    }
}