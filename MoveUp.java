public class MoveUp extends Message {
    public MoveUp(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("up 50");
        Thread.sleep(5000);
    }
}
