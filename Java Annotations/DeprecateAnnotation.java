class FirstClass {
    public String message() {
        return "Message from your friend";
    }

    // @Deprecated Annotation: This marks the message method as deprecated. When you
    // use this method, the compiler will generate a warning, indicating that the
    // method is deprecated and may not be suitable for use.
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprected method");
    }
}

public class DeprecateAnnotation {
    public static void main(String[] args) {
        FirstClass obj = new FirstClass();
        System.out.println(obj.message());
        obj.deprecatedMethod();

    }
}
