class Solution {
    public String longestCommonPrefix(String[] str) {
         String p=str[0];
         for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(p)){
                p=p.substring(0,p.length()-1);
                if(p.isEmpty()) return "";
            }
         }
         return p;
    }
}