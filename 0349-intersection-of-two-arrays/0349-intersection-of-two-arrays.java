class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
       HashSet<Integer> res=new HashSet<>();
       
        for(int n:set1){
            if(set2.contains(n)){
            res.add(n);
            }
           
        }
        int[] fin=new int[res.size()];
        int i=0;
        for(int n1:res){
            fin[i]=n1;
            i++;
        }
        return fin;
    }
}