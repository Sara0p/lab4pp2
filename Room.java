import java.util.Scanner;


public class Room {
   private  int roomNumber;
    private Light [] light = new Light[3];
     private Door door;
     public static int countLight= 0;
     
     
      public Room (){
         roomNumber=0;
         
      	   for(int i=0; i<light.length; i++){
              light[i]= new Light();
          }
           door= new Door();
     }
     
      public Room (int num){
          roomNumber=num;
            for(int i=0; i<light.length ; i++){
              light[i]= new Light();
          }
           door= new Door();   
      } 
      public void addLight(int m, String s){
           boolean found =false;
    for(int i=0; i<countLight; i++){
        if(light[i].getId()==m)
        found=true;
    }
    if(!found)
    {
        light[countLight].setId(m);
        light[countLight].setType(s);
        
        countLight++;
    }
    turnLightON(m);
      }
        public void turnLightON(int m) {
        for(int i=0; i<countLight; i++){
            if(light[i].getId()==m)
            light[i].setStatus(true);
        }
    }
        public void turnLightOFF(int m) {
        for(int i=0; i<countLight; i++){
            if(light[i].getId()==m)
            light[i].setStatus(false);
        }
    }
        public void Uplighting(int degree)
    {
        for(int i=0; i<countLight; i++){
            light[i].IlluminationUP(degree);
        }
    } 
          public void Downlighting(int degree)
    {
        for(int i=0; i<countLight; i++){
            light[i].IlluminationDown(degree);
        }
    } 
            public void lockDoor() {
       
           door.setStatus(true);
    }
     public void unlockDoor(){
   
           door.setStatus(false);
    }        
      public boolean doorStatus () {
        if(door.getStatus())
         System.out.print("Locked");
       else 
        System.out.print("UNLocked");

          return door.getStatus();
    }
    public boolean lightStatus(int id){
        for(int i=0; i<countLight; i++){
            if(light[i].getId()==id)
                return light[i].getStatus();
        }
    return false;
    }
     public void printRoomStatus (){
        for(int i=0; i<countLight; i++){
        System.out.print(light[i].getType()+light[i].getId()+"  ");
            light[i].printStatus();
        }
        System.out.print("and the door is ");
        door.printStatus();
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}  
