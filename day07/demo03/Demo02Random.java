package day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(5); // 范围实际上是0~4
            System.out.println(num);
        }
    }
}
