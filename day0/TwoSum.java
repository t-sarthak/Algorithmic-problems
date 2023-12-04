package org.algos.codes.day0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // To return the indices create an array
        int[] result = new int[2];

        // Logic - Use hashmap for O(n).
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            }
            else {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // return the indices
        int[] result = twoSum(nums, target);
        Arrays.stream(result)
                .forEach(System.out::println);

    }
}
