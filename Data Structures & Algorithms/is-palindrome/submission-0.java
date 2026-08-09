class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] c1 = s.toCharArray();
        char[] c2 = new char[c1.length];
        int j = 0;

        for(int i = c1.length-1; i >=0 && j < c1.length; i--){
            c2[j] = c1[i];
            j++;
        }
        return Arrays.compare(c1,c2) == 0 ? true : false;
    }
}
