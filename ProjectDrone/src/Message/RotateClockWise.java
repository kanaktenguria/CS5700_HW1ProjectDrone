package Message;
import Communicator.Socket;

public class RotateClockWise implements Message {
    private Socket socket;
    public RotateClockWise(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("cw 360");
        Thread.sleep(5000);
    }
}
