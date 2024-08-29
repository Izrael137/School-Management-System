package school.management.system;

/*
* This class is responsible for keeping track
* of students, their names, and fees.
* */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * What to initialize when creating a new student.
     * $11,050 per school year for these students.
     * Fees paid are by default $0.
     * @param id unique id for the student
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 11050;
    }

    // Variables name and id do not need to be changed

    /**
     * Used to update the student's grade.
     * @param grade initialize a new grade for a student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the fees paid
     * The school receives the funds.
     * @param fees the fees needed to be paid
     */

    public void updateFeesPaid(int fees) {
        feesPaid = feesPaid + fees;
    }

}
