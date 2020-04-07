class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int len=1; len<s.length()/2+1; len++){
            if(s.length() % len == 0){
                int i=1;
                for(i=1; i*len<= s.length(); i++){
                    if(!s.substring((i-1)*len, i*len).equals(s.substring(0, len))){
                        break;
                    }
                    if(i*len == s.length()) return true;
                }
            }
        }
        return false;
    }
}