package Message;
import Communicator.Socket;

public class MoveLeft implements Message {
    private Socket socket;
    public MoveLeft(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("left 50");
        Thread.sleep(5000);
    }
}
