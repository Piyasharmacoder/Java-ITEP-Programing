public class Arrayclonemethod1 implements Cloneable {
    // shellow copy using clone methode 
    int roll_NO;

    
  @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
