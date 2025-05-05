package Calculator;

public class Operation {
	static int solution = 0;

	public int add(int[] arr) {
		solution = 0;
		for (int i : arr) {
			solution += i;
		}
		return solution;
	}

	public int subtract(int[] arr) {
		solution = arr[0];

		for (int i = 1; i < arr.length; i++) {
			solution -= arr[i];
		}
		return solution;
	}

	public int multiplication(int[] arr) {
		solution = 1;
		for (int i : arr) {
			solution *= i;
		}
		return solution;
	}

	public int division(int[] arr) {
		solution = 1;
		for (int i : arr) {
			solution /= i;
		}
		return solution;
	}

	


}
