package home;
import java.util.Scanner;


 public class Door extends Appliance {
  public Door(){
      super();
  }
  
    @Override
    public void printStatus(){
     if (getStatus()){
         System.out.println("locked");
     }   
       else {
        System.out.println("unlocked");

    }
        
    }
    
}   
   