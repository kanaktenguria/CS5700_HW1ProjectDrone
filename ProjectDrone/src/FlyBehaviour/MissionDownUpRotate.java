package FlyBehaviour;
import Message.*;
import Communicator.Socket;

public class MissionDownUpRotate implements FlyBehaviour {
    private Message message;
    private Socket socket;
    public MissionDownUpRotate(Socket socket){
        this.socket = socket;

    }
    @Override
    public void doMission() throws Exception {
        message= new TakeOff(this.socket);
        message.doAction();
        message=new MoveDown(this.socket);
        message.doAction();
        message= new MoveUp(this.socket);
        message.doAction();
        message=new RotateClockWise(this.socket);
        message.doAction();
        message= new Land(this.socket);
        message.doAction();
        System.out.println("Mission completed.");
    }
}
