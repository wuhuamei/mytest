package com.whm.Demo;
//比较数组
public class Test7 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int[] arr1 = { 1,2,3,4,5};
boolean a = equals(arr,arr1);
        System.out.println("是否一致：" + a);


        }

    public static  boolean equals(int[] arr,int[] arr1){
        boolean a =  true;
        if(arr.length ==  arr1.length){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == arr1[i]){
                    a = true;
            }else {
                    a = false;
                }
        }

    }
return a;
    }
}
