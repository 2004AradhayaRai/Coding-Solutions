class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;

        int []arr1=new int[n];
        int []arr2=new int[n];
        if(n==2) return nums;

        int m1=0;
        int m2=0;
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[m1]>arr2[m2]){
                arr1[m1+1]=nums[i];
                m1++;
            }
            else{
                arr2[m2+1]=nums[i];
                m2++;
            }
        }

        int ans[]=new int[n];
        int k=0;
        for(int i=0;i<=m1;i++){
            ans[k++]=arr1[i];
        }
        for(int i=0;i<=m2;i++){
            ans[k++]=arr2[i];
        }
        return ans;
    }
}