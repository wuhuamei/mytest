package com.whm.Demo;
//去掉最大 最小 求平均值
public class Demo131 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = { 1,2,3,4,4};
//求最大值，最小值
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }else if (min > arr[i]){
                min = arr[i];
            }
        }
//      求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i];
            }
//            求平均值
int avg = (sum - max - min)/(arr.length - 2);
        System.out.println(avg);
    }
}
