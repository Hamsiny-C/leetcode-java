class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=Integer.MAX_VALUE;
      
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
             sum=sum+nums[right];
           
            while(sum>=target){
                int wsize=right-left+1;
                if(wsize<count){
                    count=wsize;
                }
                sum=sum-nums[left];
                left++;
            }
            
        }
        return count == Integer.MAX_VALUE? 0 : count;
    }
}