class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>(), tail = new HashMap<>();
        for(int x: nums){
            left.put(x, left.getOrDefault(x, 0) + 1);
        }
        for(int x: nums){
            if(left.get(x) == 0) continue;
            left.put(x, left.get(x)-1);
            if(tail.getOrDefault(x-1, 0) > 0){
                tail.put(x-1, tail.get(x-1)-1);
                tail.put(x, tail.getOrDefault(x, 0)+1);
            }else if(left.getOrDefault(x+1, 0) > 0 && left.getOrDefault(x+2, 0) > 0){
                left.put(x+1, left.get(x+1)-1);
                left.put(x+2, left.get(x+2)-1);
                tail.put(x+2, tail.getOrDefault(x+2, 0) + 1);
            }else{
                return false;
            }
        }
        return true;
    }
}