class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        int l = 0, r = nums.length;
        Map<Integer, Integer> valIndexMap = new HashMap<>();

        while(l < r){
            int rem = target - nums[l];

            if(valIndexMap.get(nums[l]) != null){
                return new int[]{valIndexMap.get(nums[l]), l};
            }

            valIndexMap.put((rem), l);
            l++;
        }

        return null;

    }
}
