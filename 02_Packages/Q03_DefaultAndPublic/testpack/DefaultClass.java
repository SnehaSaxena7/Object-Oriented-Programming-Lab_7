package testpack;

// No access modifier -> package-private (default) class
class DefaultClass {
    public void show() {
        System.out.println("DefaultClass.show() - accessible only inside package testpack.");
    }
}
