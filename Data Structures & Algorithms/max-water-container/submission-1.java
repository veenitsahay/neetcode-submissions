class Solution {
    public int maxArea(int[] heights) {
        // Input: height = [1,7,2,5,4,7,3,6]
        // l= 0, r= h.length - 1;

        int l =0, r = heights.length - 1 , min = Integer.MAX_VALUE, vol = Integer.MIN_VALUE;

        while(l <= r){
            int diff = r - l;

            vol = Math.max( (diff * Math.min(heights[r],heights[l])) , vol);
            if(heights[l] <= heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return vol;
    }
}
