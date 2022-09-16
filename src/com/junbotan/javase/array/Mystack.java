package com.junbotan.javase.array;

/**
 * @author Tan
 * @date 2022年03月31日 14:06
 */

/*
第一题：
    编写程序，使用一维数组，模拟栈数据结构。
    要求：
    1、这个栈可以存储java中的任何引用类型的数据。
    2、在栈中提供push方法模拟压栈。(栈满了，要有提示信息。)
    3、在栈中提供pop方法模拟弹栈。(栈空了，也有有提示信息。)
    4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
    5、假设栈的默认初始容量是3。(请注意无参构造的编写方式)
*/

public class Mystack {
    private Object[] elements;
    private int index;

    public Mystack() {
        this.elements = new Object[5];
        this.index = -1;
    }

    public Mystack(Object[] obj, int index) {
        this.elements = obj;
        this.index = index;
    }

    public Object getObj() {
        return elements;
    }

    public void setObj(Object[] obj) {
        this.elements = obj;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    /**
     *压栈操作
     * @author Tan
     * @date 2022/3/31 14:35
     * @param object 被压入的元素
     */
    public void push(Object object) {
        //首先判断是否满栈
        if (this.index == this.elements.length - 1){
            System.out.println("栈已满！");
            return;
        }
        //进行到这里说明栈未满
        this.index++;
        this.elements[this.index] = object;
        System.out.println("已经将"+object+"压栈，当前栈帧指向" + this.index);
    }
    /**
     *弹栈操作
     * @author Tan
     * @date 2022/3/31 14:36
     * @return java.lang.Object 被弹出的元素
     */
    public Object pop(){
        //首先判断是否空栈
        if (this.index == -1) {
            System.out.println("栈已空");
            return null;
        }
        //进行到这里，说明栈未空
        System.out.println("弹出"+this.elements[this.index]+"元素，栈帧指向" + --this.index);
        return  null;
    }
}
