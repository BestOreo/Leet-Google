import java.util.*;

class Solution {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, List<List<String>> pairs) {
        if(words1.length != words2.length) return false;
        HashMap<String, String> map = new HashMap<>();
        for(List<String> pair: pairs){
            String p1 = find(map, pair.get(0));
            String p2 = find(map, pair.get(1));
            map.put(p1, p2);
        }
        for(int i=0; i<words1.length; i++){
            if(!words1[i].equals(words2[i]) && !find(map, words1[i]).equals(find(map, words2[i]))){
                return false;
            }
        }
        return true;
    }
    
    String find(Map<String, String> map, String s){
        if(!map.containsKey(s)) map.put(s, s);
        while(!s.equals(map.get(s))){
            s = map.get(s);
        }
        return s;
    }
}