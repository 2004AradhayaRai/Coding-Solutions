class Solution {
    public boolean uniformArray(int[] nums1) {

        int n=nums1.length;
        int []nums2 = new int [n];
        nums2[0]=nums1[0];

        int min=nums1[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,nums1[i]);
        }
        for(int i=0;i<n;i++){
            if(nums1[i] % 2 == min % 2){
                nums2[i]=nums1[i];
            }
            else if(min % 2 !=0 && nums1[i]>min){
                nums2[i]=nums2[i]-min;
            }
            else{
                nums2[i]=nums1[i];
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums2[i] % 2 == 0) {
                cnt++;
            }
        }
        if(cnt==0 || cnt==n) {
            return true;
        }
        return false;
    }
}