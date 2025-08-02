package java_practical_list1;

class DemoThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            if (i == 2) Thread.yield();
        }
    }
}

class WaitNotifyDemo {
    final Object lock = new Object();

    void execute() {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting...");
                    lock.wait();
                    System.out.println("Notified!");
                } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Sending notify...");
                lock.notify();
            }
        });

        t1.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        t2.start();
    }
}

public class ThreadControlDemo {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();
        t1.start();
        t2.start();

        WaitNotifyDemo wnd = new WaitNotifyDemo();
        wnd.execute();
    }
}
