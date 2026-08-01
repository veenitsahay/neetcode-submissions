class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.add(num)){
                set.add(num);
            }else{
                return true;
            }
        }
        return false; 
    }
}