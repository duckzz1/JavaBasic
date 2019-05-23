package someclass;

import java.io.File;

/**
 * 递归打印目录树
 */

public class PrintFileTree {
    public static void main(String[] args) {
        File f = new File("F:\\01. java300集【北京尚学堂·百战程序员】");

        printFile(f, 0);

    }

    static void printFile(File file, int level) {

        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }

        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File temp : files) {
                printFile(temp, level + 1);
            }
        }
    }
}
