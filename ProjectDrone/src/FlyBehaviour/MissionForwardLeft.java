package FlyBehaviour;
import Message.*;
import Communicator.DroneCommunicator;

public class MissionForwardLeft extends FlyBehaviour {
//    public MissionForwardLeft(){
//
//    }
    @Override
    public void doMission(DroneCommunicator droneCommunicator) throws Exception {
        Message message;
//        message= new CommandMode();
//        message.doAction(droneCommunicator);
        message= new TakeOff();
        message.doAction(droneCommunicator);
        message=new MoveForward();
        message.doAction(droneCommunicator);
        message= new MoveLeft();
        message.doAction(droneCommunicator);
        message=new MoveBackward();
        message.doAction(droneCommunicator);
        message= new Land();
        message.doAction(droneCommunicator);
        System.out.println("Mission completed.");
    }
}
