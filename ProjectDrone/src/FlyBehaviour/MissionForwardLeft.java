package FlyBehaviour;
import Message.*;
import Communicator.Socket;

public class MissionForwardLeft implements FlyBehaviour {
//    public MissionForwardLeft(){
//
//    }
    @Override
    public void doMission(Socket socket) throws Exception {
        Message message;
        message= new CommandMode(socket);
        message.doAction();
        message= new TakeOff(socket);
        message.doAction();
        message=new MoveForward(socket);
        message.doAction();
        message= new MoveLeft(socket);
        message.doAction();
        message=new MoveBackward(socket);
        message.doAction();
        message= new Land(socket);
        message.doAction();
        System.out.println("Mission completed.");
    }
}
