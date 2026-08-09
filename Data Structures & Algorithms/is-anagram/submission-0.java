class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] s1=s.toLowerCase().toCharArray();
        char[] s2=t.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)) return true;
        return false;
    }
}
