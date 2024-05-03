package KEywords;
// this kwyword ka use hum tab kerte hai jab hume instance variable or  local variable ki value same rakhni ho
// hum this keyword ka use ek refrence variable ke tor par bhi kr skte hao

// Exmple  =: 1. this keyword can be used to  to refre current class intance variable
// create a class 
class Demo{

    // create a instance variable 
    int i;
    //create a methode setvalue naam ka 
    void setvalue(int i){   //<--local variable
       this.i= i;

    }
    // now create a new methode 
    void display(){
        System.out.println(i);

    }


}

public class ThisKeyword {
     public static void main(String[] args) {
         Demo d = new Demo();
         d.setvalue(10);
         d.display();
        
     }
    
}
