package someclass;

/**
 * 测试枚举
 */

public class TestEnum {
    public static void main(String[] args) {

        Season a = Season.AUTUMN;
        System.out.println(a);

        switch (a) {
            case SPRING:{
                System.out.println("春天");
                break;
            }
            case SUMMER:{
                System.out.println("夏天");
                break;
            }
            case AUTUMN:{
                System.out.println("秋天");
                break;
            }
            case WINTER:{
                System.out.println("冬天");
                break;
            }
        }
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
