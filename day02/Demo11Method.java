package day02;

public class Demo11Method {
    public static void main(String[] args) {
        farmer(); // 调用农民的方法
        seller(); // 调用小商贩的方法
        cook(); // 调用厨子的方法
        me(); // 调用我自己的方法
    }

    // 厨子
    public static void cook() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    // 我
    public static void me() {
        System.out.println("吃");
    }

    // 小商贩
    public static void seller() {
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
    }

    // 农民伯伯
    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }
}
