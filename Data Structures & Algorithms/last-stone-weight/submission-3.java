class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Comparator.reverseOrder());
//9,7,6
        for(int num : stones){
            maxHeap.offer(num);
        }

        int j = 0;
        while(maxHeap.size() > 1){
            maxHeap.offer(Math.abs(maxHeap.poll() - maxHeap.poll()));
        }

        return maxHeap.poll();
    }
}
