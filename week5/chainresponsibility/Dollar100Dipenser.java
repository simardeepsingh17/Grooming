package week5.chainresponsibility;

public class Dollar100Dipenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Integer cur) {
        if (cur >= 100) {
            int num = cur / 100;
            int remainder = cur % 100;
            System.out.println("Dispensing " + num + " 100$ note");
            if (remainder != 0)
                this.chain.dispense((remainder));
        } else {
            this.chain.dispense(cur);
        }
    }

}
