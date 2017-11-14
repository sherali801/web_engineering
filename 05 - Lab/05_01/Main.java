public class Main {
    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();
        ThreadDemo t1 = new ThreadDemo(printDemo);
        ThreadDemo t2 = new ThreadDemo(printDemo);
        t1.setName("1");
        t2.setName("2");
        t1.start();
        t2.start();
    }
}
