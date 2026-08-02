class Solution {
    public int[] topKFrequent(int[] nums, int k) {
Map<Integer, Integer> freq = new HashMap<>(nums.length * 4 / 3 + 1);
for (int n : nums) freq.merge(n, 1, Integer::sum);

return  freq.entrySet()
.stream()
.sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
.limit(k)
.mapToInt(Map.Entry::getKey)
.toArray();
    }
}
