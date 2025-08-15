class Solution {
    public int strStr(String haystack, String needle) {
        int nlen=haystack.length();
        int hlen=needle.length();
        if(nlen==0) return 0;
        for(int i=0;i<=nlen-hlen;i++){
            if(haystack.substring(i,i+hlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}