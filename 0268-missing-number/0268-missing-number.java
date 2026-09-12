class Solution {
    public int missingNumber(int[] nums) {
        
        int i=0;
        while(i<nums.length){
           int value=nums[i];
            if(value<nums.length&&nums[value]!=nums[i]){
                int temp=nums[value];
                nums[value]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
               return j;
            }
        }
        return nums.length;
    }
}