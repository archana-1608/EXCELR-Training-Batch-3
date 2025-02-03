public class LTCode009 {
    public double Arrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];

        // Find the median
        int mid = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[mid];
        }
    }

    public static void main(String[] args) {
        LTCode009 sol = new LTCode009();
        System.out.println(sol.Arrays(new int[]{1, 3}, new int[]{2})); 
        System.out.println(sol.Arrays(new int[]{1, 2}, new int[]{3, 4})); 
    }
}

