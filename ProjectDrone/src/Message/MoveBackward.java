package Message;
import Communicator.Socket;

public class MoveBackward implements Message {
    private Socket socket;
    public MoveBackward(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("back 50");
        Thread.sleep(5000);
    }
}
