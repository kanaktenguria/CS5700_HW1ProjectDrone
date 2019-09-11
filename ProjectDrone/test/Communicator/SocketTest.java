package Communicator;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;

import static org.junit.jupiter.api.Assertions.*;

class SocketTest {
    Socket socket;

    @Test
    public void TestSocketConstructor() throws Exception {
        socket= new Socket("127.0.0.1",8889);
        assertEquals(InetAddress.getByName("127.0.0.1"),socket.getDroneAddress());

    }
    @Test
    public void TestSendAndReceiveMethod() throws Exception {
        socket= new Socket("127.0.0.1",8889);
        socket.sendRequest("command");
        socket.receiveRequest();
        assertEquals("ok",socket.receiveRequest());
    }
}