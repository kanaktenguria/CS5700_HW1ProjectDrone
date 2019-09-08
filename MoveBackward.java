public class MoveBackward extends Message {
    public MoveBackward(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("back 50");
        Thread.sleep(5000);
    }
}
