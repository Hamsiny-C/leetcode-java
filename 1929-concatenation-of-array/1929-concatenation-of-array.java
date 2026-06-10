class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] fin=new int[2*(nums.length)];
        for(int i=0;i<fin.length;i++){
            fin[i]=nums[i%nums.length];
        }
        return fin;
    }
}