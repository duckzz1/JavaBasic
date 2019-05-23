package exception;

public class CustomException {
    public static void main(String[] args) throws IllegalAgeException {
        Person p = new Person();
        p.setAge(-1);
    }
}

class IllegalAgeException extends Exception {

    public IllegalAgeException() {

    }
    public IllegalAgeException(String msg) {
        super(msg);
    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}