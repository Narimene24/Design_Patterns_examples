

public class NameRepository implements Container {
 
    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }  
 }