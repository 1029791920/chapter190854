package com.junbotan.javase.leetcode;

/**
 * @Author Tan
 * @date 2022年09月14日 18:46
 */
public class Test {
    public static void main(String[] args) {
        try{
            int i =100 / 0;
            System.out.println(i);
        }catch(Exception e){
            System.out.println(1);
            throw new RuntimeException();
        }finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
