class Solution {
    public static int findEquilibrium(int arr[]) {
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<arr.length; i++){
            rightSum = total - arr[i] - leftSum;
            
            if(rightSum == leftSum) return i;
            
            leftSum += arr[i];
        }
        return -1;
    }
}