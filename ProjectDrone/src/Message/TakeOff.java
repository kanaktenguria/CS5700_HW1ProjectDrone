package Message;
import Communicator.DroneCommunicator;

public class TakeOff extends Message {
//    private DroneCommunicator droneCommunicator;
//    public TakeOff(DroneCommunicator droneCommunicator) {
//        this.droneCommunicator = droneCommunicator;
//    }

    @Override
    public void doAction(DroneCommunicator droneCommunicator) throws Exception {
        droneCommunicator.sendRequest("takeoff");
        Thread.sleep(5000);
    }
}
