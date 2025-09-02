class Solution {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // when current is not space AND (it's first char OR previous is space)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
