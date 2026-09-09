class Solution {
    public int[] getAverages(int[] nums, int k) {
        /*int n = nums.length;
        int[] ans = new int[n];
        long sum = 0;
        int size = 2 * k + 1;
        Arrays.fill(ans, -1);
        if (size > n) {
            return ans;
        }
        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }
        ans[k] = (int)(sum / size);
        for (int i = size; i < n; i++) {
            sum -= nums[i - size];
            sum += nums[i];
            ans[i - k] = (int)(sum / size);
        }
        return ans;*/

        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
        }
        int wsize=2*k+1;
        if(wsize>nums.length){
            return res;
        }
        long sum=0;
        for(int i=0;i<wsize;i++){
            sum+=nums[i];
        }
        int avg=(int)(sum/wsize);
        res[k]=avg;
        
        for(int i=wsize;i<nums.length;i++){
           sum=sum+nums[i]-nums[i-wsize];
          res[i-k]=(int)(sum/wsize);
        }
        return res;
    }
}