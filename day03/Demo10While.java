package day03;

public class Demo10While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("我错啦！" + i);
        }
        System.out.println("=================");

        int i = 1; // 1. 初始化语句
        while (i <= 10) { // 2. 条件判断
            System.out.println("我错啦！" + i); // 3. 循环体
            i++; // 4. 步进语句
        }
    }
}
