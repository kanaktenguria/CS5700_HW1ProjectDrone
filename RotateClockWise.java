public class RotateClockWise extends Message {
    public RotateClockWise(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("cw 360");
        Thread.sleep(5000);
    }
}
