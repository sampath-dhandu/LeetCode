package practise;

public class ArrayDignoalSum {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 5, 4, 6 }, 
				{ 9, 8, 9 } };
		/**
		 * 3 11 2 4 4 5 6 10 8 -12
		 */
		System.out.println("result" + diagonalDifference(arr));
	}

	private static int diagonalDifference(int arr[][]) {

		int left_right = 0;
		int right_left = 0;
		int rows = arr.length;
		int columes = arr[0].length;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = arr.length - 1;
		System.out.println("rows" + rows + "\t columes" + columes +"\t length" + l);
		while (i < rows && j < columes && k < rows && l >= 0) {
			left_right += arr[i][j];
			right_left += arr[k][l];
			i += 1;
			j += 1;
			k += 1;
			l -= 1;
		}
		return Math.abs(left_right - right_left);
	}
}
