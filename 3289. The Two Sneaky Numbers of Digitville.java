
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index=0;
        int[] arr;
        arr= new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                arr[index++]=nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return arr;
    }
}

/*
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
/*
int* getSneakyNumbers(int* nums, int numsSize, int* returnSize) {
    int *arr=malloc(sizeof(int)*2);
    *returnSize=2;
    int index=0;
    int freq[numsSize];
    for(int i=0;i<numsSize;i++){
        freq[i]=0;
    }
    for(int i=0;i<numsSize;i++){
        freq[nums[i]]++;
        if(freq[nums[i]]>1){
            *(arr+index)=nums[i];
            index++;
        }
    }
    return arr;
}
*/
