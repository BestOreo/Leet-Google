class Solution {
    public int expressiveWords(String S, String[] words) {
        int res = 0;
        for(String w: words){
            int i=0, j=0;
            while(i<S.length() && j<w.length()){
                if(S.charAt(i) != w.charAt(j)) break;
                int sr = 1, wr = 1;
                while(i+1<S.length() && S.charAt(i) == S.charAt(i+1)){
                    sr++;
                    i++;
                }
                while(j+1<w.length() && w.charAt(j) == w.charAt(j+1)){
                    wr++;
                    j++;
                }
                if((sr > wr && sr < 3) || sr < wr) break;
                i++;
                j++;
            }
            if(i == S.length() && j == w.length()) res++;
        }
        return res;
    }
}