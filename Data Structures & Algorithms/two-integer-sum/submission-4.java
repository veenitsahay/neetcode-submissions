class Solution {
    public int[] twoSum(int[] nums, int target) {
        int rem = 0;
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        int i =0;

        while(i < nums.length){
            rem = target - nums[i];// 4

            if(map.get(rem) != null){
                res[0] = map.get(rem);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);// 6,2

            i++;
        }

        return null;
    }
}
