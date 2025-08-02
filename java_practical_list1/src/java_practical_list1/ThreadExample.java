// Approach 1: Extending Thread
package java_practical_list1;
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread1: " + i);
        }
    }
}

// Approach 2: Implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyRunnable: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();           // Thread class
        Thread t2 = new Thread(new MyRunnable()); // Runnable with Thread

        t1.start();
        t2.start();
    }
}
