package FlyBehaviour;
import Message.*;
import Communicator.Socket;

public class MissionLeftRotateRight implements FlyBehaviour {

//    public MissionLeftRotateRight(){
//
//    }
    @Override
    public void doMission(Socket socket) throws Exception {
        Message message;
        message= new CommandMode(socket);
        message.doAction();
        message= new TakeOff(socket);
        message.doAction();
        message=new MoveLeft(socket);
        message.doAction();
        message= new RotateAntiClockWise(socket);
        message.doAction();
        message=new MoveRight(socket);
        message.doAction();
        message= new Land(socket);
        message.doAction();
        System.out.println("Mission completed.");
    }
}
