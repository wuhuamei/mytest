package com.whm.Demo;

public class Test9 {
    public static void main(String[] args) {
        String[] 花色 = {"黑桃","梅花","方块","红心"};
        String[] 点数 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

            for (int i = 0; i < 花色.length; i++) {
                for (int i1 = 0; i1 < 点数.length; i1++) {
                System.out.print(花色[i] + 点数[i1] + "\t");
            }
            System.out.println();
        }
    }
}
