class Solution {
    public int findDuplicate(int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<end){
            int mid=(start+end)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count<=mid){
             
                   start=mid+1;
            }
            else{
                end=mid;
            }
      
        }
              return start;
    }
}