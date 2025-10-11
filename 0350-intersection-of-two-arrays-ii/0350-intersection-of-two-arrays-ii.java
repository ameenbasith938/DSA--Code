import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        
      
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) list2.add(num);
        
        for (int num : nums1) {
            if (list2.contains(num)) {
                resList.add(num);
                list2.remove((Integer) num); 
            }
        }
        

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}
