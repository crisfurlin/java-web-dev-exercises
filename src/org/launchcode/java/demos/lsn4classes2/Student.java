package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getGradeLevel() {
        if (numberOfCredits < 30) {
            return "Freshman";
        } else if (numberOfCredits < 60) {
            return "Sophomore";
        } else if (numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        Double currentQualityScore = gpa * numberOfCredits;
        Double qualityScore = courseCredits * grade;
        Double totalQualityScore = qualityScore + currentQualityScore;
        numberOfCredits += courseCredits;
        gpa = totalQualityScore / numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", name, getGradeLevel(), numberOfCredits, gpa);
        return studentReport;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == this.getStudentId();
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Student sally2 = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.equals(sally2));
    }
}
