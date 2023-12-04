package org.algos.codes.day1;

import java.util.Arrays;
import java.util.Collections;

public class MoveZeroes {

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && nums[j] == 0 ) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[j] != 0 ) {
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
