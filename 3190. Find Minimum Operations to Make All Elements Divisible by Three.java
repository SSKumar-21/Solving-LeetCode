class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                op++;
            }
        }
        return op;
    }
}
/*
int minimumOperations(int* nums, int numsSize) {
    int op=0;
        for(int i=0;i<numsSize;i++){
            if(nums[i]%3!=0){
                op++;
            }
        }
        return op;
}
*/
