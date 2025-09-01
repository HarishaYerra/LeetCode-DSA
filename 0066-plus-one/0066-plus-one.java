class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add one and return
                return digits;
            }
            digits[i] = 0;     // if it's 9, set to 0 and carry over
        }
        
        // If all digits were 9 (like 999 -> 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
