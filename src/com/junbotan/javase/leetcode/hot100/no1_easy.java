package com.junbotan.javase.leetcode.hot100;

/**
 * @author Tan
 * @date 2022年04月05日 15:56
 */
public class no1_easy {
    public static void main(String[] args) {
        int[] index = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(index);
    }



    public static int[] twoSum(int[] nums, int target) {
        int[] index = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

}