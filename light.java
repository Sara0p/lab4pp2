import java.util.Scanner 


public class light extends Appliance {
    private String type ;    
    private int illumination ;
    
    public Light(){
      super();
     type = "";
     illumination = 0;
    } 
    public Light (int i, String t) {
      super(i);
     type = t;
     illumination = 0;
    }

    public String getType() {
        return type;
    }

    public int getIllumination() {
        return illumination;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setIllumination(int il) {
        this.illumination = il;
    }
    
    
    public void IlluminationUP (int status) {
        if(getStatus())
        illumination++;
        System.out.print(illumination);
        
    }
    
       public void IlluminationDown (int status) {
        if(getStatus())
        illumination--;
        System.out.print(illumination);
        
    }
    
}