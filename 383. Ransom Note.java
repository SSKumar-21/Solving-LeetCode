class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(map.containsKey(c)){
                int val=map.get(c);
                if(val<=0) {
                    return false;
                }
                map.put(c,val-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
