package KEywords;
//6. this keyword can be used to return the current class instance from the method 


class thisDemo6{
    // cretare a constructor
    thisDemo6 d1(){
        return this;

    }
}
 
public class Use6_Exmple {
    public static void main(String[] args) {
        thisDemo6 D1 = new  thisDemo6();
        D1.d1();
    }
    
}
 