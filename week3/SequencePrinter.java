package week3;

public class SequencePrinter {
    
    private static final int NUMBER_OF_THREADS = 3;
    private static final int TOTAL_NUMBERS_IN_SEQ = 10;

    public static void main(String[] args) {
        NumbersGenerator numbersGenerator = new NumbersGenerator(NUMBER_OF_THREADS, TOTAL_NUMBERS_IN_SEQ);

        Thread t1 = new Thread(new SequenceGenerator(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new SequenceGenerator(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new SequenceGenerator(numbersGenerator, 0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class NumbersGenerator {
    private int currNumber = 1;
    private int numOfThreads;
    private int totalNumbersInSeq;

    public NumbersGenerator(final int numOfThreads, final int totalNumbersInSeq) {
        this.numOfThreads = numOfThreads;
        this.totalNumbersInSeq = totalNumbersInSeq;
    }

    public void printNumber(int index) {
        synchronized (this) {
            while(currNumber < totalNumbersInSeq-1) {
                while (currNumber % numOfThreads != index) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " : " + currNumber++);
                notifyAll();
            }
        }
    }
}

class SequenceGenerator implements Runnable {

    private NumbersGenerator numbersGenerator;
    private int index;

    public SequenceGenerator(NumbersGenerator numbersGenerator, int index) {
        this.numbersGenerator = numbersGenerator;
        this.index = index;
    }

    @Override
    public void run() {
        numbersGenerator.printNumber(this.index);
    }
}
