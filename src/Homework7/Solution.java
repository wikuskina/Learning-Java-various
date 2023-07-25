package Homework7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Integer[] result = removeDuplicates(nums);

        System.out.println(Arrays.toString(result));
    }

    public static Integer[] removeDuplicates(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        return result.toArray(Integer[]::new);
    }
}


