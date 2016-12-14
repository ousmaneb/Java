import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner user_input = new Scanner (System.in);

		String word;
		System.out.print("Please Enter a Word: ");
		Boolean a=false;
		word=user_input.next();
		a = palind(word);

		if (a==true)
			System.out.println(word+" is a palindrome");
		else
			System.out.println(word+" is not a palindrome");

	}

	public static Boolean palind(String str){
		Boolean check=false;
		str=str.toLowerCase();

		for (int i=0, j=str.length()-1; i<str.length(); i++, j--){
			if(i<j){
				if (str.charAt(i) != str.charAt(j)){
					return false;
				}
			}

			else {return true;}
		}
		return check;

	}


}