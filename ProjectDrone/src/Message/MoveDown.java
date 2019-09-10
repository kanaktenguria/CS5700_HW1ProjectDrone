package Message;
import Communicator.Socket;

public class MoveDown implements Message {
    private Socket socket;
    public MoveDown(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("down 50");
        Thread.sleep(5000);
    }
}
