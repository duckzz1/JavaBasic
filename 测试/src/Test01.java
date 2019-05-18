/**
 * @author by Yang
 * @Test01
 * @
 * @date 2019/5/10 8:44
 */
public class Test01 {

    public static void main(String[] args) {
        MyCollection<String> mc= new MyCollection<String>();

        mc.set("aaa", 1);
        String str = mc.get(1);

        System.out.println(str);

    }


}
class MyCollection<E> {
    Object[] objs = new Object[5];

    public void set(E e, int index) {
        objs[index] = e;
    }

    public E get(int index) {
        return (E)objs[index];
    }
}