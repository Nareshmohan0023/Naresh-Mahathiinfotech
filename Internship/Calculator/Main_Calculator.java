package Calculator;

import java.util.Scanner;

public class Main_Calculator {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operation calculator = new Operation();
		System.out.println("Welcome to Calculator App");
		char exit='y';
		do {
			System.out.println("1.Add 2.Subtract 3.Division 4.Multiplication");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Addition of the given numbers is:" + calculator.add(Services.fetching_Data(sc)));
				break;
			case 2:
				System.out.println("Addition of the given numbers is:" + calculator.subtract(Services.fetching_Data(sc)));
				break;
			case 3:
				System.out.println("The Division of the Numbers:" + calculator.division(Services.fetching_Data(sc)));
				break;
			case 4:
				System.out.println("The multiplication of the Given Nunumbers is:" + calculator.multiplication(Services.fetching_Data(sc)));
				break;
			default:
				try {
					throw new Invalid_Data("Try numbers between 1-4");
				}catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}
				
			}
			System.out.println("Do you Want to continue:'y' for continue or 'n' for exit ");
			try {
				exit = sc.next().charAt(0);
			}catch(Exception e) {
				System.out.print("invalid input");
			}
		} while (exit!='n');
		System.out.println("Thank You");
	}

}

