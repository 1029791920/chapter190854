package com.junbotan.javase;

import java.util.ArrayList;

/**
 * @author Tan
 * @date 2022年09月13日 9:37
 */
public class Demo1 {
    public static void main(String[] args) {
        int result =0;
        for(int i = 0; i <= 100 ; i++) {
            for(int j = 0; j <= 50 ; j++) {
                for(int k = 0; k <= 20; k++) {
                    if(i + j*2 + k*5 == 100){
                        result++;
                        System.out.println("i = " + i+ "j = " + j+"k = " + k);
                    }



                }

            }
        }
        System.out.println(result);
    }
}
