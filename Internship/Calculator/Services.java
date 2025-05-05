package Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Services {
	public static int[] fetching_Data(Scanner sc){
		System.out.println("Enter the number of inputs");
		int inputs = sc.nextInt();

		int[] arr = new int[inputs];
		for (int i = 0; i < inputs; i++) {
			try {
				System.out.println("Enter number " + (i + 1) + ":");
				arr[i] = sc.nextInt();
				if(arr[i]==0) {
					throw new Invalid_Data("Dont use Zero or string values");
				}
			} catch (Exception e) {
				System.out.println("Invalid input give it in integers");
				break;
			}
		}
		return arr;
	}



	
}
