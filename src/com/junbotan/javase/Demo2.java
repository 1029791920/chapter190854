package com.junbotan.javase;
import java.util.*;


/**
 * @Author Tan
 * @date 2022年09月14日 15:10
 */

class B{
    static{
        System.out.println("load B");

    }
    public B(){
        System.out.println("creat B");
    }
}

class A extends B{
    static {
        System.out.println("load A");
    }
    public A(){
        System.out.println("creat A");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        new A();
    }

}
