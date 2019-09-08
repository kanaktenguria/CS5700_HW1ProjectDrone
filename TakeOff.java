public class TakeOff extends Message {
    public TakeOff(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        this.communicator.sendRequest("takeoff");
        Thread.sleep(5000);
    }
}
