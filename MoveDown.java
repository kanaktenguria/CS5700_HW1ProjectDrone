public class MoveDown extends Message {
    public MoveDown(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception {
        communicator.sendRequest("down 50");
        Thread.sleep(5000);
    }
}
