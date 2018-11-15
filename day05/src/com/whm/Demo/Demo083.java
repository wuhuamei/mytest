package com.whm.Demo;
//数组遍历：就是依次拿到数组的每一个元素
public class Demo083 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,23,34,45,56,443};

//    快速写法 arr.lenght.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
