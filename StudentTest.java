import java.math.BigInteger;
import java.util.Arrays;

class Student implements Comparable <Student> {
    private BigInteger studentId;
    private String name;
    private int grade;

    public Student () {
        this.studentId = new BigInteger("");
        this.name = "";
        this.grade = 0;
    }
    public Student(String studentId, String name, int grade) {
        this.studentId = new BigInteger(studentId);
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = new BigInteger(studentId);
    }

    public BigInteger getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        if (this.grade < other.grade) {
            return -1;
        }
        else if (this.grade > other.grade) {
            return 1;
        }
        return 0;
    }
}


public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student("1248015213544", "a", 23);
        stus[1] = new Student("12412", "b", 44);
        stus[2] = new Student("123456","c",12);
        stus[3] = new Student("1235486", "d", 56);
        stus[4] = new Student("5578544","e", 87);
        Arrays.sort(stus);
        for (Student s : stus)
            System.out.println(" studentId: " + s.getStudentId() + " name: " + s.getName() + " grade: " + s.getGrade());
    }
}
