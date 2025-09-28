class student{
    public static void main(String[] args) {
        Student1 s=new Student1(11,"sai","java",5000);
        System.out.println(s.getDue());
    }
}
class Student1 {
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    private static final double JAVA_FEE = 10000;
    private static final double PYTHON_FEE = 7500;

    public Student1(int admin_no, String stu_name, String course_joined, double fees_paid) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = (course_joined == null) ? "JAVA" : course_joined.toUpperCase();
        this.fees_paid = fees_paid;
    }

    public double getTotalFee() {
        if (course_joined.equals("PYTHON")) {
            return PYTHON_FEE;
        }
        return JAVA_FEE;
    }

    public double getFeePaid() {
        return fees_paid;
    }

    public double getDue() {
        return getTotalFee() - fees_paid;
    }

    public void payment(double amount) {
        if (fees_paid + amount <= getTotalFee()) {
            fees_paid += amount;
        } else {
            System.out.println("Payment exceeds total fee!");
        }
    }

    public void display() {
        System.out.println("Admin: " + admin_no + " Name: " + stu_name + " Course: " + course_joined +
                " Paid: " + fees_paid + " Due: " + getDue());
    }
}
