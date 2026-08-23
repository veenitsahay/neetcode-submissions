class Solution {
    //[2,9,8,0,6,2,7,40,5]
    // answer 59
    // index nums[0] + nums[2...end] or nums[1] + nums[3...end]
    int max = 0;

    public int rob(int[] nums) {

        int twoBack = 0;  // best total up to i-2
        int oneBack = 0;  // best total up to i-1

        for (int num : nums) {
            int current = Math.max(num + twoBack, oneBack);
            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }

}
