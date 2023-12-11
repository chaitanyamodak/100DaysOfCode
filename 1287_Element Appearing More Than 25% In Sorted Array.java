import java.util.Arrays;
import java.util.List;

public class Solution {
    private int firstOccur(int target, int l, int r, int[] arr) {
        int result = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                result = mid;
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

    private int lastOccur(int target, int l, int r, int[] arr) {
        int result = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                result = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;

        int freq = n / 4;

        List<Integer> candidates = Arrays.asList(arr[n / 4], arr[n / 2], arr[3 * n / 4]);

        for (int candidate : candidates) {
            int left = firstOccur(candidate, 0, n - 1, arr);
            int right = lastOccur(candidate, 0, n - 1, arr);

            if (right - left + 1 > freq) {
                return candidate;
            }
        }

        return -1;
    }
}