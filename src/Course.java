public class Course {
    private String department;
    private int courseNumber;
    private int credits;

    public Course(String dept, int courseNumber, int credits) {
        this.department = dept;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    public boolean equals (Object obj){
        if (obj instanceof Course){
            Course otherCourse = (Course) obj;
            return courseNumber == otherCourse.courseNumber &&
                    department.equals (otherCourse.department) &&
                    credits == otherCourse.credits;
        }else return false;
    }


    public String toString() {
        return this.department + courseNumber + " is " + credits + " credits.";
    }

    public static void main(String[] args) {
        Course Math1 = new Course("Math ", 201, 4);
        Course Math2 = new Course("Math ", 204, 4);
        System.out.println(Math1 == Math2);
    }
}
