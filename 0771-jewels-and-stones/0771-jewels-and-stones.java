class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int Jewel_count=0;
        HashSet<Character> set=new HashSet();
        for(int i=0;i<jewels.length();i++){
        char ch=jewels.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<stones.length();i++){
            char ch1=stones.charAt(i);
            if(set.contains(ch1)){
                Jewel_count++;
            }
        }
        return Jewel_count;
    }
}