class Solution {
    public int[] productExceptSelf(int[] nums) {
        //for each position first multiply the prefix
        //[1,2,4,6] --> [1,1,2,8]
        //for each now mulitply by postfix
        //[1,2,4,6] --> [48,24,6,1]
        //[48,24,12,8]
        int[] prefix  =     new int[nums.length];
        int[] postfix =     new int[nums.length];
        int[] res     =     new int[nums.length];

        int j = 1;
        prefix[0] = 1;

        for(int i =1; i < nums.length; i++){
            prefix[j] = nums[i-1]*prefix[j-1];
            j++;
        }

        postfix[nums.length-1] = 1;
        int k = nums.length-1;

        for(int i = nums.length; k > 0; i--){
            postfix[k-1] = nums[i-1]*postfix[k];
            k--;
        }

        for(int i =0; i<nums.length; i++){
            res[i] = prefix[i] * postfix[i];
        }
        return res;
    }
}  
