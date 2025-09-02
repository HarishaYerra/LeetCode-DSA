class Solution {
    public boolean detectCapitalUse(String word) {
        boolean upper=word.equals(word.toUpperCase());
        boolean capital=word.matches("[A-Z][a-z]*");
        boolean lower=word.equals(word.toLowerCase());

        if(upper || capital || lower)
            return true;
        else
            return false;
    }
}