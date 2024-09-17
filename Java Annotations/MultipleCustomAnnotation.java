import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Details { // Creating interface with fields to create annotation
    String StudentName();

    int RollNo();

    String Address();

    String Branch();

    double fees();

}

// accessing annoation here and declaring values
@Details(StudentName = "Ramesh", RollNo = 122, fees = 40210.50, Address = "Warangal", Branch = "CSE")
class College {
    String StudentName;
    int RollNo;
    double fees;
    String Address;
    String Branch;

    // Creating constuctor
    public College(String StudentName, int rollNo, double fees, String Address, String Branch) {
        this.StudentName = StudentName;
        this.RollNo = rollNo;
        this.fees = fees;
        this.Address = Address;
        this.Branch = Branch;
    }
}

public class MultipleCustomAnnotation {
    public static void main(String[] args) {
        College CollegeObject = new College("Ramesh", 123, 3213.34, "Karimmnagar", "ECE");
        System.out.println("Name is : " + CollegeObject.StudentName);
        System.out.println("Roll No is: " + CollegeObject.RollNo);
        System.out.println("Fees is : " + CollegeObject.fees);
        System.out.println("Address is : " + CollegeObject.Address);
        System.out.println("Branch is: " + CollegeObject.Branch);

        // Using reflection api concept to access annotation data
        // Acessing and printing the annotation field values
        Class<?> c = CollegeObject.getClass();
        Annotation an = c.getAnnotation(Details.class);
        Details cobj = (Details) an; // typecasting using interface name
        System.out.println("\n");
        System.out.println("Name in Annotation is : " + cobj.StudentName());
        System.out.println("Roll No in annotation is : " + cobj.RollNo());
        System.out.println("Fees in annotation is : " + cobj.fees());
        System.out.println("Address in annotation is :" + cobj.Address());
        System.out.println("Branch in annotation is : " + cobj.Branch());

    }

}
