public class MoveForward extends Message {
    public MoveForward(Communicator communicator) {
        super(communicator);
    }

    @Override
    public void doAction() throws Exception{
        communicator.sendRequest("forward 50");
        Thread.sleep(5000);
    }
}
