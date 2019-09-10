package Message;
import Communicator.Socket;

public class RotateAntiClockWise implements Message {
    private Socket socket;
    public RotateAntiClockWise(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void doAction() throws Exception {
        socket.sendRequest("ccw 360");
        Thread.sleep(5000);
    }
}
