public class MoveLeft extends Message {
    public MoveLeft(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("left 50");
        Thread.sleep(5000);
    }
}
