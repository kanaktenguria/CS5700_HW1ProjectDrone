package FlyBehaviour;
import Message.*;
import Communicator.Socket;

public class MissionLeftRotateRight implements FlyBehaviour {
    private Message message;
    private Socket socket;
    public MissionLeftRotateRight(Socket socket){
        this.socket = socket;

    }
    @Override
    public void doMission() throws Exception {
        message= new TakeOff(this.socket);
        message.doAction();
        message=new MoveLeft(this.socket);
        message.doAction();
        message= new RotateAntiClockWise(this.socket);
        message.doAction();
        message=new MoveRight(this.socket);
        message.doAction();
        message= new Land(this.socket);
        message.doAction();
        System.out.println("Mission completed.");
    }
}
