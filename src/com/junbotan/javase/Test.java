package com.junbotan.javase;

/**
 * @Author Tan
 * @date 2022年09月14日 18:39
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
    public void start(){
        int i = 5;
        Value v = new Value();
        v.i = 25;
        change(v,i);
        System.out.println(v.i);
    }
    public void change(Value v, int i){
        i = 0;
        v.i = 20;

        Value val = new Value();
        v = val;
        System.out.println(v.i + "" + i);

        }
    static class Value{
        public int i = 15;
    }
}


