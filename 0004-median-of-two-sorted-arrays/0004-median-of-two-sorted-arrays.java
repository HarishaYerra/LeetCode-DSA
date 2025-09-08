class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int l=nums1.length+nums2.length; 
       int arr[]=new int[l];
       int n=0;
       for(int i=0;i<nums1.length;i++){
            arr[n]=nums1[i];
            n++;
       }
       for(int i=0;i<nums2.length;i++){
            arr[n]=nums2[i];
            n++;
       }
       Arrays.sort(arr);
       if(arr.length % 2==1){
        return arr[arr.length/2];
       }
       return (double)(arr[arr.length/2]+arr[arr.length/2-1])/2;
    }

}