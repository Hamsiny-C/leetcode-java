class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
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
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arr.add(j+1);
            }
        }
        return arr;
    }
}