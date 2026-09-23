class Solution {
    public long minimumReplacement(int[] nums) {
     long count=0;
     long limit=nums[nums.length-1];
     for(int i=nums.length-2;i>=0;i--){
        int val=nums[i];
        if(val<=limit){
            limit=val;
        }
        else{
            long part=(val+limit-1)/limit;
            count+=part-1;
            limit=val/part;
        }
     }   
     return count;
    }
}