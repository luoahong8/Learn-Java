package day02;

public class Demo03DataTypeChar {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0); // 49

        char zifu2 = 'A'; // 其实底层保存的是65数字

        char zifu3 = 'c';
        // 左侧是int类型，右边是char类型，
        // char --> int，确实是从小到大
        // 发生了自动类型转换
        int num = zifu3;
        System.out.println(num); // 99

        char zifu4 = '中'; // 正确写法
        System.out.println(zifu4 + 0); // 20013
    }
}
