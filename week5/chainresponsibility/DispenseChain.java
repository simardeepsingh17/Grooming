package week5.chainresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Integer cur);
}
