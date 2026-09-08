class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        while(left<=right){
            int sum=people[left]+people[right];
            if(sum<=limit){
               c++;
               left++;
               right--;
            }
            else{
                c++;
                right--;
            }
        }
        return c;
    }
}