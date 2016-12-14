import java.util.Scanner;

public class GetGPA{

	public static void main(String[] args){
		Scanner user_input=new Scanner(System.in);


		System.out.print("Please Enter a number: ");
		double number=user_input.nextDouble();

		getGpa(number);

		//System.out.println(word+" has "+a+" vowels");
	}

	public static void getGpa(double gpa){
        double credits=gpa*3;
        if (gpa==3.2){
            System.out.println("You earned enough credts: "+credits);
        }
	}
}
