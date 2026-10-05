class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        int smax = -1;
        
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            }else if(smax < arr[i] && arr[i] != max){
                smax = arr[i];
            }
        }
        
        return smax;
    }
}