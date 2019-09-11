package FlyBehaviour;
import Message.*;
import Communicator.Socket;

public class MissionDownUpRotate implements FlyBehaviour {
    //    public MissionDownUpRotate(){
//
//
//    }
    @Override
    public void doMission(Socket socket) throws Exception {
        Message message;
        message= new CommandMode(socket);
        message.doAction();
        message= new TakeOff(socket);
        message.doAction();
        message=new MoveDown(socket);
        message.doAction();
        message= new MoveUp(socket);
        message.doAction();
        message=new RotateClockWise(socket);
        message.doAction();
        message= new Land(socket);
        message.doAction();
        System.out.println("Mission completed.");
    }
}
