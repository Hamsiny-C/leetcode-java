class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int Jewel_count=0;
        HashSet<Object> set=new HashSet();
        for(char i:jewels.toCharArray()){
            set.add(i);
        }
        for(char j:stones.toCharArray()){
            if(set.contains(j)){
                Jewel_count++;
            }
        }
        return Jewel_count;
    }
}