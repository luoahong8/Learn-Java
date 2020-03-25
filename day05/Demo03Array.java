package day05;

public class Demo03Array {
    public static void main(String[] args) {
        // 省略格式的静态初始化
        int[] arrayA = { 10, 20, 30 };

        // 静态初始化的标准格式，可以拆分成为两个步骤
        int[] arrayB;
        arrayB = new int[] { 11, 21, 31 };

        // 动态初始化也可以拆分成为两个步骤
        int[] arrayC;
        arrayC = new int[5];

        // 静态初始化的省略格式，不能拆分成为两个步骤。
        // int[] arrayD;
        //arrayD = { 10, 20, 30 };
    }

}
