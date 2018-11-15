package com.whm.Demo;
//获取数组最大值
public class Demo091 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,23,43,22,14};
//        定义一个变量接收最大值
        int max = arr[0];
//        遍历并进行比较
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
