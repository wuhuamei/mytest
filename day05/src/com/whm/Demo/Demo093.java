package com.whm.Demo;

public class Demo093 {
    public static void main(String[] args) {
//       定义数组
        int[] arr = {11,34,45,465,223,23};
//定义变量接收最大值
        int max = arr[0];
//遍历并进行比较
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max =  arr[i];
            }
        }
        System.out.println(max);
    }
}
