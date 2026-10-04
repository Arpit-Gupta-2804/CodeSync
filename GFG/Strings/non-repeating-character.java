class Solution {
    public char nonRepeatingChar(String s) {
        int [] freq = new int [26];
        Arrays.fill(freq, -1);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 0){
                return ch;
            }
        }
        return '$';
    }
}