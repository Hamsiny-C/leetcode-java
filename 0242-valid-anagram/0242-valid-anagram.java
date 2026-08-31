class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
          HashMap<Character,Integer> map=new HashMap<>();
         
        for(int i=0;i<s.length();i++){
            char p=s.charAt(i);
            if(map.containsKey(p)){
                map.put(p,map.get(p)+1);
            }
            else{
                map.put(p,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ts=t.charAt(i);
            if(map.containsKey(ts)){
                map.put(ts,map.get(ts)-1);
            }
            else{
                map.put(ts,1);
            }
        }
        for(int c:map.values()){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}