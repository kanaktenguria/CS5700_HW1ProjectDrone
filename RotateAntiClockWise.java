public class RotateAntiClockWise extends Message {
    public RotateAntiClockWise(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("ccw 360");
        Thread.sleep(5000);
    }
}
