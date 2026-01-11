// LeetCode 1470 - Shuffle the Array
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // x_i
            ans[2 * i + 1] = nums[i + n]; // y_i
        }

        return ans;
    }
}

/*
input:
[2, 5, 1, 3, 4, 7]
output:
[2, 3, 5, 4, 1, 7]
*/
