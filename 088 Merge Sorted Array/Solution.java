class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
	int p1 = m - 1; //Last element index in nums1
        int p2 = n - 1; //Last element index in nums2
        int p = m + n - 1;  //last index of nums1

	//Itrating on nums2 from last index to 0th index
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy remaining elements of nums2 (if any)
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}