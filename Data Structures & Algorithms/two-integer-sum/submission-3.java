class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> indexes = new ArrayList<>();
        if(nums == null ) 
            return nums;

        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;

        for(int i = 0; i < nums.length ; i++){
            if( map.get(nums[i]) != null ){
                return new int[]{map.get(nums[i]),i};
            }
                k = target - nums[i];
                map.put(k,i);
        }
        return null;
    }
}
