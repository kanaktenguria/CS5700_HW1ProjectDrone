import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Communicator {
    int dronePort;
    InetAddress droneAddress;
    DatagramSocket udpClient =  new DatagramSocket();
//    String request= null;
    String reply = null;
    byte[] bytesToSent;
    byte[] bytesReceived;


    public Communicator(String iPAddress, int dronePort) throws Exception{
        droneAddress = InetAddress.getByName(iPAddress);
        this.dronePort= dronePort;
        udpClient.setSoTimeout(1000);

        int maxRetries = 3;
        while (maxRetries > 0){
        sendRequest("command");
        String reply= receiveRequest();
            if (reply.equals("ok")) {
                break;
            }
        }
        System.out.println("Remaining retries: " + maxRetries);
        maxRetries--;
    }

    public void sendRequest(String request) throws Exception{
        bytesToSent = request.getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytesToSent, bytesToSent.length, droneAddress, dronePort);
        udpClient.send(datagramPacket);
        System.out.println("Sent " + request + " bytes to " + droneAddress.toString() + ":" + dronePort);
    }

    public String receiveRequest() throws Exception{
        bytesReceived = new byte[64];
        DatagramPacket datagramPacket = new DatagramPacket(bytesReceived, 64);
        try {
            udpClient.receive(datagramPacket);
        }
        catch (SocketTimeoutException ex) {
            datagramPacket = null;
        }
        if (datagramPacket != null) {
//            System.out.println(String.format("Received %d bytes", datagramPacket.getLength()));
            reply = new String(bytesReceived, 0, datagramPacket.getLength(), StandardCharsets.UTF_8);
            System.out.println("Receive " + reply);
        }
        return reply;
    }
}

