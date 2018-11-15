package com.whm.Demo;
//答题 评分
public class Test8 {
    public static void main(String[] args) {
        String[] 传 = {"B","D","B","B","B"};
        String[] 智 = {"C","C","B","B","A"};
        String[] 播 = {"B","D","C","B","A"};
        String[] 客 = {"A","D","B","B","C"};
        String[] a =  {"A","B","C","B","C"};

int b = score(a,传);
        System.out.println(b);
        int b1 = score(a,智);
        System.out.println(b1);
        int b2 = score(a,播);
        System.out.println(b2);
        int b3 = score(a,客);
        System.out.println(b3);





    }

    public static int score(String[] arr,String[] arr1) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr1[i]){
                a += 2;
            }
        }
        return a;
    }
}
