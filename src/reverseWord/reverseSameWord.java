package reverseWord;

import java.util.Scanner;


public class reverseSameWord {
static String Reverse_one;
static int checkCount;
public void reverseWordInMyString(String InputString)
{
	
	
	String[] words = InputString.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
     {
        String word = words[i]; 
        String reverseWord = "";
        for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	  
	}
	Reverse_one = reversedString;
	System.out.println(reversedString+"\n");
	for (int i = 0; i < InputString.length(); i++)
    {
		if(Reverse_one.charAt(i)==InputString.charAt(i)) {
			checkCount++;
		}
		else {checkCount=0;}
		
    }
	if(checkCount==0) {System.out.println("HAYIR");}
	else {System.out.println("EVET");}
	
	
	
}
public static void main(String[] args) 
{
	System.out.println("Lütfen bir kelime giriniz: ");
	Scanner InputScanner = new Scanner(System.in);
	String InputWord = InputScanner.next();
	reverseSameWord obj = new reverseSameWord();
	obj.reverseWordInMyString(InputWord);
	
}

}

