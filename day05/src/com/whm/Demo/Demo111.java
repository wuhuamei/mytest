package com.whm.Demo;
/*数组反转核心原理：最远两端换位置
* 1.定义两个变量用于记录小索引和大索引
* 2.大小对应的元素换位置
* 3.小索引++，大索引--
*
* */
public class Demo111 {
    public static void main(String[] args) {
//       定义数组
        int[] arr = { 11,22,33,44,55,66,77};
//用for进行交换
        for (int start = 0,end = arr.length - 1;start < end;start ++ ,end --){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
//用 while进行交换
        int start = 0;
        int end = arr.length - 1;
        while( start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + "!");
        }

    }
}
