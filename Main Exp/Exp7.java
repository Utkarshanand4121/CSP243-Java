public class Exp7 {
    public int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Exp7 result = new Exp7();
        int ans1 = result.add(5, 7);
        int ans2 = result.add(6, 7, 8);
        System.out.println("Result of add(5,7): "+ans1);
        System.out.println("Result of add(6,7,8): " +ans2);
    }
}
