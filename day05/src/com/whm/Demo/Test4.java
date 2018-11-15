package com.whm.Demo;

//定义方法 打印
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {22, 33, 22, 34, 45, 56};
        printBall(arr);
    }

    public static void printBall(int[] arr) {
        System.out.print("您的双色球号码为：");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "\t");
        }
    }
}
