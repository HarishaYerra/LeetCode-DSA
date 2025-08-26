class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=0,ans=0;
        for(int d[]: dimensions){
            int a=d[0],b=d[1];
            int curr=a*a+b*b;
            if(curr>max){
                max=curr;
                ans=a*b;
            }
            else if(curr==max)
            ans=Math.max(ans,a*b);
        }
        
        return ans;
    }
}