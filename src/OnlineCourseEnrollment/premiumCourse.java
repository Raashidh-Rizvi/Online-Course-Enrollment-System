/*
 Create another subclass called PremiumCourse that inherits from Course and do
 followings.
 i. Add an additional attribute called includeCertification (boolean).
 ii. Implement a default constructor and a parameterized constructor constructor
 to assign all details of a Premium Course (including coursed, courseName and
 durationWeeks).
 iii. Override the calculateTotalFee() method to compute the total fee as;
 Total Fee = (150 × durationWeeks) + (Certification Fee of $50 if includeCertification is true)
 iv. Override the displayCourseDetails() method to include the total fee and cer
tification status.* */
package OnlineCourseEnrollment;

public class premiumCourse extends Course {
    private boolean includeCertification;
    private double certificationFee;

    public premiumCourse(String courseName, String courseID, int durationWeeks) {
        super(courseName, courseID, durationWeeks);
        this.includeCertification = false;
    }
    public premiumCourse() {
        super();
        this.includeCertification = false;
    }

    public boolean isIncludeCertification() {
        return includeCertification;
    }

    public void setIncludeCertification(boolean includeCertification) {
        this.includeCertification = includeCertification;
    }
    @Override
    public double calculateTotalFee() {
        if (isIncludeCertification()){
            certificationFee= 50;
        }
        else certificationFee= 0;

        return 150 * getDurationWeeks()+certificationFee;
    }
    @Override
    public void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("total fee: " + calculateTotalFee());
        System.out.println("Certification Included: " + isIncludeCertification());
        System.out.println("Discounted fee :"+calculateTotalFee(20));
    }



}
