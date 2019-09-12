package Message;
import Communicator.DroneCommunicator;

public class MoveForward extends Message {
//    private DroneCommunicator droneCommunicator;
//    public MoveForward(DroneCommunicator droneCommunicator) {
//        this.droneCommunicator = droneCommunicator;
//    }

    @Override
    public void doAction(DroneCommunicator droneCommunicator) throws Exception{
        droneCommunicator.sendRequest("forward 50");
        Thread.sleep(5000);
    }
}
