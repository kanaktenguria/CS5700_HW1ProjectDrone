public class Land extends Message {
    public Land(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("land");
        Thread.sleep(5000);
    }
}
