public class Employee {
    private int emp_id;
    private String emp_name;
    private int emp_age;
    private double emp_salary;

    int getEmp_id() {
        return emp_id;
    }
    void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    String getEmp_name() {
        return emp_name;
    }
    void setEmp_name (String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age(int i) {
        return emp_age;
    }
    void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    double getEmp_salary(double v) {
        return emp_salary;
    }
    void setEmp_salary(double empSalary) {
        this.emp_salary = empSalary;
    }
}
class RunEmployee{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_id(12345);
        e.setEmp_name("Gawesh");
        e.setEmp_age(25);
        e.setEmp_salary(567890.987);

        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_name());
        System.out.println(e.getEmp_age(25));
        System.out.println(e.getEmp_salary(567890.987));
    }
}
