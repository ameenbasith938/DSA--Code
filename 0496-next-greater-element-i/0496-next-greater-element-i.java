class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            int idx = -1;

           
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == val) {
                    idx = j;
                    break;
                }
            }

            // find next greater element
            int next = -1;
            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > val) {
                    next = nums2[j];
                    break;
                }
            }

            res[i] = next;
        }

        return res;
    }
}
