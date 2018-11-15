package com.whm.Demo;

//获取数组最小值
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if(min > arr[i]){
            min = arr[i];
        }
        }
        System.out.println("min为：" + min);
    }
}
