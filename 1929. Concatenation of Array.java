class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr;
        arr=new int[nums.length * 2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
}
/*
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
/*
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
     int *arr=malloc(sizeof(int)*2*numsSize);
     *returnSize=2*numsSize;;
        for(int i=0;i<numsSize;i++){
            *(arr+i)=nums[i];
            *(arr+i+numsSize)=nums[i];
        }
        return arr;
    }

*/
