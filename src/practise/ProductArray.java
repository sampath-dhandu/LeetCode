package practise;

public class ProductArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		// System.out.println(new ProductArray().productArray(arr));

		int[] result = new ProductArray().productArraySolution1(arr);
		disaplay(result);
	}

	private int[] productArraySolution1(int arr[]) {

		int sumAmount = 1;

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sumAmount = sumAmount * arr[i];
		}
		 System.out.println(sumAmount);

		for (int i = 0; i < arr.length; i++) {
			int temp = sumAmount / arr[i];
			result[i] = temp;
		}

		return result;
	}

	private int[] productArraySolution2(int arr[]) {
		int n = arr.length;

		int[] output = new int[n];

		int[] left_output = new int[n];

		int[] right_output = new int[n];

		left_output[0] = 1;

		right_output[n - 1] = 1;

		for (int i = 1; i < n; i++) {
			left_output[i] = arr[i - 1] * left_output[i - 1];
		}

		disaplay(left_output);
		for (int i = n - 2; i >= 0; i--) {
			right_output[i] = arr[i + 1] * right_output[i + 1];
		}

		disaplay(right_output);
		for (int i = 0; i < n; i++) {
			output[i] = left_output[i] * right_output[i];
		}

		return output;
	}

	private int[] productArraySolution3(int arr[]) {
		int n = arr.length;

		int[] output = new int[n];

		output[0] = 1;
		for (int i = 1; i < n; i++) {
			output[i] = arr[i - 1] * output[i - 1];
		}

		disaplay(output);

		int r = 1;
		for (int i = n - 1; i >= 0; i--) {
			//System.out.println("out " + output[i] + "r value " +r);
			output[i] = output[i] * r;
			r = r * arr[i];
			System.out.println(r);
		}

		return output;
	}

	private static void disaplay(int arr[]) {
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
