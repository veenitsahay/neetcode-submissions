class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int twoback = 0, oneback = 0, curr = 0, res1 = 0, res2 = 0;

        for(int i = 0; i < nums.length - 1; i++){
            curr = Math.max(nums[i] + twoback, oneback);
            twoback = oneback;
            oneback = curr;
        }

        res1= oneback;
        oneback = 0;
        twoback = 0;
        curr = 0;

        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i] + twoback, oneback);
            twoback = oneback;
            oneback = curr;
        }
        res2 = oneback;

        return Math.max(res1, res2);
    }
}
