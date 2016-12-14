import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args){
		Scanner user_input=new Scanner(System.in);

		String word;

		System.out.print("Please Enter a word: ");
		word=user_input.next();

		String a =reverse_Strings(word);

		System.out.println("The reverse of "+word+" is "+a);
	}

	public static String reverse_Strings(String str){
		String rev=" ";
		for (int i=str.length()-1; i>=0; i--){
			rev=rev+str.charAt(i);
			rev=rev.toLowerCase();
		}

		return rev;
	}
}