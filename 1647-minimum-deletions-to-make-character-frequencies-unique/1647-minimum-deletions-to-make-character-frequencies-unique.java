class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        HashSet set=new HashSet<>();
        for(Integer i:map.values()){
            while(i>0&&set.contains(i)){
                i--;
                count++;
            }
            if(i>0){
                set.add(i);
            }
        }
        return count;
    }
}