import java.net.InetAddress;
import java.util.Scanner;

public class Main {
    public static void main(String...args)throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the IP address:");
        String iPAddress = scan.next();
        System.out.print("Enter Port Number:");
        int dronePort = scan.nextInt();
        System.out.println("1. Take off, Move Forward, Move Left, Move Backward, Land");
        System.out.println("2. Take off, Move Down, Move Up, Rotate 360 Clockwise, Land"); //downuprotate
        System.out.println("3. Take off, Move Left, Move 360 Anti Clockwise, Move Right, Land"); //leftrotateright
        System.out.print("Choose a mission (Enter number):");
        int missionNumber= scan.nextInt();
        Flier flier=new Flier(iPAddress, dronePort, missionNumber);
        flier.doMission();
    }
}
