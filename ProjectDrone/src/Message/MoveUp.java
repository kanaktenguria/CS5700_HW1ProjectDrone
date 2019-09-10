package Message;
import Communicator.Socket;

public class MoveUp implements Message {
    private Socket socket;
    public MoveUp(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("up 50");
        Thread.sleep(5000);
    }
}
