package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * CCheckedException
 * 已检查异常
 * 使用try catch捕获异常
 * 使用throws声明异常
 */

public class CCheckedException {

    public static void main(String[] args) throws IOException {
        throwsException();
//        throwsException();
    }

    public static void throwsException() throws IOException {
        FileReader reader = null;
        reader = new FileReader("d:/b.txt");
        System.out.println("step1");
        char c1 = (char)reader.read();
        System.out.println(c1);

        if (reader != null) {
            reader.close();
        }

    }

    public static void tryCatchException() {
            FileReader reader = null;
            try {
                reader = new FileReader("d:/b.txt");
                System.out.println("step1");
                char c1 = (char)reader.read();

                System.out.println(c1);
            } catch(FileNotFoundException e) { //子类异常在父类前
                System.out.println("step2");
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("step3");
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
}
