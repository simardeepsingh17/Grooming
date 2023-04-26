package week5.chainresponsibility;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Integer cur) {
        if (cur >= 20) {
            int num = cur / 20;
            int remainder = cur % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (remainder != 0)
                this.chain.dispense((remainder));
        } else {
            this.chain.dispense(cur);
        }
    }
}
