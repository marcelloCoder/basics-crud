package br.com.mcoder.leetcode;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i]){
                next++;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
