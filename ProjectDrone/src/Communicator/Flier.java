package Communicator;
import FlyBehaviour.FlyBehaviour;

class Flier{
    private DroneCommunicator droneCommunicator;

    public void initialize(String iPAddress, int dronePort) throws Exception {
        droneCommunicator = new DroneCommunicator(iPAddress, dronePort);
        droneCommunicator.initialize();
    }

    void doMission(FlyBehaviour flyBehaviour) throws Exception {
        flyBehaviour.doMission(droneCommunicator);
    }
}
