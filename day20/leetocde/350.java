class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        var lst = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++){
            if(map.getOrDefault(nums2[i], 0) > 0){
                lst.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
