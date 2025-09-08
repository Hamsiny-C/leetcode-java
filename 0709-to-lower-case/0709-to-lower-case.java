class Solution {
    public String toLowerCase(String s) {
         char[] t=s.toCharArray();
        for(int i=0;i<t.length;i++){
            int ascii=(int)t[i];
            if(ascii>64 && ascii<91){
                t[i]=(char)(ascii+32);
            }
        }
        return String.valueOf(t);
    }
}