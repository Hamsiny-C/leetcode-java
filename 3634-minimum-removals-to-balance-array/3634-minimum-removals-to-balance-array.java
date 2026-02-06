class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
      int maxlength=1;
        int left=0;
        for(int right=0;right<n;right++){
            while((long)nums[right]>(long)nums[left]+k){
               left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return n-maxlength;
    }
}