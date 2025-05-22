import java.sql.Date;

public class p7t1 {
    
}
class Student{
    long ID;
    String Name;
    String Program;

}
class Instructor{
    long ID;
    String Name;
    String Department;
    String Title;
}
class Course{
    long ID;
    String Title;
    String Syllabus;
    String Credits;
    String Prerequisites;
}

class CourseOffering{
    Student student;
    Course course;
    Instructor instructor;
    int StudentID;
    int InstructorID;
    int CourseID;
    Date Time;
    int SectionNo;
    int RoomId;
    int Year;
    int Semester;
}
