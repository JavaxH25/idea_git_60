public class BaseController {
    public static void main(String[] args) {
        System.out.println("O(∩_∩)O哈哈~");
        System.out.println("左侧");
        int a = 0;
        int b = 2;
        add(a, b);
        System.out.println("哈哈");
    }

    public static void add(int a, int b) {
        a += b;
        System.out.println("好的呢，有" + a + "份你挑~~");

    }
}