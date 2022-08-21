import java.util.Objects;
public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Mikail Rasheed",21);
        Student student2 = new Student("mika123@akmail.com", 987654321, 2134567890);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("hash code object 1" + student.hashcode());
        System.out.println("hash code object 2" + student1.hashcode());
        System.out.println("hash code object 3" + student2.hashcode());

        if (student1.equals(student2)) {
            System.out.println("Similar");
        } else {
            System.out.println("different");
        }
    }
}
