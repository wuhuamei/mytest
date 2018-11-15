package com.whm.Demo;

public class Demo133 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
//求max，min
        int max = arr[0] ;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }else if (min >  arr[i]){
                min = arr[i];
            }

        }
//        求sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
//        求平均分
        int avg = (sum - max - min)/(arr.length - 2);
        System.out.println("平均分为：" + avg);
    }

}


