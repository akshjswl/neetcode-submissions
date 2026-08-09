class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List>map=new HashMap<String,List>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String k=String.valueOf(ch);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList());
            }
            map.get(k).add(s);
        }
        return new ArrayList(map.values());
    }
}
