class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        int max = Integer.MIN_VALUE;

        // outer loop should go until nums.length - k
        while (j <= nums.length - k) {
            int sum = 0;

            // inner loop should take only k elements, not till end
            for (int i = j; i < j + k; i++) {
                sum += nums[i];
            }

            if (max < sum) {
                max = sum;
            }
            j++;
        }

        return (double) max / k;
    }
}
