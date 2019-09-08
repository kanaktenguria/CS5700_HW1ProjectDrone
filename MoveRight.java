public class MoveRight extends Message {
    public MoveRight(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("right 50");
        Thread.sleep(5000);
    }
}
