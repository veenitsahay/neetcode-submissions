class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }


return  map.entrySet()
.stream()
.sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
.limit(k)
.mapToInt(Map.Entry::getKey)
.toArray();
    }
}
