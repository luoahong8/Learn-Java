package day03;

public class Demo12HundredSum {
    public static void main(String[] args) {
        int sum = 0; // 用来累加的存钱罐

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 如果是偶数
                sum += i;
            }
        }
        System.out.println("结果是：" + sum);
    }
}
