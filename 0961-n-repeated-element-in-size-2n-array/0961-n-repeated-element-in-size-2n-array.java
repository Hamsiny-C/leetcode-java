class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> n=new HashSet<>();
        int temp=0;
        for(int i=0;i<nums.length;i++){
          if(!n.add(nums[i])){
                temp=nums[i];
                break;
            }
        }
        return temp;
    }
}