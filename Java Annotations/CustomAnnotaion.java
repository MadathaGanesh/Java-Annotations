// when we doesn't have no values means then it is a Marker Interface
// If we have single value means then it is a single value annotion
// If we have two or more values means then it is a Multi value annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Marker Interface
// @interface Smartphone {
// }

//Target and Retention are meta annotations
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// Single Value Annotaion
@interface Smartphone {
    String os();
}

@Smartphone(os = "Android")
class NokiaService {
    String model;
    double size;
    int storage;

    public NokiaService(String model, double size, int storage) {
        this.model = model;
        this.size = size;
        this.storage = storage;
    }

}

public class CustomAnnotaion {
    public static void main(String[] args) {
        NokiaService objectNokiaService = new NokiaService("Nokia mobile", 5.8, 6);
        System.out.println("Model is: " + objectNokiaService.model);
        System.out.println("Size is: " + objectNokiaService.size);
        System.out.println("Storage is: " + objectNokiaService.storage);

        // Use reflection api concept
        Class c = objectNokiaService.getClass();
        Annotation an = c.getAnnotation(Smartphone.class); // Using annotation class
        Smartphone s = (Smartphone) an; // Doing typecasting
        System.out.println("Smart phone OS is :   " + s.os());

    }
}
