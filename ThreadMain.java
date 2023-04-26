

public class ThreadMain {
    public static void main(String[] args) {
        
        Thread t=new Thread(){
            public void run(){
                System.out.println("anonymous thread");
            }
        };
        t.start(); 

         Thread t1 = new Thread1();
         t1.start();  

         Thread t2= new Thread(new Thraed2());
         t2.start();

         Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'run'");
            }
         });
         t3.start();   



    }
}
