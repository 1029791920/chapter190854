import sun.reflect.generics.tree.ReturnType;

import static jdk.internal.org.objectweb.asm.Type.getType;

/**
 * @Author Tan
 * @date 2022年09月15日 16:02
 */
public class Demo2 {
    public static void main(String[] args) {
        int int1 =1;
        int int2 =1;
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        Integer a1 =127;
        Integer a2 = 127;
        Integer b1 =128;
        Integer b2 = 128;
        System.out.println(int1==int2);
        System.out.println(integer1==integer2);
        System.out.println(a1==a2);
        System.out.println(b1==b2);


        byte x =1 ;
        double y =1.0;
        System.out.println(getType(String.valueOf(x/y)));
    }

}
