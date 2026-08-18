class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // final decision start from end index iterate whole array then decvrease last index and repeat
        //Input: nums = [-1,0,1,2,-1,-4] sorted = -4 -1 -1 0 1 2
        //Output: [[-1,-1,2],[-1,0,1]]

        Arrays.sort(nums);
        int  r = nums.length-1,  l = 0 , k = r-1;
        List<List<Integer>> ret = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        while(r > -1){

            while( l < k){
                int sum = nums[l] + nums[k] + nums[r];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[l]);
                    list.add(nums[k]);
                    list.add(nums[r]);
                    Collections.sort(list);

                    if(set.add(list)){
                        ret.add(list);
                    }
                    l++;
                    k--;
                }else if( sum < 0){
                    l++;
                }else{
                    k--;
                }
            }
            r--;
            l = 0;
            k = r-1;
        }

        return ret;
    }
}
