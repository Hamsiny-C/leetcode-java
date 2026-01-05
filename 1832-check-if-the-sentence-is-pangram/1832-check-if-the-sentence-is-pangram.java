class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> pan=new HashSet<>();
       for(int i=0;i<sentence.length();i++){
        pan.add(sentence.charAt(i));
       }
       return pan.size()==26;
    }
}