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
        return calculateTotalFee()+ (discount*calculateTotalFee());
    }

}
