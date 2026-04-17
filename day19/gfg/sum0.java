class Solution {
    int maxLength(int arr[]) {
        // code here
        int sum = 0;
        int maxlen = 0;
        var map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length;  i++){
            sum += arr[i];
            
            if(sum == 0) {
                maxlen = i + 1;
            } else {
                if(map.containsKey(sum)){
                    int len = i - map.get(sum);
                    maxlen = Math.max(maxlen, len);
                } else {
                    map.put(sum, i);
                }
            }
        }
        
        return maxlen;
    }
}

// https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1:
