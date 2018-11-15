package com.whm.Demo;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15};
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i] * 2;
            System.out.println(a[i]);
        }

    }
}
