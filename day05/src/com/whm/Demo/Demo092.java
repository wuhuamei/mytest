package com.whm.Demo;

public class Demo092 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = new int[]{11,23,66,343,32,45};
        /*int[] arr = {,,,,,,};
        int[] arr = new int[4];

        * */
//定义变量
        int max = arr[0];
//遍历并比较
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
