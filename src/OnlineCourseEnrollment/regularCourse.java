/* Create a subclass called RegularCourse that inherits from Course class and do
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

public class regularCourse extends Course {
    private boolean hasLiveSession;

    public regularCourse(String courseName, String courseID, int durationWeeks) {
        super(courseName, courseID, durationWeeks);
        this.hasLiveSession = false;
    }
    public  regularCourse() {
        super();
        this.hasLiveSession = false;
    }

    public boolean isHasLiveSession() {
        return hasLiveSession;
    }

    public void setHasLiveSession(boolean hasLiveSession) {
        this.hasLiveSession = hasLiveSession;
    }
    @Override
    public double calculateTotalFee() {
        super.calculateTotalFee();
         return 100 * getDurationWeeks();
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("total fee: " + calculateTotalFee());
        System.out.println("total duration: " + getDurationWeeks());
        System.out.println("Live Session: " + hasLiveSession);
        System.out.println("Discounted fee :"+calculateTotalFee(10));


    }
}