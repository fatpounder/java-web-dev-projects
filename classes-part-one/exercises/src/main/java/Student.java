public class Student {

        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;



        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;

        }

        public static String getGradeLevel(int credits) {
                if (credits <= 29){
                        return "freshman";
                } else if (credits <= 59){
                        return "sophomore";
                } else if (credits <= 89) {
                        return "junior";
                } else {
                        return "senior";
                }
        }

        public void addGrade(int courseCredits, double grade) {
                double totalQualityScore = this.gpa * this.numberOfCredits;
                totalQualityScore += courseCredits * grade;
                this.numberOfCredits += courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }

        // Drop your getters and setters below for the Student class.

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getStudentId() {
                return studentId;
        }

        private void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }


        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String toString() {

                String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
                return studentReport;
        }

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
                return theStudent.getStudentId() == getStudentId();
        }


}
