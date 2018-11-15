package com.whm.Demo;

public class Demo112 {
    public static void main(String[] args) {
//       定义数组
        int[] arr = {11,2,33,44,5,6,7};
//用for进行交换
        for(int start = 0,end = arr.length - 1;start < end ; start ++ ,end --){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
//定义两个变量用while进行交换
        int start = 0;
        int end = arr.length - 1;

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
