class Solution {
    public boolean confusingNumber(int N) {
        int flip = 0, tmp = N;
        while(tmp != 0){
            int num = tmp%10;
            if( (num >= 2 && num <= 5) || num == 7){
                return false;
            }else if(num == 6){
                num = 9;
            }else if(num == 9){
                num = 6;
            }
            flip = num + flip * 10;
            tmp /= 10;
        }
        return flip != N;
    }
}