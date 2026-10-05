class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxLen = 0;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            
            if(currentSum == k){
                maxLen = i+1;
            }
            
            int rem = currentSum - k;
            if(hm.containsKey(rem)){
                int len = i - hm.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            
            if(!hm.containsKey(currentSum)){
                hm.put(currentSum, i);
            }
        }
        return maxLen;
    }
}