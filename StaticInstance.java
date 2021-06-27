import java.io.*;
 
class Var {
 
    String name = "";
 
    // Instance method to be called within the
    // same class or from a another class defined
    // in the same package or in different package.
    public void geek(String name) { this.name = name; }
}
 
class StaticInstance {
    public static void main(String[] args)
    {
 
        // create an instance of the class.
        Var ob = new Var();
 
        // calling an instance method in the class 'Var'.
        ob.geek("Ramakrishna");
        System.out.println(ob.name);
    }
}