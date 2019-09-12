package Message;
import Communicator.*;

public abstract class Message {
//    Socket socket;
//    public Message(Socket socket){
//        this.socket = socket;
//
//    }
    public abstract void doAction(DroneCommunicator droneCommunicator) throws Exception;
}
