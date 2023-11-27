import java.util.ArrayList;

public class Course {

    private String subject;
    private String instructor;
    private int roomNumber;
    private ArrayList<Student> enrolledStudents;


    private Course(String subject, String instructor, int roomNumber, ArrayList<Student> enrolledStudents) {
        this.subject = subject;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
        this.enrolledStudents = enrolledStudents;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
