package Java8Features;
import java.util.*;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();  // starts a new thread and calls run()
    }
}

