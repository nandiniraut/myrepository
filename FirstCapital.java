
 public class FirstCapital {
     public static void main(String[] args){
         System.out.println("Program by Nandini Raut, roll number R171219019");
	 Scanner in = new Scanner(System.in);
         System.out.print("Enter your sentence");
	 String sentence = in.nextLine();
	 String struppercase = ""; 
         Scanner sentenceScan = new Scanner(sentence); 
         while(sentenceScan.hasNext()) {
             String word = sentenceScan.next(); 
             struppercase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
      System.out.println(struppercase.trim()); 
    }
}
