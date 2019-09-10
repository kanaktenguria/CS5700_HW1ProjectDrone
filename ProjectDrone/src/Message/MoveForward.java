package Message;
import Communicator.Socket;

public class MoveForward implements Message {
    private Socket socket;
    public MoveForward(Socket socket) {
        this.socket= socket;
    }

    @Override
    public void doAction() throws Exception{
        socket.sendRequest("forward 50");
        Thread.sleep(5000);
    }
}
