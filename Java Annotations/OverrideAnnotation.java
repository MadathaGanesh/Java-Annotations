class firstClass {
    public void ShowMethod() {
        System.out.println("Method which is not overriden in firstclass ");
    }

}

class SecondClass extends firstClass {

    // Use @override annotation to overide the method
    @Override
    public void ShowMethod() {
        System.out.println("Method which is overriden in secondclass");
    }
}

class OverrideAnnotation {
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        obj.ShowMethod();
    }
}