package com.whm.test;

public class Test28 {
    public static void main(String[] args) {
        int count = 0;//计数

        System.out.println("能同时被3和5整除的数有：");

        for (int i = 1; i <= 500; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();

                }
            }

        }
        System.out.println();
        System.out.print("能同时被3和5整除的个数有：" + count);
    }}
