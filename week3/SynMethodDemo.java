package week3;

public class SynMethodDemo implements Runnable{
    public void run() { Lock(); }

    
    public static synchronized void Lock()
    {
        
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

   
    public static void main(String[] args)
    {
        
        SynMethodDemo g1 = new SynMethodDemo();

        Thread t1 = new Thread(g1);

        
        Thread t2 = new Thread(g1);

       
        SynMethodDemo g2 = new SynMethodDemo();

      
        Thread t3 = new Thread(g2);

       
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }

}    