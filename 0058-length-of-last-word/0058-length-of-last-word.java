class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length(), c = 0;

        // Step 1: Skip trailing spaces
        int i = l - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters in last word
        while (i >= 0 && s.charAt(i) != ' ') {
            c++;
            i--;
        }

        return c;
    }
}
