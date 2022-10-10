
/*
Create a Triplet class that encapsulates three objects of the same data type in a given 
instance of Triplet
name:haril ankleshwariya
ID:21ce003

 */
class Triplet<T> {
    //a generic class which can hold data of type T.
    private T object1;
    private T object2;
    private T object3;
    
    //inside this type's object we have three other objects of type T.
    //that means we have encapsukated three objects inside one single object
    public Triplet(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }
    
    public T getObject1() {
        return object1;
    }
    
    public T getObject2() {
        return object2;
    }
    
    public T getObject3() {
        return object3;
    }
}
public class pr11 {
    public static void main(String[] args) {
        Triplet<String> triplet = new Triplet<>("Hii", "kaumil", "!");
        //passing Stirng as T in which it can hold Hello World and !
        System.out.println(triplet.getObject1());
        System.out.println(triplet.getObject2());
        System.out.println(triplet.getObject3());

    }
}
