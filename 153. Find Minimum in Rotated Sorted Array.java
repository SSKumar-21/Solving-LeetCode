class Solution {
    public int findMin(int[] nums) {
        int min=5000;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        return min;
    }
}
/*
int findMin(int* nums, int numsSize) {
    int min=5000;
        for(int i=0;i<numsSize;i++){
            min=(nums[i]>min)?min : nums[i];
        }
        return min;
}*/
