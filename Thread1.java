
public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            System.out.println("interupted");
            return;
        }
        System.out.println("three seconds passed anbd i wake up");
    }

}