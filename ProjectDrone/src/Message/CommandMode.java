package Message;

import Communicator.Socket;

public class CommandMode implements Message{
    private Socket socket;
    public CommandMode(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void doAction() throws Exception {
        int maxRetries = 3;
        while (maxRetries > 0){
            socket.sendRequest("command");
            String reply= socket.receiveRequest();
            if (reply.equals("ok")) {
                System.out.println("Entering command mode.. \nSending mission commands.");
                break;
            }
            System.out.println("Remaining retries: " + maxRetries);
            maxRetries--;
        }
    }
}
