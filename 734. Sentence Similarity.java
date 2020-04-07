import java.util.*;

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, List<List<String>> pairs) {
        if(words1.length != words2.length){
            return false;
        }
        HashMap<String, Set<String>> smap = new HashMap<>();
        for(List<String> pair: pairs){
            smap.putIfAbsent(pair.get(0), new HashSet<>());
            smap.putIfAbsent(pair.get(1), new HashSet<>());
            smap.get(pair.get(0)).add(pair.get(1));
            smap.get(pair.get(1)).add(pair.get(0));
        }
        for(int i=0; i<words1.length; i++){
            if(words1[i].equals(words2[i])) continue;
            if(!smap.containsKey(words1[i]) || !smap.get(words1[i]).contains(words2[i])){
                return false;
            }
        }
        return true;
    }
}