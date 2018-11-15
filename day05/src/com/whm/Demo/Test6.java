package com.whm.Demo;
//比较是否对称
public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};

       int a = 0;

        for (int i = 0; i < arr.length/2; i++) {
           if(arr[i] == arr[arr.length - 1 - i]){
              a ++;
           }
        }
        boolean b = a == arr.length/2;
        System.out.println("是否对称：" + b);
    }
}
