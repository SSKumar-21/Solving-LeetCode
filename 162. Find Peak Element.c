int findPeakElement(int* nums, int numsSize) {
    int i=0;
    for(;i<numsSize-1;i++){
        if(nums[i]>nums[i+1]){
            break;
        }
    }
    return i;
    }
