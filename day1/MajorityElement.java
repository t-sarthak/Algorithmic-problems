package org.algos.codes.day1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        // Using hashmap

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > (nums.length)/2) {
                result = entry.getKey();
                return result;
            }
        }
        return result;
    }

    public static int majorityElementOptimal(int[] nums) {
        // Using Moore voting algorithm
        int element = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++) {
            if(count == 0 ) {
                element = nums[i];
            }
            if (element == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        return element;
    }


    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElementOptimal(nums));
    }
}
