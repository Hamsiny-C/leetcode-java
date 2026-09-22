class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr=new int[nums.length-k+1];
    int index=0;

Deque<Integer> d=new ArrayDeque<>();
for(int i=0;i<nums.length;i++){
    if(d.size()>0&&d.peekFirst()==i-k){
        d.pollFirst();
    }
    while(d.size()>0&&nums[i]>=nums[d.peekLast()]){
        d.pollLast();
    }
    d.offerLast(i);
    if(i>=k-1){
        arr[index++]=nums[d.peekFirst()];
    }
}
return arr;
}
}