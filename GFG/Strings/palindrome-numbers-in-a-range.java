class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=m; i<=n; i++){
            String s = Integer.toString(i);
            if(isPalindrome(s)){
                res.add(i);
            }
        }
        return res;
    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}