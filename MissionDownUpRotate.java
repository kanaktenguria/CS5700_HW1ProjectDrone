public class MissionDownUpRotate implements FlyBehaviour {
    Message message;
    private Communicator communicator;
    public MissionDownUpRotate(Communicator communicator){
        this.communicator= communicator;

    }
    @Override
    public void doMission() throws Exception {
        message= new TakeOff(this.communicator);
        message.doAction();
        message=new MoveDown(this.communicator);
        message.doAction();
        message= new MoveUp(this.communicator);
        message.doAction();
        message=new RotateClockWise(this.communicator);
        message.doAction();
        message= new Land(this.communicator);
        message.doAction();
    }
}
