package exception;

/**
 * 运行时异常
 * RuntimeException
 */

public class RRuntimeException {
    public static void main(String[] args) {
        int a = 0;
        if (a != 0) {
            System.out.println(100/a);
        }


        //空指针异常
        String str = null;
        if (str != null) {
            System.out.println(str);
        }


        //类型转换异常
        Animal cat = new Cat();
        Animal d = new Dog();
        if (d instanceof Cat) {
            d = (Dog) d;
        }

        //指针越界
        int[] arr = new int[5];
        int aa = 5;
        if (aa < arr.length) {
            System.out.println(arr[aa]);
        }

    }
}

class Animal {

}
class Cat extends Animal {

}
class Dog extends Animal {

}