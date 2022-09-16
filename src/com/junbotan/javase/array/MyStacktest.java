package com.junbotan.javase.array;

/**
 * @author Tan
 * @date 2022年03月31日 14:37
 */
public class MyStacktest {
    public static void main(String[] args) {
        Mystack st = new Mystack();
        st.push(new Object());
        st.push(new Object());
        st.push(new Object());
        st.push(new Object());
        st.push(new Object());

        //栈已满
        st.push(new Object());

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

        //栈已空
        st.pop();
    }

}
