package com.whm.Demo;
//数组遍历：依次拿到数组的每个元素
public class Demo082 {
    public static void main(String[] args) {
        int[] arr =  new int[]{11,22,33,4,4,44,5};

//        快速写法 arr.length.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
