package practise;

public class ValidLookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
//		                    [0,0,0,0,0,0,0,0,0,0],
//		                    [0,0,0,0,0,0,0,0,0,0],
//		                    [0,0,0,1,1,1,1,1,0,0],
//		                    [0,0,0,1,0,0,0,1,0,0],
//		                    [0,0,0,1,0,0,0,1,0,0],
//		                    [0,0,0,1,1,0,0,1,0,0],
//		                    [0,0,0,0,0,1,0,1,0,0],
//		                    [0,0,0,0,0,1,1,1,0,0],
//		                    [0,0,0,0,0,0,0,0,0,0],
//		                    [0,0,0,0,0,0,0,0,0,0]
//		                ];
		System.out.println((validLoop(arr)) ? "true" : "false");
	}

	static boolean validLoop(int arr[][]) {
		int n = 0, x = 0;
		int numRows = arr.length;
		int numCols = arr[0].length;
		System.out.println("numRows : " + numRows  + " numCols :" + numCols);
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (arr[i][j] == 1) {
					x = numTouching1(i, j, arr) - 2;
					if (x == -1 || x == 1 || x == 2) {
						n += x;
					}
				}
			}
		}
		return n > -1;
	}

	static int numTouching1(int x, int y, int arr[][]) {
		return arr[x - 1][y] + arr[x + 1][y] + arr[x][y - 1] + arr[x][y + 1];
	}
}
