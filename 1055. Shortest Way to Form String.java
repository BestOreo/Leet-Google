
class Solution {
    public int shortestWay(String source, String target) {
        HashSet<Character> set = new HashSet<>();
        for(char ch: source.toCharArray()){
            set.add(ch);
        }
        int res = 1;
        for(int i=0,j=0; i<target.length(); i++){
            if(!set.contains(target.charAt(i))) return -1;
            while(j<source.length() && source.charAt(j) != target.charAt(i)){
                j++;
            }
            if(j == source.length()){
                j = -1;
                res++;
                i--;
            }
            j++;
        }
        return res;
    }
}