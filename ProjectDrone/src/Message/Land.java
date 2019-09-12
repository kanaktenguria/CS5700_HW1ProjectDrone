package Message;
import Communicator.DroneCommunicator;

public class Land extends Message {
//    private DroneCommunicator droneCommunicator;
//    public Land(DroneCommunicator droneCommunicator) {
//        this.droneCommunicator = droneCommunicator;
//    }

    @Override
    public void doAction(DroneCommunicator droneCommunicator) throws Exception {
        droneCommunicator.sendRequest("land");
        Thread.sleep(5000);
    }
}
