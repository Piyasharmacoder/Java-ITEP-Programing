 // Create a class  cellphone with methode to print rining , vibrating " etc ".

class Cellphone{
    // methode 1 
    public void  Ringing (){
        System.out.println("Cellphone  is ringing.");
    } 
    // methode 2
    public void vibrating(){
        System.out.println("Cellphone is vibrating .");
    } 
    // methode 3 
    public void calling (){
        System.out.println("Cellphone is calling .");
    }

}

public class OopsTest2 {
    public static void main(String[] args) {
        Cellphone vivo =new Cellphone();
        vivo.Ringing();
        vivo.calling();
        vivo.vibrating();
        
    }
    
}
