package Encapsulation;

class karmchari{
     private int karmid;
     // use getter and setter methode
     public int getKarmid(){
         return karmid;
     }
    //  setter methode
     public void setkramid(int empid){
         this.karmid = empid;
     }


    String karmName;
    // use getter and setter methode
    public String getkarmName(){
        return karmName;
    }
    // setter methode
    public void setkarmName(String emplName){
        this.karmName= emplName;
    }
}

public class Encap {
     public static void main(String[] args) {
        karmchari id =  new karmchari();
        id.setkramid(38);  
        id.setkarmName( "Piya" );
        System.out.println("Id   : "+id.getKarmid());
        System.out.println("Name : "+id.getkarmName());
     }
    
}
