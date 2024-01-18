class Solution {
        public boolean uniqueOccurrences(int[] arr) {
                int[] vec = new int[2001];

                for (int x : arr) {
                    vec[x + 1000]++;
                }

                Arrays.sort(vec);

                for (int i = 1; i < 2001; i++) {
                    if (vec[i] != 0 && vec[i] == vec[i - 1]) {
                        return false;
                    }
                }

                return true;
         }
}

