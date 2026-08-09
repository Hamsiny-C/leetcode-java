class Solution {
    public int[] sortArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        
        mergeSort(nums,left,right);
        return nums;
    }
       void mergeSort(int[] nums,int left,int right){
            if(left>=right){
                return;
            }
            int mid=left+(right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
           
        }
        void merge(int[] nums,int left,int mid,int right){
            int n1=mid-left+1;
            int n2=right-mid;
            int[] L=new int[n1];
            int[] R=new int[n2];
            for(int i=0;i<n1;i++){
                L[i]=nums[left+i];
            }
            for(int i=0;i<n2;i++){
                R[i]=nums[mid+1+i];
            }
            int i=0;
            int j=0;
            int k=left;
            while(i<n1&&j<n2){
                if(L[i]<=R[j]){
                    nums[k]=L[i];
                    i++;
                }
                else{
                    nums[k]=R[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                nums[k]=L[i];
                k++;
                i++;
            }
            while(j<n2){
                nums[k]=R[j];
                k++;
                j++;
            }
        }
    
}