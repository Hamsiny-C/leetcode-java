class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
           
           map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> l=new ArrayList<>(map.keySet());
        Collections.sort(l,(a,b)->{
            if(map.get(a)==(map.get(b))){
                return a.compareTo(b);
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        return l.subList(0,k);
    }
}