class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
     int newidx=0;
     int right=nums.length-1;
        while(left<=right){
            if(nums[left]!=0){
               nums[newidx]=nums[left];
               
               newidx++;
            }
            left++;
        }  
        while(newidx<=right){
            nums[newidx]=0;
            newidx++;
        }
             
    }
}