public class ThreadDemo extends Thread {

    private PrintDemo printDemo;

    public ThreadDemo(PrintDemo printDemo) {

        this.printDemo = printDemo;

    }

    @Override
    public void run() {

        System.out.println("Starting Thread " + this.getName());

        synchronized(this.printDemo) {

            this.printDemo.print();

        }

        System.out.println("Thread " + this.getName() + " exiting");

    }

}
