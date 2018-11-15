package com.whm.Demo;

//定义方法 求平均值
public class Test5 {

    public static void main(String[] args) {

        int[] arr = {78, 89, 99, 87, 76, 56, 87, 56, 78, 58, 45, 84};
        getAvg(arr);
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int count = 0;
        int avg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (avg < arr[i]) {
                count++;
            }
        }
        System.out.println(avg);
        System.out.println(count);
        return count;


    }
}
