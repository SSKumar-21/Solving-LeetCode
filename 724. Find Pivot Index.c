int pivotIndex(int* nums, int numsSize) {
      int sum=0;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
    }
    int left=0,right=sum-nums[0];
    for(int i=0;i<numsSize;i++){
        right=sum-left-nums[i];
        if(left==right){
            return i;
        }
        left+=nums[i];
    }
    return -1;
}
/*
class Solution {
    public int pivotIndex(int[] nums) {
        int l=0,r=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        r=sum-nums[0];
        for(int i=0;i<nums.length;i++){
            r=sum-l-nums[i];
            if(l==r){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}
*/
