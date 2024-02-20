package practise;

public class MatricsSum {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 5, 4, 6 }, 
				{ 9, 8, 9 } };
		System.out.println("result" + matrcisSum(arr));
	}

	private static int matrcisSum(int[][] arr) {
		int sum = 0;
		int rows = arr.length;
		int columns = arr[0].length;
		System.out.println("rows" +rows + "columns" + columns);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum = sum + arr[i][j];
			System.out.println(sum);
			}
		}
		return sum;
	}
}
