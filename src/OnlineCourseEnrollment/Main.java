/*
 i. Create one object from RegularCourse using the default constructor.
 ii. Create one PremiumCourse object using parameterized constructors.
 iii. Call both overloaded versions of calculateTotalFee() for the objects.
 iv. Display all course details using the overridden displayCourseDetails() method

**/


package OnlineCourseEnrollment;

public class Main {
    public static void main(String[] args) {
        regularCourse course1 = new regularCourse();
        premiumCourse course2 = new premiumCourse("Pharamtical","Pharm001",6);

        course2.setIncludeCertification(true);
        course1.setHasLiveSession(true);


        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();





    }



}