package Communicator;

import FlyBehaviour.FlyBehaviour;
import FlyBehaviour.MissionDownUpRotate;
import FlyBehaviour.MissionForwardLeft;
import FlyBehaviour.MissionLeftRotateRight;

import java.util.Scanner;


public class Main {
    public static void main(String...args)throws Exception{
        Scanner scan = new Scanner(System.in);
        FlyBehaviour flyBehaviour=null;

        System.out.print("Enter the IP address:");
        String iPAddress = scan.next();

        System.out.print("Enter Port Number:");
        int dronePort = scan.nextInt();

        System.out.println("1. Take off, Move Forward, Move Left, Move Backward, Land");
        System.out.println("2. Take off, Move Down, Move Up, Rotate 360 Clockwise, Land"); //downuprotate
        System.out.println("3. Take off, Move Left, Move 360 Anti Clockwise, Move Right, Land"); //leftrotateright
        System.out.print("Choose a mission (Enter number):");
        int missionNumber= scan.nextInt();

        if(missionNumber==1){
            MissionForwardLeft missionForwardLeft=new MissionForwardLeft();
            flyBehaviour=missionForwardLeft;
        }

        if(missionNumber==2){
            MissionDownUpRotate missionDownUpRotate=new MissionDownUpRotate();
            flyBehaviour= missionDownUpRotate;
        }

        if(missionNumber==3){
            MissionLeftRotateRight missionLeftRotateRight=new MissionLeftRotateRight();
            flyBehaviour= missionLeftRotateRight;
        }

        Flier flier=new Flier();
        flier.initialize(iPAddress, dronePort);
        flier.doMission(flyBehaviour);
    }
}