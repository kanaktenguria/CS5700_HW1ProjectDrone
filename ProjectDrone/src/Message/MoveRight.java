package Message;
import Communicator.Socket;

public class MoveRight implements Message {
    private Socket socket;
    public MoveRight(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("right 50");
        Thread.sleep(5000);
    }
}
