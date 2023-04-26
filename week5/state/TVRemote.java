package week5.state;

public class TVRemote {

    public static void main(String[] args) {
        TvContext context = new TvContext();
        State tvStartState = new TvStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();

    }

}