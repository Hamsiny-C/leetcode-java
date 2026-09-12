class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int value=nums[i]-1;
            if(nums[i]!=nums[value]){
                int temp=nums[value];
                nums[value]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        
            
            if(nums[j]!=j+1){
                 res.add(nums[j]);
            
        }
        return res;
    }
}