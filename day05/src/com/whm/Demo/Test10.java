package com.whm.Demo;

public class Test10 {
    public static void main(String[] args) {

        int[]  arr = {11,22,45,56,34,23,45};
        int avg = score(arr);
        System.out.println("avg = " + avg);
    }

    public static int score(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];

        }else if(min > arr[i]){
                min = arr[i];

            }
        }
        int avg = (sum - max - min)/(arr.length - 2);
        return avg;

    }
}
