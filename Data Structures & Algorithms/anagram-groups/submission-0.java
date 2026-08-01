class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        int i = 0;

        while(i< strs.length){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            
            map.computeIfAbsent(new String(ch), k->new ArrayList<>()).add(i);
            i++;
        }

        for(List<Integer> list : map.values()){
            List<String> lstr = new ArrayList<>();
            for(Integer index: list){
                lstr.add(strs[index]);
            }
            res.add(lstr);
        }
        return res;
    }
}
