class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==k){
                    res++;
                }
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    res++;
                }
            }
        }
        return res;
    }
}
