class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}

/*
int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int arrayPairSum(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), compare);
    int sum=0;
    for (int i=0;i<numsSize;i++) {
        if(i%2==0) { 
            sum += nums[i];
        }
    }
    return sum;
}
*/
