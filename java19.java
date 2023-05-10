import java.util.Scanner;

// Multi Therading by inheriting Therad Class.
class MyThread extends Thread {
    public void run() {
        System.out.println("Child Thread");
    }
}

public class java19 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        t1.setPriority(1);
        Thread t = Thread.currentThread(); // thread t is refering to the main thread.
        System.out.println("Name of current therad is " + Thread.currentThread().getName());
        System.out.println("Priority of current thread is " + Thread.currentThread().getPriority());
        t.setName("Execution Thread"); // Changing name of main therad.
        t.setPriority(2); // Changing priority of main thread.
        System.out.println("Name of current therad is " + Thread.currentThread().getName());
        System.out.println("Priority of current thread is " + Thread.currentThread().getPriority());
    }
}
