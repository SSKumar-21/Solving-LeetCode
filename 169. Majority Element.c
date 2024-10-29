int majorityElement(int* nums, int numsSize) {
    int res=nums[0];
    int count=1; 
    
    for(int i=1;i<numsSize;i++){
        if(nums[i]==res){
            count++;
        }
        else{
            count--;
        }
        
        if(count<0){
            res=nums[i];
            count=1;
        }
    }
    return res;
}

/*
think about a little you have to find the majority element which have n/2 frequency.
that me u just the the 1st element as a result and make its frequency 1.
if you go further in array 
  if u get the same element then increase the count otherwise decrease it

  if count reaches below zero then update the result value to the value u r currently in,n set its frequency to 1.

countine the process till end u will get your answer.
*/
