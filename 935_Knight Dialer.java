public class Solution {
    private static final int M = 1000000007;
    private static final List<List<Integer>> adj = Arrays.asList(
            Arrays.asList(4, 6),
            Arrays.asList(6, 8),
            Arrays.asList(7, 9),
            Arrays.asList(4, 8),
            Arrays.asList(3, 9, 0),
            Arrays.asList(),
            Arrays.asList(1, 7, 0),
            Arrays.asList(2, 6),
            Arrays.asList(1, 3),
            Arrays.asList(2, 4)
    );

    public int knightDialer(int n) {
        int result = 0;

        // t[i][j] = number of ways to form a number of length i when I am currently at cell j
        int[][] t = new int[n][10];

        for (int cell = 0; cell < 10; cell++) {
            t[0][cell] = 1; // for n == 0, we always return 1
        }

        for (int i = 1; i < n; i++) { // This is the length of the number
            for (int cell = 0; cell <= 9; cell++) {
                int ans = 0;
                for (int nextCell : adj.get(cell)) {
                    ans = (ans + t[i - 1][nextCell]) % M;
                }
                t[i][cell] = ans;
            }
        }

        for (int cell = 0; cell <= 9; cell++) {
            result = (result + t[n - 1][cell]) % M;
        }

        return result;
    }
}