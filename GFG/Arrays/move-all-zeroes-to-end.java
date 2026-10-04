class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int k=j; k<arr.length; k++){
            arr[k] = 0;
        }
    }
}