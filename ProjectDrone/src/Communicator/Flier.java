package Communicator;
import FlyBehaviour.FlyBehaviour;
import FlyBehaviour.MissionDownUpRotate;
import FlyBehaviour.MissionForwardLeft;
import FlyBehaviour.MissionLeftRotateRight;

class Flier{
    private FlyBehaviour flyBehaviour;
    Flier(String iPAddress, int dronePort, int missionNumber) throws Exception {
        Socket socket = new Socket(iPAddress, dronePort);
        if(missionNumber==1){
            MissionForwardLeft missionForwardLeft=new MissionForwardLeft(socket);
            flyBehaviour=missionForwardLeft;
        }

        if(missionNumber==2){
            MissionDownUpRotate missionDownUpRotate=new MissionDownUpRotate(socket);
            flyBehaviour= missionDownUpRotate;
        }

        if(missionNumber==3){
            MissionLeftRotateRight missionLeftRotateRight=new MissionLeftRotateRight(socket);
            flyBehaviour= missionLeftRotateRight;
        }
    }

    void doMission() throws Exception {
        flyBehaviour.doMission();
    }
}
