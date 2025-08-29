class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        if(i==-1) return word;
        char[] chars= word.toCharArray();
        int l=0,r=i;
        while(l<r){
            char temp=chars[l];
            chars[l]=chars[r];
            chars[r]=temp;
            l++;
            r--;
        }
        return new String(chars);
    }
}