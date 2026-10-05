class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> it : hm.entrySet()){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(it.getKey());
            li.add(it.getValue());
            res.add(li);
        }
        return res;
    }
}