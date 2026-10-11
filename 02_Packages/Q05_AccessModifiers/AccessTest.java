import demo.AccessDemo;

public class AccessTest {

    // Subclass OUTSIDE the package -> can access protected members via inheritance
    static class Child extends AccessDemo {
        void test() {
            System.out.println("Child (subclass) accessing protectedVar = " + protectedVar);
            protectedMethod();
        }
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // 1. public     -> accessible
        System.out.println("publicVar = " + obj.publicVar);
        obj.publicMethod();

        // 2. protected  -> NOT accessible via object reference outside package
        // System.out.println(obj.protectedVar);   // ERROR
        // obj.protectedMethod();                   // ERROR

        // 3. default    -> NOT accessible outside package
        // System.out.println(obj.defaultVar);      // ERROR
        // obj.defaultMethod();                     // ERROR

        // 4. private    -> NOT accessible outside the class
        // System.out.println(obj.privateVar);      // ERROR
        // obj.privateMethod();                     // ERROR

        // protected IS accessible through inheritance:
        new Child().test();

        System.out.println("\nSummary (outside package): public=YES, protected=only via subclass, default=NO, private=NO");
    }
}
