class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray(), tc = t.toCharArray();
        int[] compare = new int[26];

        for(char c: sc){
            compare[c - 'a']++;
        }
        for(char c: tc){
            compare[c - 'a']--;
        }
        for(int i: compare){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
