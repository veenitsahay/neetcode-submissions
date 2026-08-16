class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];

        int l = 0, r = 0;

        while(r < temperatures.length ){

            if(temperatures[l] < temperatures[r]){
                ret[l] = r - l;
                l++;
                r = l;
            }else if(r == temperatures.length -1 ){
                ret[l] = 0;
                l++;
                r = l;
            }else{
                r++;
            }
        }
        return ret;
    }
}
