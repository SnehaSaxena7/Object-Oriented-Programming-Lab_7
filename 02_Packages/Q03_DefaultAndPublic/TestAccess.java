import testpack.PublicClass;
// import testpack.DefaultClass;   // ERROR: testpack.DefaultClass is not public in testpack;
//                                 //        cannot be accessed from outside package

public class TestAccess {
    public static void main(String[] args) {
        PublicClass p = new PublicClass();
        p.show();                       // Works

        // DefaultClass d = new DefaultClass();   // COMPILE ERROR - uncomment to observe:
        // d.show();                              // "DefaultClass is not public in testpack;
        //                                        //  cannot be accessed from outside package"

        System.out.println("Observation: public class is accessible, default class is NOT.");
    }
}
