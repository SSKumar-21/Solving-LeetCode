class Solution {
    public int minimumOperations(int[] nums) {
        int op = 0,curr=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                for(int j=curr; j<curr+3 && j<nums.length; j++){
                    System.out.print(j+" ");
                    if(set.contains(nums[j])){
                        set.remove(nums[j]);
                    }
                }
                System.out.println();
                op++;
                curr+=3;
                set.add(nums[i]);
                i=curr;
            }
        }
        return op;
    }
}
