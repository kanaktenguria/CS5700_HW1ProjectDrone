package Message;
import Communicator.Socket;

public class TakeOff implements Message {
    private Socket socket;
    public TakeOff(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void doAction() throws Exception {
        this.socket.sendRequest("takeoff");
        Thread.sleep(5000);
    }
}
