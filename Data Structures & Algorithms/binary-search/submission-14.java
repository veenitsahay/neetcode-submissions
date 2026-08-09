class Solution {
    public int search(int[] nums, int target) {
        
        // split the list from middle 
        // if any half is last element is less than target discard
        // if the first element is less and last element is greater 
        // than split in half again
        int j = 0;
        int k = nums.length -1 ;

        while(j <= k){
            int mid = j + (k - j)/2;

            if(nums[mid] < target){ 
                j = mid + 1;
            }else if(nums[mid] > target){
                k = mid - 1;
            }else{
                 return mid;
            }
        }
        System.gc();
        return -1;

    }
}
