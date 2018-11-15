package com.whm.Demo;
//数组的反转
public class Demo113 {
    public static void main(String[] args) {
//        定义数组
        int[] arr = {11,22,3,0,4,5,5,5};
//用for实现反转
        for (int start = 0,end = arr.length - 1;start < end;start ++, end --){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
// 用while实现反转
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
