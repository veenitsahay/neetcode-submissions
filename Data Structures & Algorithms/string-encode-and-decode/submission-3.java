class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){ 
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int hash = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i, hash));
            String str1 = str.substring(hash+1, hash+len+1);
            strs.add(str1);
            i = hash+len+1;
        }

        return strs;
    }
}
