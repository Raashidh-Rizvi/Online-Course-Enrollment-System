package OnlineCourseEnrollment;

public class regularCourse extends Course {
    private boolean hasLiveSession;

    public regularCourse(String courseName, String courseID, int durationWeeks) {
        super(courseName, courseID, durationWeeks);
        this.hasLiveSession = false;
    }
    public double calculateTotalFee(){

    }


}