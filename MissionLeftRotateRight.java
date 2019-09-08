public class MissionLeftRotateRight implements FlyBehaviour {
    Message message;
    private Communicator communicator;
    public MissionLeftRotateRight(Communicator communicator){
        this.communicator= communicator;

    }
    @Override
    public void doMission() throws Exception {
        message= new TakeOff(this.communicator);
        message.doAction();
        message=new MoveLeft(this.communicator);
        message.doAction();
        message= new RotateAntiClockWise(this.communicator);
        message.doAction();
        message=new MoveRight(this.communicator);
        message.doAction();
        message= new Land(this.communicator);
        message.doAction();
    }
}
