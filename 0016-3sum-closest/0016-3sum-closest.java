class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];
        for(int fir=0;fir<nums.length-2;fir++){
           int sec=fir+1;
           int third=nums.length-1;
           while(sec<third){
            int sum=nums[fir]+nums[sec]+nums[third];
            if(Math.abs(closest-target)>Math.abs(sum-target)){
                closest=sum;
            }
            if(sum==target){
                return sum;
            }
            else if(sum>target){
                third--;
            }
            else{
                sec++;
            }
           }
        }
        return closest;
    }
}