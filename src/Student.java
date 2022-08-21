import java.util.Objects;
public class Student {
    private String name;
    private int roll;
    private long mobile;
    private String email;
    private long aadhar;

    public Student() {
        name = null;
        roll = 0;
        email = null;
        mobile = 0;
        aadhar = 0;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Student(String email, long mobile, long aadhar) {
        this.email = email;
        this.mobile = mobile;
        this.aadhar = aadhar;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name = " + name + ", Roll No "+ roll + " Email " + email + " mobile " + mobile + "Aadhar" + aadhar;
    }

    public boolean equals(Student student) {
        if (this == student) {
            return true;
        }
        if (student instanceof Student) {
            Student student1 = (Student) student;
            if (this.name.equals(student1.name) && (this.roll == student1.roll && this.email.equals(student1.email)
                    && this.mobile == mobile && this.aadhar == aadhar)){
                return true;
            }
        }
        return true;
    }

    public int hashcode() {
        return Objects.hash(name,roll,email,mobile,aadhar);
    }
}