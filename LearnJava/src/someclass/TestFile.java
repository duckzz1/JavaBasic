package someclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 */

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("d\\a.txt");
        System.out.println(f);
        f.renameTo(new File("d\\b.txt"));

        System.out.println(System.getProperty("user.dir"));

        File f2 = new File("LearnJava/src/fileclass/gg.ext");

        System.out.println("File是否存在 ：" + f2.exists());
        System.out.println("File是否是目录 ：" + f2.isDirectory());
        System.out.println("File是否是文件 ：" + f2.isFile());
        System.out.println("File最后的修改时间 ：" + new Date(f2.lastModified()));
        System.out.println("File的大小 ：" + f2.length());
        System.out.println("File的文件名 ：" + f2.getName());
        System.out.println("File的绝对路径 ：" + f2.getAbsolutePath());
        System.out.println("File的相对路径 ：" + f2.getPath());

        File f3 = new File("d:/a/b/c");
//        boolean flag = f3.mkdir();
//        System.out.println(flag);
//        无论是否存在该目录，都会生成目录树
        boolean flag = f3.mkdirs();
        System.out.println(flag);
    }
}
