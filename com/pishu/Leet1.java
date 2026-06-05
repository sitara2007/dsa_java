package com.pishu;

public class Leet1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Leet1 solver = new Leet1();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Result found at indices: [" + result[0] + ", " + result[1] + "]");
    }
}