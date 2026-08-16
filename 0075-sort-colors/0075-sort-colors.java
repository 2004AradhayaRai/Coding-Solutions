class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,right);
                right--;
            }
        }

    }
    public int []swap(int nums[],int l,int r){
        int a=nums[l];
        nums[l]=nums[r];
        nums[r]=a;
        return nums;

    }
}