package Communicator;
import FlyBehaviour.FlyBehaviour;

class Flier{
    private FlyBehaviour flyBehaviour;
    private Socket socket;

    Flier(String iPAddress, int dronePort, FlyBehaviour mission) throws Exception {
        socket = new Socket(iPAddress, dronePort);
        this.flyBehaviour=mission;
    }

    void doMission() throws Exception {
        flyBehaviour.doMission(socket);
    }
}
