package com.whm.Demo;
//数组遍历
//什么是数组遍历：
//就是依次拿到数组中的每个元素
public class Demo081 {
    public static void main(String[] args) {
int[] arr = new int[] {11,22,33,44,55,66};

//快速写法 arr.length.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
}
