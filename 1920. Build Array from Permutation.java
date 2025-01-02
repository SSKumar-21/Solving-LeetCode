class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr;
        arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
/*
int* buildArray(int* nums, int numsSize, int* returnSize) {
    int *arr=malloc(sizeof(int)*numsSize);
    *returnSize=numsSize;
    for(int i=0;i<numsSize;i++){
        arr[i]=nums[nums[i]];
    }
    return arr;
}
*/
