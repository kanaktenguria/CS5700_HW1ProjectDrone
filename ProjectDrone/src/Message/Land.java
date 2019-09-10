package Message;
import Communicator.Socket;

public class Land implements Message {
    private Socket socket;
    public Land(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("land");
        Thread.sleep(5000);
    }
}
