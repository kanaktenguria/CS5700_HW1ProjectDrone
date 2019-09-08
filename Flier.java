public class Flier{
    FlyBehaviour flyBehaviour;
    public Flier(String iPAddress, int dronePort, int missionNumber) throws Exception {
        Communicator communicator= new Communicator(iPAddress, dronePort);
        if(missionNumber==1){
            MissionForwardLeft missionForwardLeft=new MissionForwardLeft(communicator);
            flyBehaviour=missionForwardLeft;
        }

        if(missionNumber==2){
            MissionDownUpRotate missionDownUpRotate=new MissionDownUpRotate(communicator);
            flyBehaviour= missionDownUpRotate;
        }

        if(missionNumber==3){
            MissionLeftRotateRight missionLeftRotateRight=new MissionLeftRotateRight(communicator);
            flyBehaviour= missionLeftRotateRight;
        }
    }

    public void doMission() throws Exception {
        flyBehaviour.doMission();
    }
}
