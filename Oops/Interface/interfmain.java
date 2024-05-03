package Interface;

interface Camera{
    void takePicture();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("this is defalut interface ..");
    }

}
interface wifi{
    String[]getNetwork();
    void ConnectToNetwork(String network);

} 
// class1 
class MyCellPhone{
     void CallNumber(int phoneNumber){
        System.out.println("Calling this Number  : "+ phoneNumber);
     }
     void pickCall(){
        System.out.println("Connecting Call..");
     }
}
// class 2 
class MySmartphone2 extends MyCellPhone implements wifi, Camera{
    public void takePicture(){
        System.out.println("Taking Picture");
    }
    public void recordvideo(){
        System.out.println("Recording Video");
    }
    public String[]getNetwork(){
        System.out.println("Getting  list of Networks .. \n");
         String[] networklist = {"boat2550ro","Piya123","goblenetwork13"};
         return networklist;
    }
    public void ConnectToNetwork(String network){
        System.out.println("Connecting to : "+network);


    }
    // defalut changing network 
    public void record4kvideo(){
        System.out.println("Recording 4K Video by default override changes ");
    }
}


// main class 
public class interfmain {
    
    public static void main(String[] args) {
        // createing and calling methode  
        // now we can access and  use all mwthodes and funtion using  mySmartphone  ms  =  new mySmartphone();

        MySmartphone2 ms = new MySmartphone2();
        String[]arr = ms.getNetwork();
        for(String item: arr){
            System.out.println(item);
        }
        ms.CallNumber(917456676);
        ms.pickCall();

    

        System.out.println("\n ________________________________________________________\n");

        // using polymorphism 
        // now we can only access camera functionaility not access anther methode or funtions
        Camera g = new MySmartphone2();
        g.takePicture();
        g.recordvideo();
        g.record4kvideo();


        System.out.println("___________________________________________________________________\n");
        // only accse wifi fountionlyt or methode 
        wifi h = new MySmartphone2();
        h.getNetwork();
        h.ConnectToNetwork("boat2550ro");
        h.ConnectToNetwork("Piya123");
        h.ConnectToNetwork("goblenetwork13");



        
    }
}
