/* Implement an Online Course Enrollment System that manages different types of
 courses and calculates the total course fees for students. The platform offers both Regular
 Courses and Premium Courses. Premium courses include additional certification services,
 while regular courses do not.
 a) Create a class called Course with courseID (String), courseName (String), and
 durationWeeks (int) as attributes.
 b) Create a default constructor and a parameterized constructor to assign all details
 of a Course.
 c) Implement a method called displayCourseDetails() to print course information.
 d) Implement method overloading as below.
 i. Implement calculateTotalFee() with no parameters to return 10000.00as the
 basic course fee.
 ii. Overload calculateTotalFee method with one double parameter as discount
Percentage to calculate the total fee using the discount value.
 [Hint: call the calculateTotalFee() method get the basic course fee]
 e) Create a subclass called RegularCourse that inherits from Course class and do
 followings.
 i. Add an additional attribute hasLiveSessions (boolean) to indicate whether live
 sessions are included.
 ii. Implement a default constructor and a parameterized constructor constructor
 to assign all details of a Regular Course (including coursed, courseName and
 durationWeeks).
 iii. Override the calculateTotalFee() method to compute the total fee as;
 Total Fee = 100 × durationWeeks
 iv. Override the displayCourseDetails() method to display all the details including
 the total fee and live session status.*/

package OnlineCourseEnrollment;

public class Course {
    private String courseName;
    private String courseID;
    private int durationWeeks;

    public Course() {
    }

    public Course(String courseName, String courseID, int durationWeeks) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.durationWeeks = durationWeeks;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseID);
        System.out.println("Duration Weeks: " + durationWeeks);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public void setDurationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
    }

    public double calculateTotalFee(){
        return 10000;

    }

    public double calculateTotalFee (double discount){
        return calculateTotalFee()- (discount*calculateTotalFee()/100);
    }

}
