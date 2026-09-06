class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : stones){
            maxHeap.offer(num);
        }

        while(maxHeap.size() > 1){
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }

        return maxHeap.poll();
    }
}
