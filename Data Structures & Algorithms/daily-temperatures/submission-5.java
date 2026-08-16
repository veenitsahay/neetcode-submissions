class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ret = new int[n];

        int l = 0, r = 0;

        while(r < n ){

            if(temperatures[l] < temperatures[r]){
                ret[l] = r - l;
                l++;
                r = l;
            }else{
                if(r == n -1 ){
                    ret[l] = 0;
                    l++;
                    r = l;
                }else{
                    r++;
                }
            }
        }
        return ret;
    }
}
