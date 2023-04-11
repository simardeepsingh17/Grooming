package week3;

public class SynMethodDemo implements Runnable{
    public void run() { Lock(); }

    // Method is static
    public static synchronized void Lock()
    {
        // Getting the name of current thread by using
        // getName() method to get name of the thread and
        // currentThread() to get the current thread
        System.out.println(
                Thread.currentThread().getName());

        // class level lock
        synchronized (SynMethodDemo.class)
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }

    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of above class
        // in the main() method
        SynMethodDemo g1 = new SynMethodDemo();

        // Sharing the same object across two Threads

        // Creating an object of thread class where
        // t1 takes g1
        Thread t1 = new Thread(g1);

        // Creating an object of thread class where
        // t2 takes g1
        Thread t2 = new Thread(g1);

        // Creating second object of above class
        // in the main() method
        SynMethodDemo g2 = new SynMethodDemo();

        // Creating an object of thread class where
        // t3 takes g2
        Thread t3 = new Thread(g2);

        // setName() method is used to set name to the
        // thread
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        // start() method is used for initiating the current
        // thread
        t1.start();
        t2.start();
        t3.start();
    }

}    