class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return null;

        List<List<String>> ret = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            List<Integer> list = map.getOrDefault(key, new ArrayList<Integer>());
            list.add(i);
           map.put(key, list);
        }

        for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
            String key = entry.getKey();
            List<String> ana = new ArrayList<>();
            for(Integer v: map.get(key)){
                ana.add(strs[v]);
            }

            ret.add(ana);
        }

        return ret;
    }
}
