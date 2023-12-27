class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n * n];
        int idx = 0;

        // Traverse the top row
        for (int j = 0; j < n; ++j) {
            int row = 0;
            int col = j;
            
            // Traverse the anti-diagonal
            while (row < n && col >= 0) {
                result[idx++] = matrix[row][col];
                ++row;
                --col;
            }
        }

        // Traverse the rightmost column (excluding the first element)
        for (int i = 1; i < n; ++i) {
            int row = i;
            int col = n - 1;
            
            // Traverse the anti-diagonal
            while (row < n && col >= 0) {
                result[idx++] = matrix[row][col];
                ++row;
                --col;
            }

        }

        return result;

    }
}