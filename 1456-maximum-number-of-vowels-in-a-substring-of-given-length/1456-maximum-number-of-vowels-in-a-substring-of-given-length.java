class Solution {
    public int maxVowels(String s, int k) {
        if (k > s.length()) return 0;
        int count = 0;
        for(int j = 0;j<k;j++){
            int temp = s.charAt(j);
            if(temp =='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                count++;
            }
        }
        int max = count;
        for(int i = k;i<s.length();i++){
            char temp = s.charAt(i);
            char temp1 = s.charAt(i-k);
            if(temp1 =='a'||temp1=='e'||temp1=='i'||temp1=='o'||temp1=='u'){
                count--;
            }
            if(temp =='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                count++;
            }
            max = Math.max(max,count);
        }       
        return max;        
    }

}