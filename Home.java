import java.util.Scanner;



public class Home {
  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Room R = new Room();
        R.setRoomNumber(101);
        System.out.println("Room"+R.getRoomNumber()+" is Created");
        R.addLight(100,"Philips");
        R.turnLightON(100);
        R.lockDoor();
        R.lightStatus(100);
        System.out.print("The door of the Room "+R.getRoomNumber()+" is ");
        R.doorStatus();
        System.out.println();
        R.addLight(200, "Philips");
        R.turnLightON(200);
        R.turnLightOFF(100);
        R.unlockDoor();
        System.out.println("Room"+R.getRoomNumber()+" has");
        R.printRoomStatus();
    }
}
  