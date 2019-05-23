package Algo;

import java.util.ArrayList;
import java.util.Collection;

public class LList {
    public static void main(String[] args) {


    }

    public static void testList() {

        Collection<String> c = new ArrayList<>();

        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("aaa");
        c.add("bbb");
        System.out.println(c);
        System.out.println(c.size());

        //移除，非删除该对象
        c.remove("bbb");
        System.out.println(c);

        c.clear();
        System.out.println(c.size());

        Object[] arr = c.toArray();

        System.out.println(c.contains("sss"));
    }

    public static void testTwoList() {
        Collection<String> c = new ArrayList<>();
        Collection<String> c1 = new ArrayList<>();

        c.add("aa");
        c.add("bb");
        c.add("cc");

        c1.add("aa");
        c1.add("dd");
        c1.add("ee");

        System.out.println("c :" + c);
        System.out.println("c1 :" + c1);

        c.addAll(c1);
        System.out.println("c.addAll(c1) : " + c);

        c.removeAll(c1);
        System.out.println("c.removeAll(c1) : " + c);

        c.retainAll(c1);
        System.out.println("c.retainAll(c1) : " + c);
    }
}
