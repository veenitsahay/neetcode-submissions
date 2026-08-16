class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length, l = 0, r = len - 1;


        //binary search algo I guess
        // divide array by 2
        // last element of first half is less than and first element 

        while(l < len && r > -1){

            if(numbers[r] + numbers[l] < target){
                l++;
            }else if(numbers[l] + numbers[r] > target){
                r--;
            }else{
                return new int[]{l+1, r+1};
            }
        }

        return null;
    }
}
