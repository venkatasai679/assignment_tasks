class Employee1 {
    protected int emp_id;
    protected String emp_name;

    public Employee1(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.err.println(" Name: " + emp_name);
    }
}

// Subclass
class FactoryEmployee extends Employee1{
    private int bus_no;
    private String emp_boards;

    public FactoryEmployee(int emp_id, String emp_name, int bus_no, String emp_boards) {
        super(emp_id, emp_name);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bus No: " + bus_no);
        System.out.println(" Boarding Point: " + emp_boards);
    }
}
class Employee{
    public static void main(String[] args) {
        FactoryEmployee f=new FactoryEmployee(11,"sai",12,"vizag");
        f.display();

    }
}

