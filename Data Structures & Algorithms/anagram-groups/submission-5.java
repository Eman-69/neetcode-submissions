class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortS = new String(charArray);
            map.putIfAbsent(sortS,new ArrayList<>());
            map.get(sortS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
