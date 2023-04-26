package week5.chainresponsibility;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Integer cur) {
        if (cur >= 50) {
            int num = cur / 50;
            int remainder = cur % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder != 0)
                this.chain.dispense((remainder));
        } else {
            this.chain.dispense(cur);
        }
    }

}