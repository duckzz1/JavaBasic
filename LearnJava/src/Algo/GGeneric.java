package Algo;

public class GGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();

        mc.set("aa", 0);

        String b = mc.get(0);

        System.out.println(b);
    }
}

class MyCollection<E> {
    Object[] objs = new Object[5];

    public  void set(E e, int index) {
        objs[index] = e;
    }

    public E get(int index) {
        return (E)objs[index];
    }
}