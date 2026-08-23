class Solution {
    //[2,9,8,0,6,2,7,40,5]
    // answer 59
    // index nums[0] + nums[2...end] or nums[1] + nums[3...end]
    public int rob(int[] nums) {
        int oneback = 0, twoback = 0;

        for(int num : nums){
            int curr = Math.max(num + twoback, oneback);
            twoback = oneback;
            oneback = curr;
        }

        return oneback;
    }

}
