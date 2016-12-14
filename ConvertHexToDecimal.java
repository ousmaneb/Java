import java.util.Scanner;

public class ConvertHexToDecimal{
	public static void main(String[] args){
		Scanner user_input=new Scanner(System.in);

		System.out.println("Please Enter an integer number: ");
		
		String number;
		number=user_input.next();
		int decimalNumber=Integer.parseInt(number, 16);

		System.out.println("Hexadecimal number converted to decimal");
		System.out.println("Decimal number is: "+decimalNumber);
	}
}
