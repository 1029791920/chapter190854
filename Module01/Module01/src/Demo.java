/**
 * @Author Tan
 * @date 2022年09月15日 16:14
 */
public class Demo {
    static Demo demo = new Demo();

    static  int a ;
    static  int b =1;
    Demo(){
        a++;
        b++;

    }
    static Demo getInstance(){
        return demo;
    }

    public static void main(String[] args) {
        Demo demo = Demo.getInstance();
        System.out.println(a+ "" + b);
    }
}
