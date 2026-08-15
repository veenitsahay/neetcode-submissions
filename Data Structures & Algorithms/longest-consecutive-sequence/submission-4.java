class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        Iterator<Integer> itr = set.iterator();

        int[] n = new int[set.size()];
        
        int i = 0;
        while(itr.hasNext()){
            n[i] = itr.next();
            i++;
        }
        Arrays.sort(n);

        //nums=[9,1,4,7,3,-1,0,5,8,-1,6]  , [2,20,4,10,3,4,5]
        //sorted = -1 -1 0 1 3 4 5 6 7 8 9 , 2 3 4 5 10 20
        int count1= 1, j = 1, longest = 1;

        while(j < n.length){
            int diff = n[j] - n[j-1];

            if(diff == 1){
                count1++;
                longest = Math.max(longest, count1);

            }else if(diff > 1){
                count1 = 1;
            }
            j++;
        }
        return longest;
    }
}
