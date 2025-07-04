class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);

            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
