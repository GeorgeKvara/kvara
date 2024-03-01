import java.util.*;

public class IntersectionOfArrays {
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};

        int[] intersection1 = findIntersection(nums1, nums2);
        System.out.println("Intersection of arrays 1:");
        System.out.println(Arrays.toString(intersection1));

        // Test Case 2
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {6, 7, 8, 9};

        int[] intersection2 = findIntersection(nums3, nums4);
        System.out.println("Intersection of arrays 2:");
        System.out.println(Arrays.toString(intersection2));

        // Test Case 3
        int[] nums5 = {1, 2, 3, 4, 5};
        int[] nums6 = {5, 6, 7, 8, 9};

        int[] intersection3 = findIntersection(nums5, nums6);
        System.out.println("Intersection of arrays 3:");
        System.out.println(Arrays.toString(intersection3));

        // Test Case 4
        int[] nums7 = {1, 2, 2, 4, 4, 4};
        int[] nums8 = {0, 2, 7, 4, 4, 4};

        int[] intersection4 = findIntersection(nums7, nums8);
        System.out.println("Intersection of arrays 4:");
        System.out.println(Arrays.toString(intersection4));
    }

}
