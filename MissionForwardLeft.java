public class MissionForwardLeft implements FlyBehaviour {
    Message message;
    private Communicator communicator;
    public MissionForwardLeft(Communicator communicator){
        this.communicator= communicator;

    }
    @Override
    public void doMission() throws Exception {
        message= new TakeOff(this.communicator);
        message.doAction();
        message=new MoveForward(this.communicator);
        message.doAction();
        message= new MoveLeft(this.communicator);
        message.doAction();
        message=new MoveBackward(this.communicator);
        message.doAction();
        message= new Land(this.communicator);
        message.doAction();
    }
}
