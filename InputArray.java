import java.util.Scanner;

class InputArray{
	static int [] input(){
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Please enter 5 values: ");


		for (int i=0; i<numbers.length; i++){
			numbers[i]=in.nextInt();
		}
		return numbers;
	}

	static void output(int[] numbers){
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i]);
		}
		System.out.println();
	}


	public static void main(String[] args){
		int[] numbers = input();
		//input();
		output(numbers);
	}
}