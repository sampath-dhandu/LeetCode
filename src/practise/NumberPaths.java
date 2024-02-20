package practise;

public class NumberPaths {

    public static void main(String[] args) {

        System.out.println(numberofPaths3(2, 3));

    }

    //2 ,2
    // 1, 2 + 2 ,1
    private static int numberofPaths(int m, int n) {
        if (n == 1 || m == 1)
            return 1;
        return numberofPaths(n - 1, m) + numberofPaths(n, m - 1);

    }

   // Time Complexity: O(M*N) – Due to nested for loops.
   // Auxiliary Space : O(M*N) – We have used a 2D array of size MxN.
    private static int numberofPaths2(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++)
                // By uncommenting the last part the
                // code calculates the total possible paths
                // if the diagonal Movements are allowed
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1]; //+ count[i-1][j-1];
        }
        return arr[m - 1][n - 1];
    }

    private static int numberofPaths3(int m, int n) {
        {
            int dp[] = new int[n];
            dp[0] =1;
            for(int i =0 ;i < m ; i ++){
                for(int j = 1 ; j < n ; j++){
                    dp[j] += dp[j - 1];
                }
            }
            return  dp[n-1];
        }
    }

}
