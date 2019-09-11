package Communicator;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Socket {
    private int dronePort;
    private InetAddress droneAddress;
    private DatagramSocket udpClient =  new DatagramSocket();
    private DatagramPacket datagramPacket;
//    String request= null;
    private String reply = null;


    public Socket(String iPAddress, int dronePort) throws Exception{
        droneAddress = InetAddress.getByName(iPAddress);
        this.dronePort= dronePort;
        udpClient.setSoTimeout(1000);

   /*     int maxRetries = 3;
        while (maxRetries > 0){
        sendRequest("command");
        String reply= receiveRequest();
            if (reply.equals("ok")) {
                System.out.println("Entering command mode.. \nSending mission commands.");
                break;
            }
            System.out.println("Remaining retries: " + maxRetries);
            maxRetries--;
        }*/ //Is this more logical?
    }

    public void sendRequest(String request) throws Exception{
        byte[] bytesToSent = request.getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytesToSent, bytesToSent.length, droneAddress, dronePort);
        udpClient.send(datagramPacket);
        System.out.println("Sent " + request + " bytes to Drone"); // with address " + droneAddress.toString() + ":" + dronePort);
    }

    public String receiveRequest() throws Exception{
        byte[] bytesReceived = new byte[64];
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
            System.out.println(reply + " received.");
        }
        return reply;
    }

    public InetAddress getDroneAddress() {
        return droneAddress;
    }
}

